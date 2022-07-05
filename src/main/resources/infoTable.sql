drop all objects;

-- School table creation
create table school (
    id bigint primary key,
    name varchar(100) not null
);

-- Course table creation 
create table course (
    id bigint primary key,
    grade smallint not null,
    classroom varchar(10) not null,
    id_school bigint not null
);

-- Teacher table creation 
create table teacher (
    id bigint primary key,
    name varchar(100) not null
);

-- Student Table creation 
create table student (
    id bigint primary key,
    name varchar(100) not null
);

-- Subject table creation 
create table subject (
    id bigint primary key,
    name varchar(100) not null,
    id_teacher bigint not null,
    id_course bigint not null
);

-- Student_subject table creation 
create table student_subject (
    id_student bigint,
    id_subject bigint
);

-- Foreing key of school on table course
alter table course add foreign key (id_school) references school(id);

-- Foreing key of teacher on table subject
alter table subject add foreign key (id_teacher) references teacher(id);

-- Foreing key of course on table subject
alter table subject add foreign key (id_course) references course(id);

-- Foreing key of student on table student_subject
alter table student_subject add foreign key (id_student) references student(id);

-- Foreing key of subject on table student_subject
alter table student_subject add foreign key (id_subject) references subject(id);

-- Inserts for table school
insert into school (id, name) values (1, 'Olimpo School');

-- Inserts for table course
insert into course (id, grade, classroom, id_school)
values (1, 10, 'A', 1), (2, 10, 'B', 1), (3, 11, 'A', 1), (4, 11, 'B', 1);

-- Inserts for table teacher
insert into teacher (id, name)
values (1, 'Némesis'), (2, 'Príapo'), (3, 'Iris');

-- Inserts for table student
insert into student (id, name)
values (1, 'Afrodita'), (2, 'Apolo'), (3, 'Ares'), (4, 'Artemisa'),
       (5, 'Atenea'), (6, 'Dionisio'), (7, 'Hefesto'), (8, 'Hera'),
       (9, 'Hermes'), (10, 'Hades'), (11, 'Poseidón'), (12, 'Zeus');

-- Inserts for table subject
insert into subject (id, name, id_teacher, id_course)
values (1, 'Matemáticas', 1, 1), (2, 'Español', 2, 1),
       (3, 'Inglés básico', 3, 1), (4, 'Matemáticas', 1, 2),
       (5, 'Español', 2, 2), (6, 'Inglés avanzado', 3, 2),
       (7, 'Matemáticas', 1, 3), (8, 'Pre Icfes', 1, 3),
       (9, 'Matemáticas', 1, 4), (10, 'Pre Icfes', 1, 4);

-- Inserts for table student_subject
insert into student_subject (id_student, id_subject)
select e.id, a.id
from subject a
inner join course c on a.id_course = c.id, student e
where c.grade = 10
and classroom = 'A'
and e.name in ('Afrodita', 'Apolo', 'Ares');

insert into student_subject (id_student, id_subject)
select e.id, a.id
from subject a
inner join course c on a.id_course = c.id, student e
where c.grade = 10
and classroom = 'B'
and e.name in ('Artemisa', 'Atenea', 'Dionisio');

insert into student_subject (id_student, id_subject)
select e.id, a.id
from subject a
inner join course c on a.id_course = c.id, student e
where c.grade = 11
and classroom = 'A'
and e.name in ('Hefesto', 'Hera');

insert into student_subject (id_student, id_subject)
select e.id, a.id
from subject a
inner join course c on a.id_course = c.id, student e
where c.grade = 11
and classroom = 'B'
and e.name in ('Hermes', 'Hades', 'Poseidón', 'Zeus');