package com.company.homework32.TaskA;

public class Cat {
    private String name;
    private int age;
    private int height;

    public Cat(String name, int age, int height){
    this.name = name;
    this.age = age;
    this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    @Override
    public String toString(){
        return String.format("Имя: %s \n" +
                "Возраст: %s \n" +
                "Вес: %s \n", name, age, height);
    }
}
