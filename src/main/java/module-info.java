module com.example.algobox {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.algobox to javafx.fxml;
    exports com.example.algobox;
}