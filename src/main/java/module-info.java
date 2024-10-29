module com.example.electronicdevices8 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.electronicdevices8 to javafx.fxml;
    exports com.example.electronicdevices8;
}