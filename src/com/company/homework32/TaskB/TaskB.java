package com.company.homework32.TaskB;

import java.util.ArrayList;
import java.util.LinkedList;

public class TaskB {
    public static void main(String[] args) {
        LinkedList<Object> animals = new LinkedList<>();
        for (int i = 0; i < 50; i++) {
            animals.add(new Cat("Cat" + (i + 1), i + 1));
            animals.add(new Dog("Dog" + (i + 1), i + 1));
        }
        System.out.println(animals.size());

        int countCat = 0;
        int countDog = 0;
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i) instanceof Cat) {
                countCat++;
                if (countCat % 5 == 0) {
                    animals.remove(i);
                }
            }
            if (animals.get(i) instanceof Dog) {
                countDog++;
                if (countDog % 3 == 0) {
                    animals.add(i + 1, new Mouse("Mouse" + i, i));
                }
            }
        }
        LinkedList<Object> CatAndMouse = new LinkedList<>();
        ArrayList<Object> newAnimals = new ArrayList<>();
        int countAgeMouse = 0;
        int countAgeCat = 0;
        int countAgeDog = 0;
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i) instanceof Mouse) {
                countAgeMouse = countAgeMouse + ((Mouse) animals.get(i)).getAge();
            }
            if (animals.get(i) instanceof Cat) {
                countAgeCat = countAgeCat + ((Cat) animals.get(i)).getAge();
            }
            if (animals.get(i) instanceof Dog) {
                countAgeDog = countDog + ((Dog) animals.get(i)).getAge();
            }
            if (i != 0) {
                if (animals.get(i - 1) instanceof Mouse && animals.get(i) instanceof Cat) {
                    CatAndMouse.add(animals.get(i - 1));
                    CatAndMouse.add(animals.get(i));
                    animals.remove(i + 1);
                    animals.remove(i);
                }
            }
            if (i < animals.size() - 1){
                if (animals.get(i) instanceof Cat && animals.get(i + 1) instanceof Mouse){
                    CatAndMouse.add(animals.get(i + 1));
                    CatAndMouse.add(animals.get(i));
                    animals.remove(i + 1);
                    animals.remove(i);
                }
            }
        }
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i) instanceof Cat){
                newAnimals.add(0, animals.get(i));
            }
            if (animals.get(i) instanceof Dog){
                newAnimals.add(newAnimals.size() / 2 + 1, animals.get(i));
            }
            if (animals.get(i) instanceof Mouse){
                newAnimals.add(newAnimals.size(), animals.get(i));
            }
        }
        for (int i = 0; i < newAnimals.size(); i++) {
            System.out.println(newAnimals.get(i));
        }
        System.out.println();
        System.out.println("Общая сумма возроста всех мышей: " + countAgeMouse);
        System.out.println("Общая сумма возроста всех кошек: " + countAgeCat);
        System.out.println("Общая сумма возроста всех собак: " + countAgeDog);
    }
}
