package grupal.TP_Herencia_Polimorfismo.Parte2Batalla;

import java.util.Scanner;

// Programa principal
public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int opcion = 0;

        while (opcion != 3) {

            System.out.println();
            System.out.println("===================================");
            System.out.println("          MENU PRINCIPAL");
            System.out.println("===================================");
            System.out.println("1. Iniciar batalla");
            System.out.println("2. Realizar 3 combates");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opcion: ");

            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:

                    System.out.println();
                    System.out.println("===================================");
                    System.out.println("          INICIAR BATALLA");
                    System.out.println("===================================");

                    // Creamos un Guerrero y un Mago
                    Personaje guerrero = new Guerrero();
                    Personaje mago = new Mago();

                    // Creamos la batalla con los dos personajes
                    Batalla batalla = new Batalla(guerrero, mago);

                    // Iniciamos el combate
                    batalla.iniciarCombate();

                    break;

                case 2:

                    System.out.println();
                    System.out.println("===================================");
                    System.out.println("          TRES COMBATES");
                    System.out.println("===================================");

                    // Primer combate
                    System.out.println();
                    System.out.println("********** COMBATE 1 **********");

                    Personaje guerrero1 = new Guerrero();
                    Personaje mago1 = new Mago();

                    Batalla batalla1 = new Batalla(
                            guerrero1,
                            mago1);

                    batalla1.iniciarCombate();

                    // Segundo combate
                    System.out.println();
                    System.out.println("********** COMBATE 2 **********");

                    Personaje guerrero2 = new Guerrero();
                    Personaje mago2 = new Mago();

                    Batalla batalla2 = new Batalla(
                            guerrero2,
                            mago2);

                    batalla2.iniciarCombate();

                    // Tercer combate
                    System.out.println();
                    System.out.println("********** COMBATE 3 **********");

                    Personaje guerrero3 = new Guerrero();
                    Personaje mago3 = new Mago();

                    Batalla batalla3 = new Batalla(
                            guerrero3,
                            mago3);

                    batalla3.iniciarCombate();

                    break;

                case 3:

                    System.out.println();
                    System.out.println("Programa finalizado.");

                    break;

                default:

                    System.out.println();
                    System.out.println("Opcion incorrecta.");
            }
        }

        teclado.close();
    }
}