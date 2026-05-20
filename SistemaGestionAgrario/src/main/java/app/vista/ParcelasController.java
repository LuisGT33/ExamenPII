package app.vista;

import app.modelo.Parcela;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class ParcelasController {

    @FXML
    private TextField txtCodigo;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtUbicacion;

    @FXML
    private TextField txtArea;

    @FXML
    private TextField txtTipoSuelo;

    @FXML
    private ComboBox<String> cbEstado;

    @FXML
    private TableView<Parcela> tablaParcelas;

    @FXML
    private TableColumn<Parcela, String> colCodigo;

    @FXML
    private TableColumn<Parcela, String> colNombre;

    @FXML
    private TableColumn<Parcela, String> colUbicacion;

    @FXML
    private TableColumn<Parcela, Double> colArea;

    @FXML
    private TableColumn<Parcela, String> colEstado;

    private ObservableList<Parcela> listaParcelas =
            FXCollections.observableArrayList();

    @FXML
    public void initialize() {

        cbEstado.getItems().addAll(
                "Disponible",
                "En producción",
                "En descanso"
        );

        colCodigo.setCellValueFactory(
                new PropertyValueFactory<>("codigo"));

        colNombre.setCellValueFactory(
                new PropertyValueFactory<>("nombre"));

        colUbicacion.setCellValueFactory(
                new PropertyValueFactory<>("ubicacion"));

        colArea.setCellValueFactory(
                new PropertyValueFactory<>("area"));

        colEstado.setCellValueFactory(
                new PropertyValueFactory<>("estado"));

        tablaParcelas.setItems(listaParcelas);
    }

    @FXML
    private void guardarParcela() {

        try {

            String codigo = txtCodigo.getText();
            String nombre = txtNombre.getText();
            String ubicacion = txtUbicacion.getText();

            double area =
                    Double.parseDouble(txtArea.getText());

            String tipoSuelo =
                    txtTipoSuelo.getText();

            String estado =
                    cbEstado.getValue();

            Parcela parcela = new Parcela(
                    codigo,
                    nombre,
                    ubicacion,
                    area,
                    tipoSuelo,
                    estado
            );

            listaParcelas.add(parcela);

            Alert alerta =
                    new Alert(Alert.AlertType.INFORMATION);

            alerta.setTitle("Éxito");

            alerta.setHeaderText(null);

            alerta.setContentText(
                    "Parcela guardada correctamente");

            alerta.showAndWait();

            limpiarFormulario();

        } catch (Exception e) {

            Alert alerta =
                    new Alert(Alert.AlertType.ERROR);

            alerta.setTitle("Error");

            alerta.setHeaderText(null);

            alerta.setContentText(
                    "Datos inválidos");

            alerta.showAndWait();
        }
    }

    @FXML
    private void limpiarFormulario() {

        txtCodigo.clear();
        txtNombre.clear();
        txtUbicacion.clear();
        txtArea.clear();
        txtTipoSuelo.clear();

        cbEstado.setValue(null);
    }
}