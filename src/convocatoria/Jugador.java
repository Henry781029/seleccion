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
        this.id = id;
    }
}
