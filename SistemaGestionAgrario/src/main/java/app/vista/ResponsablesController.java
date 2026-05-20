package app.vista;

import app.modelo.Responsable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class ResponsablesController {

    @FXML
    private TextField txtCedula;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtTelefono;

    @FXML
    private TextField txtCargo;

    @FXML
    private TableView<Responsable> tablaResponsables;

    @FXML
    private TableColumn<Responsable, String> colCedula;

    @FXML
    private TableColumn<Responsable, String> colNombre;

    @FXML
    private TableColumn<Responsable, String> colTelefono;

    @FXML
    private TableColumn<Responsable, String> colCargo;

    private ObservableList<Responsable> listaResponsables =
            FXCollections.observableArrayList();

    @FXML
    public void initialize() {

        colCedula.setCellValueFactory(
                new PropertyValueFactory<>("cedula"));

        colNombre.setCellValueFactory(
                new PropertyValueFactory<>("nombre"));

        colTelefono.setCellValueFactory(
                new PropertyValueFactory<>("telefono"));

        colCargo.setCellValueFactory(
                new PropertyValueFactory<>("cargo"));

        tablaResponsables.setItems(listaResponsables);
    }

    @FXML
    public void guardarResponsable() {

        Responsable r = new Responsable(
                txtCedula.getText(),
                txtNombre.getText(),
                txtTelefono.getText(),
                txtCargo.getText()
        );

        listaResponsables.add(r);

        limpiarFormulario();
    }

    @FXML
    public void eliminarResponsable() {

        Responsable seleccionado =
                tablaResponsables.getSelectionModel().getSelectedItem();

        if (seleccionado != null) {
            listaResponsables.remove(seleccionado);
        }
    }

    @FXML
    public void limpiarFormulario() {

        txtCedula.clear();
        txtNombre.clear();
        txtTelefono.clear();
        txtCargo.clear();
    }

}