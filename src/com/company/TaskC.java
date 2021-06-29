package com.company;

import java.util.ArrayList;

public class TaskC {
    public static void main(String[] args) {
        ArrayList<Object> backpack1 = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            backpack1.add(new Apple());
        }
        backpack1.add(new Book());
        backpack1.add(new CocaCola());
        System.out.println("Первый рюкзак:" + backpack1);
        ArrayList<Object> backpack2 = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            backpack2.add(new TennisBall());
        }
        backpack2.add(new Folder());
        backpack2.add(new Water());
        System.out.println("Второй рюкзак:" + backpack2);
        ArrayList<Object> backpack3 = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            backpack3.add(new Apple());
            if ( i <= 3){
                backpack3.add(new TennisBall());
            }
        }
        backpack3.add(new CocaCola());
        System.out.println("Третий рюкзак:" + backpack3);
    }
}
