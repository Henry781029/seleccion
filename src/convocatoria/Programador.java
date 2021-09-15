package convocatoria;

import java.util.ArrayList;
import  java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Programador {
    private ArrayList<Jugador> jugadorDB;
    private Scanner inputData;

    public Programador() {
        jugadorDB = new ArrayList<Jugador>();
        inputData = new Scanner(System.in);
    }

    public void agregarJugador(){
        System.out.println("ingrese el Id:");
        int id = parseInt(inputData.nextLine());
        Jugador jugador = new Jugador(id);
        System.out.println("Ingrese Dorsal:");
        int nro_camiseta = parseInt(inputData.nextLine());
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
        int edad = parseInt(inputData.nextLine());
        jugador.setEdad(edad);
        System.out.println("Ingrese Equipo Actual del Jugador:");
        String equipo = inputData.nextLine();
        jugador.setEquipo_actual(equipo);
        jugadorDB.add(jugador);
    }

    public void buscarJugador(){


        for (int contador = 0; contador<jugadorDB.size(); contador++ ){
            System.out.println("Ingrese Dorsal:");
            int nro_camiseta = parseInt(inputData.nextLine());
            Jugador dorsal = new Jugador();
            dorsal.setNro_camiseta(nro_camiseta);
            if(nro_camiseta == jugadorDB.get(contador).getNro_camiseta()){
                System.out.println("Corresponde al Jugador:" + jugadorDB.get(contador).getNombre() +" "+
                                    jugadorDB.get(contador).getApellidos());
            }else{
                System.out.println("La dorsal no existe para ningun jugador");

            }
            break;
        }

    }

    public void editarJugador(){

    }

    public int mostrarTablaJugadores(){
        for(int i = 0; i < jugadorDB.size(); i++){
            System.out.println("id:" + (i+1) +" "+
                               "Dorsal:" + jugadorDB.get(i).getNro_camiseta() +" "+
                               "Nombres:" + jugadorDB.get(i).getNombre() +" "+
                               "Apellidos:" + jugadorDB.get(i).getApellidos() +" "+
                               "Posición:" + jugadorDB.get(i).getPosicion() +" "+
                               "Edad:" + jugadorDB.get(i).getEdad() +" "+
                               "Equipo Actual:" + jugadorDB.get(i).getEquipo_actual());
        }

        return 0;
    }

    public void menu(){
        boolean flag = true;

        while (flag){
            System.out.println(" ");
            System.out.println("********************************************");
            System.out.println("Seleccione la información requerida del menu");
            System.out.println("********************************************");
            System.out.println("1. Agregar Jugador");
            System.out.println("2. Buscar Jugador");
            System.out.println("3. Editar Jugador");
            System.out.println("4. Mostrar Tabla Jugadores");
            System.out.println("5. Salir");

            int opciones = parseInt(inputData.nextLine());

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
