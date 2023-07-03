-- a) Ahora veamos cómo ha quedado la tabla “superheroes” que creaste anteriormente. Para ello necesitarás una consulta de tipo SELECT.

SELECT * FROM personajes;

-- b) b) Realiza una consulta que devuelva todos los valores de la columna “nombre_real” de la tabla superhéroe.

SELECT nombre_real FROM personajes;

-- c) Realiza una consulta que devuelva todos los nombres reales de los personajes cuyo nombre empieza con “B”

SELECT nombre_real FROM personajes WHERE nombre_real LIKE 'b%';
