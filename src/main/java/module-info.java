module ru.dinz.km.three {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens ru.dinz.km.three to javafx.fxml;
    exports ru.dinz.km.three;
}