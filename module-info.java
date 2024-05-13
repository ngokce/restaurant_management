module com.example.vtys_arayuz {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.vtys_arayuz to javafx.fxml;
    exports com.example.vtys_arayuz;
}