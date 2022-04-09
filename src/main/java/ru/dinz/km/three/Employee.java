package ru.dinz.km.three;

import java.io.Serializable;

/*
Написать программу(Windows Forms Application),
которая добавляет нового сотрудника через форму добавления сотрудника и
отображает в списке сотрудников.

Добавить меню для сохранения списка сотрудников
в файле и чтения списка сотрудников из файла.

 */
public class Employee implements Serializable {

    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
