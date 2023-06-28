-- Inserto valores en la tabla creador

-- a) Primero insertar en la tabla “creador” los siguientes datos:

INSERT INTO creador (nombre) VALUES ('Marvel');
INSERT INTO creador (nombre) VALUES ('DC Comics');

-- Inserto valores en la tabla de personajes

-- b) Ahora, continuaremos insertando registros en la tabla personaje

INSERT INTO personajes (nombre_real, personaje, inteligencia, fuerza, velocidad, poder, aparicion, ocupacion, id_creador) 
VALUES ('Bruce Banner', 'Hulk', 160, '600 mil', 75, 98, 1962, 'Fisico Nuclear', 1),
('Tony Stark', 'Iron Man', 170, '200 mil', 70, 123, 1963, 'Inventor Industrial', 1),
('Thor Odison', 'Thor', 145, 'infinita', 100, 235, 1962, 'Rey de Asgard', 1),
('Wanda Maximoff', 'Bruja Escarlata', 170, '100 mil', 90, 345, 1964, 'Bruja', 1),
('Carol Danvers', 'Capitana Marvel', 157, '250 mil', 85, 128, 1968, 'Oficial de inteligencia', 1),
('Thanos', 'Thanos', 170, 'infinita', 40, 306, 1973, 'Adorador de la muerte', 1),
('Peter Parker', 'Spiderman', 165, '25 mil', 80, 74, 1962, 'Fotografo', 1),
('Steve Rogers', 'Capitan America', 145, '600', 45, 60, 1941, 'Oficial Federal', 1),
('Bobby Drake', 'Ice Man', 140, '2 mil', 64, 122, 1963, 'Contador', 1),
('Barry Allen', 'Flash', 160, '10 mil', 120, 168, 1956, 'Cientifico forense', 2),
('Bruce Wayne', 'Batman', 170, '500', 32, 47, 1939, 'Hombre de negocios', 2),
('Clark Kent', 'Superman', 165, 'infinita', 120, 182, 1948, 'Reportero', 2),
('Diana Prince', 'Mujer Maravilla', 160, 'infinita', 95, 127, 1949, 'Princesa guerrera', 2);

-- Consulto las tablas completas de creador y personajes

SELECT * FROM creador;
SELECT * FROM personajes;

-- a) Cambiar en la tabla personajes el año de aparición a 1938 del personaje Superman.

UPDATE personajes SET aparicion = 1938 WHERE personaje = 'Superman' AND id_personaje = 12;

-- b) Eliminar el registro que contiene al personaje Flash. 

DELETE FROM personajes
WHERE personaje = 'Flash' AND id_personaje = 10;
