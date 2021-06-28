package com.company;

import java.util.Objects;

public class Person {
    private String name;
    private String serName;
    private String patron;

    public Person(String name, String serName, String patron) {
        this.name = name;
        this.serName = serName;
        this.patron = patron;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerName() {
        return serName;
    }

    public void setSerName(String serName) {
        this.serName = serName;
    }

    public String getPatron() {
        return patron;
    }

    public void setPatron(String patron) {
        this.patron = patron;
    }

    @Override
    public String toString() {
        return String.format("Имя: %s \n" +
                "Фамиля: %s \n" +
                "Отчество: %s \n", name, serName, patron);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(serName, person.serName) && Objects.equals(patron, person.patron);
    }

    @Override
    public int hashCode() {
        int num = name.hashCode() + serName.hashCode() + patron.hashCode();
        return Objects.hash(name, serName, patron);
    }
}
