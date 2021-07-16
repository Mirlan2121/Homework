package com.company;

public class Main {
}

/**
 * create table sports(
 * id serial primary key,
 * sport_name varchar not null,
 * salary float8 not null
 * );
 *
 * create table treners (
 * id serial primary key,
 * trener_name varchar not null,
 * trener_sername varchar not null,
 * type_sport integer references  sports(id) unique,
 * phone float8 ,
 * inn varchar  unique not null
 * );
 *
 * create table visiters(
 * id serial primary key,
 * visiter_name varchar not null,
 * visiter_serName varchar not null,
 * data_birthday date  not null,
 * gender varchar not null
 * );
 *
 * create table visits (
 * id serial primary key,
 * visiters integer references visiters(id),
 * time_visit timestamp not null,
 * trener integer references treners(id)
 * );
 * ---------------------------проверка-----------------------------------
 * insert into sports(sport_name, salary)
 * values
 * ('Football', 10000),
 * ('Basketball', 5000),
 * ('tennis', 7000),
 * ('swiming', 4000),
 * ('regby', 3000),
 * ('POLO', 8500);
 * commit;
 * INSERT INTO treners
 * (trener_name, trener_sername, type_sport, phone, inn)
 * values
 * ('Gremlin', 'Nusferatum', 1, +99600001, 'AN001'),
 * ('ARES', 'MARS', 2, +99600002, 'AN002'),
 * ('Aura', 'MELAnoskaya', 3,+99600003, 'AN003'),
 * ('ZENA', 'QuinWars', 4, +99600004, 'AN004'),
 * ('Terranus', 'Dart', 5, +99600005, 'AN005'),
 * ('Enakin', 'Skyvoker', 6, +99600006, 'AN006');
 * commit;
 * insert into visiters (visiter_name, visiter_sername, data_birthday,gender)
 * values
 * ('Mikki', 'Jumanaliev', '13-01-1996', 'male'),
 * ('Merrim', 'Solikova', '25-11-2000', 'woman'),
 * ('Alex', 'Zelvitskye', '26-06-1987', 'male'),
 * ('Lara', 'Croft', '24-03-1987', 'woman'),
 * ('Sonic', 'Roker', '24-08-1973','male');
 * commit;
 * INSERT INTO public.visits
 * (visiters, time_visit, trener)
 * values
 * (1, '2021-01-01 19:30', 1),
 * (2, '2021-01-06 05:40', 4),
 * (3, '2021-01-01 09:00', 3),
 * (4, '2021-01-25 13:00', 4),
 * (5, '2021-01-08 14:25', 5);
 * commit;
 *
 * select v.id, v.visiter_name, v.gender, s.sport_name, t.trener_name, times.time_visit
 * from visits times
 * join sports s on times.trener = s.id
 * join treners t on t.id = times.trener
 * join visiters v on v.id = times.visiters
 * where s.sport_name = 'regby'
 * order by times.time_visit asc;
 *
 *
 * ------------------------- Задача Б ---------------------------------------------
 *
 * create table Univer(
 * id serial primary key,
 * univer_name varchar
 * );
 * create table Fakultet(
 * id serial primary key,
 * fakultet_name varchar unique not null,
 * univer_fakultet integer references Univer not null
 * );
 * create table Stady_group(
 * id serial primary key,
 * fakultet_group integer references Fakultet unique not null,
 * code_group float8 not null unique
 * );
 * create table Students(
 * id serial primary key,
 * spn_student varchar not null,
 * students_group integer references Stady_group(id) not null,
 * date_birthday date not null
 * );
 * create table Lessons(
 * id serial primary key,
 * lessons varchar not null unique
 * );
 * create table Appraisal(
 * id serial primary key,
 * student integer references Students(id) not null,
 * app_students integer not null,
 * lessons_students integer references Lessons(id) not null
 * );
 * -------------------------------проверка-----------------------------
 *
 * INSERT INTO public.univer
 * (univer_name)
 * VALUES('Универ 1');
 * commit;
 *
 * INSERT INTO public.fakultet
 * (fakultet_name, univer_fakultet)
 * values
 * ('Матиматики', 1),('Физики', 1),('Информатики', 1),
 * ('Исекуства', 1),('Механики', 1),('Экономики', 1);
 * commit;
 *
 * INSERT INTO public.stady_group
 * (fakultet_group, code_group)
 * values
 * (1, 0),(2, 1),(3, 2),
 * (4, 3),(5, 4),(6, 5);
 * commit;
 *
 * INSERT INTO public.students
 * (spn_student, students_group, date_birthday)
 * values
 * ('Alexaner Rojkov', 1, '14-12-1989'),('Sam Kusimbekov', 2, '06-07-1995'),
 * ('Vladimir Paniklov', 3, '30-10-1992'),('Alexaner Solodyankin', 4, '26-11-1990'),
 * ('Vladimir Solodyankin', 5, '03-05-1970');
 * commit;
 *
 * INSERT INTO public.lessons
 * (lessons)
 * values
 * ('Матиматека'),('Геометрия'),('Английсткий'),('Русский'),
 * ('Изо'),('Физика'),('Химия'),('Астраномия'),('Алхимия');
 * commit;
 *
 * INSERT INTO public.appraisal
 * (student, app_students, lessons_students)
 * values
 * (3, 3, 1),(3, 5, 2),(3, 4, 3),(3, 1, 4),
 * (3, 2, 5),(3, 3, 6),(3, 4, 7),(3, 5, 8),
 * (3, 5, 9),(1, 3, 1),(2, 3, 2);
 * commit;
 *
 * select AVG(a.app_students) as Avareg_app from appraisal a
 * join students s on s.id = 3 and s.id = a.student ;
 *
 * select s.id, s.spn_student, f.fakultet_name, sg.code_group, u.univer_name
 * from students s
 * join stady_group sg on sg.id = s.students_group
 * join fakultet f on f.id = sg.fakultet_group
 * join univer u on u.id = f.univer_fakultet
 * where s.id = 6;
 */
