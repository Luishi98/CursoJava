-- Ejercicio Extra 2

-- Tablas
SELECT * FROM cliente;
SELECT * FROM detalle_pedido;
SELECT * FROM empleado;
SELECT * FROM gama_producto;
SELECT * FROM oficina;
SELECT * FROM pago;
SELECT * FROM pedido;
SELECT * FROM producto;

-- 1. Devuelve un listado con el código de oficina y la ciudad donde hay oficinas.
SELECT codigo_oficina AS Codigo, ciudad FROM oficina;
-- 2. Devuelve un listado con la ciudad y el teléfono de las oficinas de España.
SELECT ciudad, telefono FROM oficina WHERE pais = "España";
-- 3. Devuelve un listado con el nombre, apellidos y email de los empleados cuyo jefe tiene un código de jefe igual a 7.
SELECT nombre, apellido1, apellido2, email FROM empleado WHERE codigo_jefe = 7;
-- 4. Devuelve el nombre del puesto, nombre, apellidos y email del jefe de la empresa.
SELECT puesto, nombre, apellido1, apellido2, email FROM empleado WHERE codigo_jefe IS NULL;
-- 5. Devuelve un listado con el nombre, apellidos y puesto de aquellos empleados que no sean representantes de ventas.
SELECT nombre, apellido1, apellido2, puesto FROM empleado WHERE puesto != "Representante Ventas";
-- 6. Devuelve un listado con el nombre de los todos los clientes españoles.
SELECT nombre_cliente FROM cliente WHERE pais = "Spain";
-- 7. Devuelve un listado con los distintos estados por los que puede pasar un pedido.
SELECT DISTINCT estado FROM pedido;
-- 8. Devuelve un listado con el código de cliente de aquellos clientes que realizaron algún pago en 2008. 
--    Tenga en cuenta que deberá eliminar aquellos códigos de cliente que aparezcan repetidos. 
--    Resuelva la consulta:
-- 		o Utilizando la función YEAR de MySQL.
SELECT DISTINCT codigo_cliente AS Año FROM pago WHERE YEAR(fecha_pago) = 2008;
-- 		o Utilizando la función DATE_FORMAT de MySQL.
SELECT DISTINCT codigo_cliente FROM pago WHERE DATE_FORMAT(fecha_pago, '%Y') = '2008';
-- 		o Sin utilizar ninguna de las funciones anteriores.
SELECT DISTINCT codigo_cliente FROM pago WHERE fecha_pago LIKE "%2008%";
-- 9. Devuelve un listado con el código de pedido, código de cliente, fecha esperada y fecha de entrega de los pedidos que no han sido entregados a tiempo.
SELECT codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega FROM pedido WHERE fecha_entrega > fecha_esperada;
-- 10. Devuelve un listado con el código de pedido, código de cliente, fecha esperada y fecha de entrega de los pedidos cuya fecha de 
--     entrega ha sido al menos dos días antes de la fecha esperada.
-- 		o Utilizando la función ADDDATE de MySQL.
SELECT codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega FROM pedido WHERE fecha_esperada >= ADDDATE(fecha_entrega, INTERVAL 2 DAY);
-- 		o Utilizando la función DATEDIFF de MySQL.
SELECT codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega FROM pedido WHERE DATEDIFF(fecha_esperada, fecha_entrega) >= 2;
-- 11. Devuelve un listado de todos los pedidos que fueron rechazados en 2009.
SELECT * FROM pedido WHERE estado = "Rechazado" AND YEAR(fecha_esperada) = 2009;
-- 12. Devuelve un listado de todos los pedidos que han sido entregados en el mes de enero de cualquier año.
SELECT * FROM pedido WHERE estado = "Entregado" AND MONTH(fecha_entrega) = 1;
-- 13. Devuelve un listado con todos los pagos que se realizaron en el año 2008 mediante Paypal. Ordene el resultado de mayor a menor.
SELECT * FROM pago WHERE forma_pago = "PayPal" AND YEAR(fecha_pago) = 2008 ORDER BY total;
-- 14. Devuelve un listado con todas las formas de pago que aparecen en la tabla pago. Tenga en cuenta que no deben aparecer formas de pago repetidas.
SELECT DISTINCT forma_pago FROM pago;
-- 15. Devuelve un listado con todos los productos que pertenecen a la gama Ornamentales y que tienen más de 100 unidades en stock. 
--     El listado deberá estar ordenado por su precio de venta, mostrando en primer lugar los de mayor precio.
SELECT * FROM producto WHERE gama = "Ornamentales" AND cantidad_en_stock > 100 ORDER BY precio_venta DESC;
-- 16. Devuelve un listado con todos los clientes que sean de la ciudad de Madrid y cuyo representante de ventas tenga el código de empleado 11 o 30.
SELECT * FROM cliente WHERE ciudad = "Madrid" AND codigo_empleado_rep_ventas IN (11, 30);

-- Consultas multitabla (Composición interna)
-- Las consultas se deben resolver con INNER JOIN.
-- 1. Obtén un listado con el nombre de cada cliente y el nombre y apellido de su representante de ventas.
SELECT c.nombre_cliente AS Cliente, e.nombre AS "Nombre Representante", e.apellido1 AS "Apellido Representante" 
FROM cliente c
INNER JOIN empleado e
ON c.codigo_empleado_rep_ventas = e.codigo_empleado;
-- 2. Muestra el nombre de los clientes que hayan realizado pagos junto con el nombre de sus representantes de ventas.
SELECT c.nombre_cliente AS Cliente, e.nombre AS Empleado 
FROM cliente c 
INNER JOIN pago p ON p.codigo_cliente = c.codigo_cliente 
INNER JOIN empleado e ON c.codigo_empleado_rep_ventas = e.codigo_empleado;
-- 3. Muestra el nombre de los clientes que no hayan realizado pagos junto con el nombre de sus representantes de ventas.
SELECT c.nombre_cliente AS Cliente, e.nombre AS Empleado
FROM cliente c
LEFT JOIN pago p ON p.codigo_cliente = c.codigo_cliente
INNER JOIN empleado e ON c.codigo_empleado_rep_ventas = e.codigo_empleado
WHERE p.id_transaccion IS NULL;
-- 4. Devuelve el nombre de los clientes que han hecho pagos y el nombre de sus representantes
--    junto con la ciudad de la oficina a la que pertenece el representante.
SELECT c.nombre_cliente AS Cliente, e.nombre AS Empleado, o.codigo_oficina AS Oficina 
FROM cliente c 
INNER JOIN pago p ON p.codigo_cliente = c.codigo_cliente 
INNER JOIN empleado e ON c.codigo_empleado_rep_ventas = e.codigo_empleado
INNER JOIN oficina o ON e.codigo_oficina = o.codigo_oficina;
-- 5. Devuelve el nombre de los clientes que no hayan hecho pagos y el nombre de sus
--    representantes junto con la ciudad de la oficina a la que pertenece el representante.
SELECT c.nombre_cliente AS Cliente, e.nombre AS Empleado, o.codigo_oficina AS Oficina 
FROM cliente c
LEFT JOIN pago p ON p.codigo_cliente = c.codigo_cliente
INNER JOIN empleado e ON c.codigo_empleado_rep_ventas = e.codigo_empleado
INNER JOIN oficina o ON e.codigo_oficina = o.codigo_oficina
WHERE p.id_transaccion IS NULL;
-- 6. Lista la dirección de las oficinas que tengan clientes en Fuenlabrada.
SELECT o.linea_direccion1, o.linea_direccion2 FROM oficina o 
INNER JOIN empleado e ON e.codigo_oficina = o.codigo_oficina
INNER JOIN cliente c ON c.codigo_empleado_rep_ventas = e.codigo_empleado
WHERE c.ciudad = "Fuenlabrada";
-- 7. Devuelve el nombre de los clientes y el nombre de sus representantes junto con la ciudad de la oficina a la que pertenece el representante.
SELECT c.nombre_cliente AS Cliente, e.nombre AS "Representante Ventas", o.ciudad AS "Ciudad-Oficina"
FROM cliente c
INNER JOIN empleado e ON c.codigo_empleado_rep_ventas = e.codigo_empleado
INNER JOIN oficina o ON e.codigo_oficina = o.codigo_oficina;
-- 8. Devuelve un listado con el nombre de los empleados junto con el nombre de sus jefes.
SELECT e1.nombre AS Empleado, e2.nombre AS Jefe FROM empleado e1 INNER JOIN empleado e2 ON e1.codigo_jefe = e2.codigo_empleado;
-- 9. Devuelve el nombre de los clientes a los que no se les ha entregado a tiempo un pedido.
-- 10. Devuelve un listado de las diferentes gamas de producto que ha comprado cada cliente.