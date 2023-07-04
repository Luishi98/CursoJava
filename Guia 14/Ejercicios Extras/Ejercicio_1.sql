-- Ejercicio Extra 1 <nba.sql/>
-- Tablas
SELECT * FROM equipos;
SELECT * FROM estadisticas;
SELECT * FROM jugadores;
SELECT * FROM partidos;
-- 1. Mostrar el nombre de todos los jugadores ordenados alfabéticamente.
SELECT Nombre FROM jugadores ORDER BY Nombre;
-- 2. Mostrar el nombre de los jugadores que sean pivots (‘C’) y que pesen más de 200 libras, ordenados por nombre alfabéticamente.
SELECT Nombre FROM jugadores WHERE Posicion LIKE "%C%" AND Peso > 200;
-- 3. Mostrar el nombre de todos los equipos ordenados alfabéticamente.
SELECT Nombre FROM equipos ORDER BY Nombre;
-- 4. Mostrar el nombre de los equipos del este (East).
SELECT Nombre FROM equipos WHERE Conferencia = "East";
-- 5. Mostrar los equipos donde su ciudad empieza con la letra ‘c’, ordenados por nombre.
SELECT Nombre FROM equipos WHERE Ciudad LIKE "C%";
-- 6. Mostrar todos los jugadores y su equipo ordenados por nombre del equipo.
SELECT Nombre, Nombre_equipo AS Equipo FROM jugadores ORDER BY Equipo;
-- 7. Mostrar todos los jugadores del equipo “Raptors” ordenados por nombre.
SELECT Nombre FROM jugadores WHERE Nombre_equipo = "Raptors" ORDER BY Nombre_equipo;
-- 8. Mostrar los puntos por partido del jugador ‘Pau Gasol’.
SELECT ROUND(SUM(Puntos_por_partido), 2) AS PPP FROM estadisticas WHERE jugador = (SELECT codigo FROM jugadores WHERE Nombre = "Pau Gasol");
-- 9. Mostrar los puntos por partido del jugador ‘Pau Gasol’ en la temporada ’04/05′.
SELECT Puntos_por_partido AS PPP FROM estadisticas WHERE jugador = (SELECT codigo FROM jugadores WHERE Nombre = "Pau Gasol") AND temporada = "04/05";
-- 10. Mostrar el número de puntos de cada jugador en toda su carrera.
SELECT jugador, ROUND(SUM(Puntos_por_partido), 2) AS PPP FROM estadisticas GROUP BY jugador;
-- 11. Mostrar el número de jugadores de cada equipo.
SELECT Nombre_equipo AS Equipo, COUNT(Nombre_equipo) AS Jugadores FROM jugadores GROUP BY Nombre_equipo;
-- 12. Mostrar el jugador que más puntos ha realizado en toda su carrera.
SELECT jugador, ROUND(SUM(Puntos_por_partido), 2) AS PPP FROM estadisticas GROUP BY jugador ORDER BY PPP DESC LIMIT 1;
-- 13. Mostrar el nombre del equipo, conferencia y división del jugador más alto de la NBA.
SELECT j.Nombre AS Jugador, j.Altura, e.Nombre AS Equipo, e.Conferencia, e.Division FROM equipos e INNER JOIN jugadores j ON j.Nombre_equipo = e.Nombre ORDER BY j.Altura DESC LIMIT 1;
-- 14. Mostrar el partido o partidos (equipo_local, equipo_visitante y diferencia) con mayor diferencia de puntos.
SELECT equipo_local, equipo_visitante, ABS(puntos_local - puntos_visitante) AS Diferencia 
FROM partidos 
WHERE ABS(puntos_local - puntos_visitante) = 
(SELECT MAX(ABS(puntos_local - puntos_visitante)) FROM partidos);
-- 15. Mostrar quien gana en cada partido (codigo, equipo_local, equipo_visitante, equipo_ganador), en caso de empate sera null.
SELECT codigo, equipo_local AS Local, equipo_visitante AS Visitante, 
	CASE 
        WHEN equipo_local > equipo_visitante THEN equipo_local 
        WHEN equipo_visitante > equipo_local THEN equipo_visitante
        ELSE NULL
    END AS Ganador
FROM partidos;