module lk.acpt.demofx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.desktop;


    opens lk.acpt.demofx to javafx.fxml;
    exports lk.acpt.demofx;
}