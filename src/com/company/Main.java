package com.company;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	Set<Integer> arrayInteger = new LinkedHashSet<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++){
            if (i % 5 == 0) {
                arrayList.add(0,i);
            }else {
                arrayList.add(i);

            }
        }
        System.out.println(arrayList.size());
        System.out.println(arrayList);
        arrayInteger.addAll(arrayList);
        System.out.println(arrayInteger);
    }
}
