package app.vista;

import app.modelo.Labor;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class LaboresController {

    @FXML
    private TextField txtCodigo;

    @FXML
    private TextField txtDescripcion;

    @FXML
    private TextField txtFecha;

    @FXML
    private TextField txtResponsable;

    @FXML
    private TableView<Labor> tablaLabores;

    @FXML
    private TableColumn<Labor, String> colCodigo;

    @FXML
    private TableColumn<Labor, String> colDescripcion;

    @FXML
    private TableColumn<Labor, String> colFecha;

    @FXML
    private TableColumn<Labor, String> colResponsable;

    private ObservableList<Labor> listaLabores =
            FXCollections.observableArrayList();

    @FXML
    public void initialize() {

        colCodigo.setCellValueFactory(
                new PropertyValueFactory<>("codigo"));

        colDescripcion.setCellValueFactory(
                new PropertyValueFactory<>("descripcion"));

        colFecha.setCellValueFactory(
                new PropertyValueFactory<>("fecha"));

        colResponsable.setCellValueFactory(
                new PropertyValueFactory<>("responsable"));

        tablaLabores.setItems(listaLabores);
    }

    @FXML
    public void guardarLabor() {

        Labor l = new Labor(
                txtCodigo.getText(),
                txtDescripcion.getText(),
                txtFecha.getText(),
                txtResponsable.getText()
        );

        listaLabores.add(l);

        limpiarFormulario();
    }

    @FXML
    public void eliminarLabor() {

        Labor seleccionado =
                tablaLabores.getSelectionModel().getSelectedItem();

        if (seleccionado != null) {
            listaLabores.remove(seleccionado);
        }
    }

    @FXML
    public void limpiarFormulario() {

        txtCodigo.clear();
        txtDescripcion.clear();
        txtFecha.clear();
        txtResponsable.clear();
    }

}