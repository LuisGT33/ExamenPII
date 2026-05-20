package app.modelo;

public class Responsable {

    private String cedula;
    private String nombre;
    private String telefono;
    private String cargo;

    public Responsable() {
    }

    public Responsable(String cedula, String nombre, String telefono, String cargo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.cargo = cargo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}