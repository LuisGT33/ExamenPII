package app.modelo;

public class Parcela {

    private String codigo;
    private String nombre;
    private String ubicacion;
    private double area;
    private String tipoSuelo;
    private String estado;

    public Parcela(String codigo, String nombre,
                   String ubicacion, double area,
                   String tipoSuelo, String estado) {

        this.codigo = codigo;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.area = area;
        this.tipoSuelo = tipoSuelo;
        this.estado = estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public double getArea() {
        return area;
    }

    public String getTipoSuelo() {
        return tipoSuelo;
    }

    public String getEstado() {
        return estado;
    }
}