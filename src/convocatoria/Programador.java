package convocatoria;

import java.util.ArrayList;
import  java.util.Scanner;

public class Programador {
    private ArrayList<Jugador> jugadorDB;
    private Scanner inputData;

    public Programador() {
        jugadorDB = new ArrayList<Jugador>();
        inputData = new Scanner(System.in);
    }
}
