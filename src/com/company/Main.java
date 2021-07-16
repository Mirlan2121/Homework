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
 *
 *
 * insert into sports (sport_name, salary)
 * values ('foodball', 15000), ('basketball', 1000), ('tennis', 500), ('swoming', 10000);
 * select * from sports;
 *
 * insert into treners(trener_name, trener_sername, type_sport, phone, inn)
 * values ('trener1', 'trenerSer1', 1, +99655555555550,0000001),('trener2', 'trenerSer2', 2, +99655555555551,0000002),
 * ('trener3', 'trenerSer3', 3, +99655555555553,0000003),('trener4', 'trenerSer4', 4, +99655555555554,0000004);
 * select * from treners;
 *
 * insert into visiters (visiter_name, visiter_sername, data_birthday, gender)
 * values ('visiterName1', 'VisiterSerName1', '12-11-1990', 'males'), ('visiterName2', 'VisiterSerName2', '02-01-1999', 'woman');
 * select * from visiters;
 *
 * insert into visits (visiters, time_visit, trener)
 * values (1,'12:00',1), (2,'13:39',1);
 * select * from visits ;
 *
 */