


/* name bt--------- bdescuela
create table Alumnos(
id SERIAL not null primary key,
    nombres varchar(50),
    apellidos varchar(50)
);
/INSERTAR/
insert into Alumnos(nombres,apellidos) values ('Julio','Añacata');
x
/MOSTRAR/
select * from Alumnos;

/Actualizar/
UPDATE Alumnos SET nombres= 'Carlos',apellidos='Buluarte' WHERE Alumnos.id=1

/ELIMINAR/
DELETE FROM Alumnos WHERE Alumnos.id=2

*/