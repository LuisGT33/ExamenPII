package app.vista;

import app.modelo.Cultivo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class CultivosController implements Initializable {

    @FXML
    private TextField txtCodigo;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtTipo;

    @FXML
    private TextField txtFechaSiembra;

    @FXML
    private ComboBox<String> cbEstado;

    @FXML
    private TableView<Cultivo> tablaCultivos;

    @FXML
    private TableColumn<Cultivo, String> colCodigo;

    @FXML
    private TableColumn<Cultivo, String> colNombre;

    @FXML
    private TableColumn<Cultivo, String> colTipo;

    @FXML
    private TableColumn<Cultivo, String> colFecha;

    @FXML
    private TableColumn<Cultivo, String> colEstado;

    private ObservableList<Cultivo> listaCultivos;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        listaCultivos = FXCollections.observableArrayList();

        cbEstado.getItems().addAll(
                "Activo",
                "En crecimiento",
                "Cosechado"
        );

        colCodigo.setCellValueFactory(
                new PropertyValueFactory<>("codigo"));

        colNombre.setCellValueFactory(
                new PropertyValueFactory<>("nombre"));

        colTipo.setCellValueFactory(
                new PropertyValueFactory<>("tipo"));

        colFecha.setCellValueFactory(
                new PropertyValueFactory<>("fechaSiembra"));

        colEstado.setCellValueFactory(
                new PropertyValueFactory<>("estado"));

        tablaCultivos.setItems(listaCultivos);
    }

    @FXML
    private void guardarCultivo(ActionEvent event) {

        if (txtCodigo.getText().isEmpty()
                || txtNombre.getText().isEmpty()
                || txtTipo.getText().isEmpty()
                || txtFechaSiembra.getText().isEmpty()
                || cbEstado.getValue() == null) {

            mostrarAlerta(
                    "Error",
                    "Complete todos los campos"
            );

            return;
        }

        Cultivo cultivo = new Cultivo(
                txtCodigo.getText(),
                txtNombre.getText(),
                txtTipo.getText(),
                txtFechaSiembra.getText(),
                cbEstado.getValue()
        );

        listaCultivos.add(cultivo);

        mostrarAlerta(
                "Éxito",
                "Cultivo guardado correctamente"
        );

        limpiarFormulario(null);
    }

    @FXML
    private void eliminarCultivo(ActionEvent event) {

        Cultivo seleccionado =
                tablaCultivos.getSelectionModel().getSelectedItem();

        if (seleccionado == null) {

            mostrarAlerta(
                    "Error",
                    "Seleccione un cultivo"
            );

            return;
        }

        listaCultivos.remove(seleccionado);

        mostrarAlerta(
                "Éxito",
                "Cultivo eliminado"
        );
    }

    @FXML
    private void limpiarFormulario(ActionEvent event) {

        txtCodigo.clear();
        txtNombre.clear();
        txtTipo.clear();
        txtFechaSiembra.clear();

        cbEstado.setValue(null);
    }

    private void mostrarAlerta(String titulo, String mensaje) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);

        alert.showAndWait();
    }
}