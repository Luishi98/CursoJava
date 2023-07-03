-- Todo lo anterior lo perdi porque se me corto la luz y no lo voy a volver a hacer ahora
-- ...
-- 26. Hallar los departamentos que no tienen empleados
SELECT departamentos.id_depto, departamentos.nombre_depto
FROM departamentos
LEFT JOIN empleados ON departamentos.id_depto = NULL;

-- Consulta con Subconsulta

-- 28. Mostrar la lista de los empleados cuyo salario es mayor o igual que el promedio de la empresa. Ordenarlo por departamento.
SELECT nombre AS Nombre, sal_emp AS Salario FROM empleados WHERE sal_emp >= (SELECT AVG(sal_emp) FROM empleados);
