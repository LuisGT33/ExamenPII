module app {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.base;

    opens app to javafx.fxml; 
    exports app; 
    exports app.vista;
    exports app.modelo;
    opens app.vista to javafx.fxml; 
    opens app.modelo to javafx.base;
}