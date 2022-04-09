package ru.dinz.km.three;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class EmployeeController {

    private ObservableList<Employee> employees = FXCollections.observableArrayList();
    private EmployeeData employeesData = new EmployeeData();

    @FXML
    private TextField fio;

    @FXML
    private TextField age;

    @FXML
    private TextField path;

    @FXML
    private Button saveButton;

    @FXML
    private Button addButton;

    @FXML
    private Button considerButton;

    @FXML
    private TableView<Employee> table;

    @FXML
    private TableColumn<Employee, String> tableName;

    @FXML
    private TableColumn<Employee, Integer> tableAge;

    @FXML
    void initialize() {
        assert saveButton != null : "fx:id=\"decide\" was not injected: check your FXML file 'app.fxml'.";
        assert addButton != null : "fx:id=\"decide\" was not injected: check your FXML file 'app.fxml'.";
        assert considerButton != null : "fx:id=\"decide\" was not injected: check your FXML file 'app.fxml'.";
        assert fio != null : "fx:id=\"x1\" was not injected: check your FXML file 'app.fxml'.";
        assert age != null : "fx:id=\"x2\" was not injected: check your FXML file 'app.fxml'.";
        assert path != null : "fx:id=\"x3\" was not injected: check your FXML file 'app.fxml'.";
        saveButton.setOnAction(event -> {
            employeesData.save(employees, String.valueOf(path.getCharacters()));
        });
        addButton.setOnAction(actionEvent -> {
            employees.add(new Employee(String.valueOf(fio.getCharacters()),
                    Integer.parseInt(String.valueOf(age.getCharacters())))
            );
            tableName.setCellValueFactory(new PropertyValueFactory<Employee, String>("Name"));
            tableAge.setCellValueFactory(new PropertyValueFactory<Employee, Integer>("Age"));
            table.setItems(employees);
        });
        considerButton.setOnAction(actionEvent -> {
            employees.clear();
            employees = employeesData.consider(String.valueOf(path.getCharacters()));
            tableName.setCellValueFactory(new PropertyValueFactory<Employee, String>("Name"));
            tableAge.setCellValueFactory(new PropertyValueFactory<Employee, Integer>("Age"));
            table.setItems(employees);
        });
    }
}
