package com.company.com;

public class TaskB {
    public static void main(String[] args) {
        
    }
}

/**
 * create table student_group(
 * id serial primary key,
 * group_name varchar not null
 * );
 *
 * insert into student_group (group_name)
 * values
 * ('Програмисты Java'),
 * ('Програмисты  Python'),
 * ('Програмисты C#'),
 * ('Програмисты Fronted');
 *
 * select * from student_group ;
 *
 * create table student(
 * id serial primary key,
 * student_name varchar not null,
 * student_group integer references student_group(id)
 * );
 * insert into student(student_name, student_group)
 * values
 * ('Мирлан', 1),('Нурсултан', 2),('Мирбек', 3),('Алмаз', 4),
 * ('Саня', 1),('Нурик', 2),('Атай', 3),('Азат', 4);
 * select * from student ;
 * select * from student_group;
 *
 * select count(*) from student s
 * join student_group sg on sg.id = s.student_group
 * where  sg.group_name = 'Програмисты Java';
 */
