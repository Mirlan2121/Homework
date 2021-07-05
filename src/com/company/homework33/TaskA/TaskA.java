package com.company.homework33.TaskA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class TaskA {
    public static void main(String[] args) {

        YearsMonth[] arrayMonth = new YearsMonth[12]; // задан обычный массив
        setArray(arrayMonth); // метод для создания массива
        ArrayList<YearsMonth> arrListMonth = new ArrayList<>(); // задан Арей лист
        LinkedList<YearsMonth> linkListMonth = new LinkedList<>(); // задан Линкед Лист

        for (int i = 0; i < arrayMonth.length; i++) { // цикл который присваевает значение из массива в листы
            // если честно было тупо лень писать для каждого методы
            linkListMonth.add(arrayMonth[i]);
            arrListMonth.add(arrayMonth[i]);
        }

        System.out.println("Вывод обычный массив");
        System.out.println(Arrays.toString(arrayMonth));
        System.out.println("Сортировака массива");
        sort(arrayMonth);
        System.out.println(Arrays.toString(arrayMonth));
        System.out.println();

        System.out.println("Вывод ArrayList массив");
        System.out.println(arrListMonth);
        System.out.println("Сортировака ArrayList");
        sort(arrListMonth);
        System.out.println(arrListMonth);
        System.out.println();

        System.out.println("Вывод LinkedList массив");
        System.out.println(linkListMonth);
        System.out.println("Сортировака LinkedList");
        sort(linkListMonth);
        System.out.println(linkListMonth);
    }

    public static void setArray(Object[] array) { // метод который задает значение в масива
        // попробывал обьект для того чтобы сделать уневерсальный метод для всех масивов и листов
        // но данный способ не сработал
        Random ran = new Random(); // генератор случаностей
        YearsMonth[] arrMonth = new YearsMonth[12]; // масив хронящий в себе значения
        // нужен для того чтобы задать значение во входящий массив в случайном порядке
        /**
         * не стал использовать свичкейс потому что так проще и было тупо лень писать лишние строки
         */
        arrMonth[0] = YearsMonth.JANUERY;
        arrMonth[1] = YearsMonth.FEBRUARY;
        arrMonth[2] = YearsMonth.MARCH;
        arrMonth[3] = YearsMonth.APRIL;
        arrMonth[4] = YearsMonth.MAY;
        arrMonth[5] = YearsMonth.JUNE;
        arrMonth[6] = YearsMonth.JULE;
        arrMonth[7] = YearsMonth.AUGUST;
        arrMonth[8] = YearsMonth.SEPTEMBER;
        arrMonth[9] = YearsMonth.OKTOBER;
        arrMonth[10] = YearsMonth.NOVEMBER;
        arrMonth[11] = YearsMonth.DESEMBER;

        ArrayList<YearsMonth> setupArray = new ArrayList<>(); // нужен для того что бы вложенные значения не повторялись
        // данную фичу мы обсуждали с Чингизом и я для него привожу пример генерации случайностей без повторения
        for (int i = 0; i < array.length; i++) { // цикл для создания Листа чтобы вкладывать случайные значения
            setupArray.add(arrMonth[i]); // перекладываю в Лист статичные значения из обычного массива что написан  выше
            // я это делаю для того чтобы эти значения после удолять
        }
        int coutPointer; // создана переменная для хранения случайного результата
        // нужна данная переменая для  того чтобы удолять ячейки из листа для того чтобы если значение вложилось в массив
        // что бы оно  больше не повторялось (не хотел писать 3 - 4 вложеных цикла для учета повторяющегося значения
        for (int i = 0; i < arrMonth.length; i++) { // цикл который служит для вложения значения в итоговый массив
            coutPointer = ran.nextInt(setupArray.size()); // выбираю случайную ячейку из листа в диапозоне длины самого листа
            // из за того что  удаленная ячейка будет изменять размер массива и учет динамичности длины масива вести тоже лень
            // решил использовать то что выучили
            array[i] = setupArray.get(coutPointer); // вкладываю зночение из листа в масив
            setupArray.remove(coutPointer);// удоляю уже вложенное значение в массив
        }

    }

    public static void sort(YearsMonth[] arrays) { // перебор массива методом трех стаканов
        // к сожелению в других методах пока еще не разобрался
        for (int i = 0; i < arrays.length; i++) {
            for (int j = i + 1; j < arrays.length; j++) {
                if (arrays[i].getCountMounth() > arrays[j].getCountMounth()) {
                    YearsMonth sort = arrays[i];
                    arrays[i] = arrays[j];
                    arrays[j] = sort;
                }
            }
        }
    }

    public static void sort(ArrayList<YearsMonth> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(i).getCountMounth() > arrayList.get(j).getCountMounth()) {
                    YearsMonth sort = arrayList.get(i);
                    arrayList.set(i, arrayList.get(j));
                    arrayList.set(j, sort);
                }
            }
        }
    }

    public static void sort(LinkedList<YearsMonth> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(i).getCountMounth() > arrayList.get(j).getCountMounth()) {
                    YearsMonth sort = arrayList.get(i);
                    arrayList.set(i, arrayList.get(j));
                    arrayList.set(j, sort);
                }
            }
        }
    }
}


