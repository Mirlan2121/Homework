package com.company.Draft;

public class Main {
    public static void main(String[] args) {
        Connect_SQL connect_sql = new HumanModel();
        for (int i = 0; i < connect_sql.getAll().size(); i++) {
            System.out.println(connect_sql.getAll().get(i));

        }
    }
}
