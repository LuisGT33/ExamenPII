module app {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.base;

    opens app to javafx.fxml; // Asegúrate de incluir esto
    exports app; // Exporta tu paquete principal
    opens app.vista to javafx.fxml; // Exporta el paquete donde están tus controladores
}
