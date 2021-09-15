package convocatoria;

public class Seleccion {
    private int nro_camiseta;
    private String nombre;
    private String apellidos;
    private String posicion;
    private int edad;
    private String equipo_actual;

    public Seleccion() {
    }

    public int getNro_camiseta() {
        return nro_camiseta;
    }

    public void setNro_camiseta(int nro_camiseta) {
        this.nro_camiseta = nro_camiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEquipo_actual() {
        return equipo_actual;
    }

    public void setEquipo_actual(String equipo_actual) {
        this.equipo_actual = equipo_actual;
    }
}
