package convocatoria;

import com.sun.java.swing.plaf.windows.WindowsTextAreaUI;

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
        System.out.println("ingrese el Id:");
        int id = Integer.parseInt(inputData.nextLine());
        Jugador jugador = new Jugador(id);
        System.out.println("Ingrese Dorsal:");
        int nro_camiseta = Integer.parseInt(inputData.nextLine());
        jugador.setNro_camiseta(nro_camiseta);
        System.out.println("Ingrese nombre del Jugador:");
        String nombre = inputData.nextLine();
        jugador.setNombre(nombre);
        System.out.println("Ingrese apellido del Jugador:");
        String apellidos = inputData.nextLine();
        jugador.setApellidos(apellidos);
        System.out.println("Ingrese Posición de Juego:");
        String posicion = inputData.nextLine();
        jugador.setPosicion(posicion);
        System.out.println("Ingrese Edad del Jugador:");
        int edad = Integer.parseInt(inputData.nextLine());
        jugador.setEdad(edad);
        System.out.println("Ingrese Equipo Actual del Jugador:");
        String equipo = inputData.nextLine();
        jugador.setEquipo_actual(equipo);
        jugadorDB.add(jugador);
    }

    public void buscarJugador(){

    }

    public void editarJugador(){

    }

    public void mostrarTablaJugadores(){
        for(int i = 0; i < jugadorDB.size(); i++){
            System.out.println("id:" + jugadorDB.get(i).getId() +
                               "Dorsal:" + jugadorDB.get(i).getNro_camiseta() +
                               "Nombres:" + jugadorDB.get(i).getNombre() +
                               "Apellidos:" + jugadorDB.get(i).getApellidos() +
                               "Posición:" + jugadorDB.get(i).getPosicion() +
                               "Edad:" + jugadorDB.get(i).getEdad() +
                               "Equipo Actual:" + jugadorDB.get(i).getEquipo_actual());
        }

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
