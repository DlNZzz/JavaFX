package ru.dinz.km.three;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class PrimaryController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button decide;

    @FXML
    private Text answer;

    @FXML
    private TextField a;

    @FXML
    private TextField b;

    @FXML
    private TextField c;

    @FXML
    void initialize() {
        assert decide != null : "fx:id=\"decide\" was not injected: check your FXML file 'app.fxml'.";
        assert a != null : "fx:id=\"x1\" was not injected: check your FXML file 'app.fxml'.";
        assert b != null : "fx:id=\"x2\" was not injected: check your FXML file 'app.fxml'.";
        assert c != null : "fx:id=\"x3\" was not injected: check your FXML file 'app.fxml'.";
        decide.setOnAction(event -> {
            answer.setText(new QuadraticEquation(List.of(a, b, c)).decide());
        });
    }

}
