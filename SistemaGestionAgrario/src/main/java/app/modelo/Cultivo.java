package app.modelo;

public class Cultivo {

    private String codigo;
    private String nombre;
    private String tipo;
    private String fechaSiembra;
    private String estado;

    public Cultivo(String codigo, String nombre,
                   String tipo, String fechaSiembra,
                   String estado) {

        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.fechaSiembra = fechaSiembra;
        this.estado = estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getFechaSiembra() {
        return fechaSiembra;
    }

    public String getEstado() {
        return estado;
    }
}