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

    public void agregarJugador(){

    }

    public void buscarJugador(){

    }

    public void editarJugador(){

    }

    public void mostrarTablaJugadores(){

    }

    public void menu(){
        boolean flag = true;

        while (flag){
            System.out.println("Seleccione la información requerida del menu");
            System.out.println("********************************************");
            System.out.println("1. Agregar Jugador");
            System.out.println("2. Buscar Jugador");
            System.out.println("3. Editar Jugador");
            System.out.println("4. Mostrar Tabla Jugadores");
            System.out.println("5. Salir");

            int opciones = Integer.parseInt(inputData.nextLine());

            switch (opciones){
                case 1:
                    agregarJugador();
                    break;
                case 2:
                    buscarJugador();
                    break;
                case 3:
                    editarJugador();
                    break;
                case 4:
                    mostrarTablaJugadores();
                    break;
                case 5:
                    flag = false;
                    break;
            }
        }
    }
}
