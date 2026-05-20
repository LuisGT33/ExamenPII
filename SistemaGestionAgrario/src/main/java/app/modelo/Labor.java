package app.modelo;

public class Labor {

    private String codigo;
    private String descripcion;
    private String fecha;
    private String responsable;

    public Labor() {
    }

    public Labor(String codigo, String descripcion,
                 String fecha, String responsable) {

        this.codigo = codigo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.responsable = responsable;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

}