package com.company.com;

import Homework.TasKA.CoachSQL;
import Homework.TasKA.Coach_SQL;

public class TaskA {
    public static void main(String[] args) {
        Coach_SQL coach_sql = new CoachSQL();
        int salarySum = 0;
        for (int i = 0; i < coach_sql.getAll().size(); i++) {
            System.out.println(coach_sql.getAll().get(i));
            salarySum += coach_sql.getAll().get(i).getSalary();
        }
        System.out.println("итоговая зарплата: " + salarySum);
    }

}

/**
 * create table coach(
 * id serial primary key,
 * coach_name varchar not null,
 * coach_serName varchar not null,
 * salary integer not null
 * );
 * insert into coach (coach_name, coach_serName, salary)
 * values
 * ('Александр', 'Емеляненко', 1000000),
 * ('Володи', 'Шурович', 28000),
 * ('Юри', 'Соловёв', 150000),
 * ('Азамат', 'Жолдошов', 2000000);
 *
 * select * from coach ;
 */