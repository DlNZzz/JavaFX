package ru.dinz.km.three;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TextField;

import java.io.*;

public class EmployeeData {

    public void save(ObservableList<Employee> employee, String path) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
            Employees employees = new Employees();
            for (Employee emp : employee) {
                employees.add(emp);
            }
            oos.writeObject(employees);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ObservableList<Employee> consider(String path) {
        ObservableList<Employee> observableList = FXCollections.observableArrayList();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
            Employees employees = (Employees) ois.readObject();
            observableList.addAll(employees.getList());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return observableList;
    }
}
