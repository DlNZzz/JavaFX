package ru.dinz.km.three;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class StoreController {

    private static String NEW_LINE = System.lineSeparator();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button decide;

    @FXML
    private Button decide1;

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
            StringBuilder builder = new StringBuilder();
            int sum = 0;
            builder.append("Названия товара, цена товара, количество товара" + NEW_LINE);
            for (Store store : ListStore.getList()) {
                builder.append(store.toString() + NEW_LINE);
                sum += store.count * store.price;
            }
            builder.append("Общая сумма заказов: " + sum);
            answer.setText(builder.toString());
        });
        decide1.setOnAction(actionEvent -> {
            ListStore.add(new Store(String.valueOf((a).getCharacters()),
                    Integer.parseInt(String.valueOf((b).getCharacters())),
                    Integer.parseInt(String.valueOf((c).getCharacters()))
            ));
            a.setText("");
            b.setText("");
            c.setText("");
        });
    }
}
