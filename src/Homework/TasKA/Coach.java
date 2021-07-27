package Homework.TasKA;

public class Coach {
    private int id;
    private String name;
    private String serName;
    private int salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("ID: %s, Имя: %s, Фамиля: %s, зарплата: %s", id, name, serName, salary,  serName.length() > 3?  " Молодец" : "");
    }
}
