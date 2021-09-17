package convocatoria;

import java.util.ArrayList;
import java.util.Iterator;
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
        System.out.println("Ingrese Dorsal:");
        int nro_camiseta = parseInt(inputData.nextLine());
        int dorsal = 0;

        Iterator<Jugador>camiseta = jugadorDB.iterator();

        while (camiseta.hasNext()){
            Jugador jugador = camiseta.next();
            if(nro_camiseta == jugadorDB.get(dorsal).getNro_camiseta()){
                System.out.println("Corresponde al Jugador:" + jugadorDB.get(dorsal).getNombre() +" "+
                        jugadorDB.get(dorsal).getApellidos());
            }else{
                System.out.println("La dorsal no existe para ningun jugador");
            }
            break;
        }
    }

    public void editarJugador(){
        for (int contador = 0; contador < jugadorDB.size(); contador++){
            System.out.println("ingrese el Id a modificar:");
            int id = parseInt(inputData.nextLine());

            if(id == jugadorDB.get(contador).getId()){
                System.out.println("id pertenece al Jugador:" + jugadorDB.get(contador).getNombre()
                                   + " " + jugadorDB.get(contador).getApellidos());
                boolean flag = true;
                while (flag){
                System.out.println(" ");
                System.out.println("Que informacion desea Modificar de el jugador:" );
                System.out.println(" ");

                    System.out.println("1. Dorsal");
                    System.out.println("2. Nombre");
                    System.out.println("3. Apellido");
                    System.out.println("4. Posición");
                    System.out.println("5. Edad");
                    System.out.println("6. Equipo");
                    System.out.println("7. Ninguna");
                    int opciones = parseInt(inputData.nextLine());
                    switch (opciones){
                        case 1:
                            System.out.println("ingrese nueva Dorsal:");
                            int nuevaDorsal;
                            nuevaDorsal = parseInt(inputData.nextLine());
                            jugadorDB.get(contador).setId(nuevaDorsal);
                            break;
                        case 2:
                            System.out.println("ingrese nuevo Nombre:");
                            String nuevoNombre;
                            nuevoNombre = inputData.nextLine();
                            jugadorDB.get(contador).getNombre(nuevoNombre);
                            break;
                        case 3:
                            System.out.println("ingrese nuevo Apellido:");
                            String nuevoApellido;
                            nuevoApellido = inputData.nextLine();
                            jugadorDB.get(contador).getApellidos(nuevoApellido);
                            break;
                        case 4:
                            System.out.println("ingrese nueva Posición:");
                            String nuevaPosicion;
                            nuevaPosicion = inputData.nextLine();
                            jugadorDB.get(contador).getPosicion(nuevaPosicion);
                            break;
                        case 5:
                            System.out.println("ingrese nueva Edad:");
                            int nuevaEdad;
                            nuevaEdad = parseInt(inputData.nextLine());
                            jugadorDB.get(contador).getEdad(nuevaEdad);
                            break;
                        case 6:
                            System.out.println("ingrese nuevo Equipo:");
                            String nuevoEquipo;
                            nuevoEquipo = inputData.nextLine();
                            jugadorDB.get(contador).getEquipo_actual(nuevoEquipo);
                            break;
                        case 7:
                            flag = false;
                            break;
                    }

                    }
            }else{
                System.out.println("Id de Jugador no Existe!!!");
            }
        }

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
                    System.out.println("**********CONVOCADOS*********");
                    mostrarTablaJugadores();
                    System.out.println("*****************************");
                    break;
                case 5:
                    flag = false;
                    break;
            }
        }
    }
}
