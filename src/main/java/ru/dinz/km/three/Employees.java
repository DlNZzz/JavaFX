package ru.dinz.km.three;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Employees implements Serializable {

    List<Employee> list = new ArrayList<>();

    public void add(Employee employee) {
        list.add(employee);
    }

    public List<Employee> getList() {
        return list;
    }

    public void setList(List<Employee> list) {
        this.list = list;
    }
}
