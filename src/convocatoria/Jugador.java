package convocatoria;

public class Jugador extends Seleccion{
    private int id;

    public Jugador(int id) {
        this.id = getId();
    }

    public Jugador() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id+1;
    }

    public String getNombre(String nuevoNombre) {
        return nuevoNombre;
    }

    public String getApellidos(String nuevoApellido) {
        return nuevoApellido;
    }

    public String getPosicion(String nuevaPosicion) {
        return nuevaPosicion;
    }

    public int getEdad(int nuevaEdad) {
        return nuevaEdad;
    }

    public String getEquipo_actual(String nuevoEquipo) {
        return nuevoEquipo;
    }
}
