package app;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MenuPrincipalController {

    @FXML
    private void abrirParcelas() throws IOException {

        FXMLLoader loader =
                new FXMLLoader(getClass().getResource("parcelas.fxml"));

        Stage stage = new Stage();

        stage.setScene(new Scene(loader.load()));

        stage.setTitle("Parcelas");

        stage.show();
    }

    @FXML
    private void abrirCultivos() throws IOException {

        FXMLLoader loader =
                new FXMLLoader(getClass().getResource("cultivos.fxml"));

        Stage stage = new Stage();

        stage.setScene(new Scene(loader.load()));

        stage.setTitle("Cultivos");

        stage.show();
    }

    @FXML
    private void abrirResponsables() throws IOException {

        FXMLLoader loader =
                new FXMLLoader(getClass().getResource("responsables.fxml"));

        Stage stage = new Stage();

        stage.setScene(new Scene(loader.load()));

        stage.setTitle("Responsables");

        stage.show();
    }

    @FXML
    private void abrirLabores() throws IOException {

        FXMLLoader loader =
                new FXMLLoader(getClass().getResource("labores.fxml"));

        Stage stage = new Stage();

        stage.setScene(new Scene(loader.load()));

        stage.setTitle("Labores");

        stage.show();
    }
}