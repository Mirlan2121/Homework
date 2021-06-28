package com.company;

import java.util.*;

public class TaskB {

    public static void main(String[] args) {
        LinkedList<Person> arrayLins = new LinkedList<>();
       Person man1 = new Person("Miki", "Erik uulu", "Erikovich");
       Person man2 = new Person("Miki", "Erik uulu", "Erikovich");
        arrayLins.add(man1);
        try {
            if (arrayLins.contains(man2)) {
                throw new RuntimeException();


            } else {
                arrayLins.add(man2);
            }
            System.out.println(arrayLins.size());
        }catch (RuntimeException ex){
            System.err.println("Найден похожий обьект ввыден ошибка");
        }
        finally {
            System.out.println("Расположение обьекта " + arrayLins.size());
        }
    }
}


