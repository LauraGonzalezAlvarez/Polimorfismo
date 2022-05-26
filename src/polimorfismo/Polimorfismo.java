package polimorfismo;

import java.util.Scanner;

/**
 * Clase principal que permite crear naves diferentes con diferentes
 * comportamientos por medio de una ejecucción infinita , hasta que el usuario
 * lo detenga.
 *
 * @author Laura Daniela Gonzalez Alvarez
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Se crea una nave de tipo Ship
         */
        Ship ship;
        /**
         * Se crea una nave de tipo MixedShip
         */
        MixedShip mixedship;
        /**
         * Variable option que lee por consola los casos de los diferentes tipos
         * de naves
         */
        int option;
        /**
         * Variable logica para continuar la ejecución del while
         */
        boolean continu = true;
        /**
         * Variable que lee el valor != de 1 para desactivar la bandera continu
         * y salir del programa
         */
        int next = 0;

        System.out.println("------------Bienvenido al programa construcción de Naves espaciales(\"------------");
        /**
         * While que permite controlar la creación de naves
         */
        while (continu) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Por favor seleccione el tipo de nave que desea construir");
            System.out.println("1 - Manned");
            System.out.println("2 - Shuttle");
            System.out.println("3 - Unmanned");
            System.out.println("4 - MisedShip");
            option = teclado.nextInt();
            /**
             * Switch que permite crear las naves según la variable option
             */
            switch (option) {
                case 1:
                    /**
                     * Crea una nave tipo Manned le envia los valores e inicia
                     * el vuelo
                     */
                    ship = new Manned(10, args, 0, (float) 4555.3, (float) 354.3);
                    System.out.println("Iniciar vuelo\n");
                    ship.flight();
                    break;

                case 2:
                    /**
                     * Crea una nave tipo Shuttle le envia los valores y activa
                     * el método despegar solo si ya ha iniciado la nave
                     */
                    ship = new Shuttle((float) 34334.98, (float) 94.4, args, (float) 453.3, (float) 49.3, 0);
                    System.out.println("Despegar\n");
                    ship.takeOff();
                    break;
                /**
                 * Crea una nave tipo Unmanned le envia los valores y aterriza
                 * la nave
                 */
                case 3:
                    ship = new Unmanned((int) 434.3, args, (float) 34.3, (float) 30.4, (float) 40.3);
                    System.out.println("Aterrizaje\n");
                    ship.toland();
                    break;

                case 4:
                    /**
                     * Crea una nave tipo MixedShip le envia los valores y
                     * activa el metodo de reparar nave
                     */
                    mixedship = new MixedShip((float) 98.4, (float) 433.4, args, (float) 433.3, (float) 34.3, (float) 12.2);
                    System.out.println("Reparación de nave\n");
                    mixedship.sortOut();
                    break;

                default:
                    throw new AssertionError("Error: Valor incorrecto, por favor selecciona un valor dentro del rango establecido ");
            }
            /**
             * Pregunta al usuario si desea continuar, lee la variable next y
             * cambia el estado de continu
             */
            System.out.println("Continuar programa?\n");
            System.out.println("1 = si \n");
            next = teclado.nextInt();
            if (next != 1) {
                continu = false;
                System.out.println(" \n");
            }

        }

    }

}
