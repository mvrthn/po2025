module com.example.cargui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cargui to javafx.fxml;
    exports com.example.cargui;
}