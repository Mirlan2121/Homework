package com.company;

import com.company.Trener.CoachSQL;
import com.company.Trener.CoachSetter;

public class Main {
    public static void main(String[] args) {
        CoachSetter coachSetter = new CoachSQL();
        for (int i = 0; i < coachSetter.getAll().size(); i++) {
            System.out.println(coachSetter.getAll().get(i));
        }
    }
}
