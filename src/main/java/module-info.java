module com.example.flowersxp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.flowersxp to javafx.fxml;
    exports com.example.flowersxp;
}