package TP_Herencia_Polimorfismo.Parte1Puerto;

import java.time.LocalDate;
import java.util.Scanner;

//programa principal
public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Creamos el puerto con datos de prueba
        Puerto puerto = new Puerto();

        int opcion = 0;

        while (opcion != 4) {

            System.out.println();
            System.out.println("===================================");
            System.out.println("          MENU PRINCIPAL");
            System.out.println("===================================");
            System.out.println("1. Mostrar alquileres");
            System.out.println("2. Crear alquiler de velero");
            System.out.println("3. Crear alquiler de yate");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opcion: ");

            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:

                    puerto.mostrarAlquileres();

                    break;

                case 2:

                    System.out.println();
                    System.out.println("CREAR ALQUILER DE VELERO");

                    teclado.nextLine();

                    System.out.print("Nombre del cliente: ");
                    String nombre = teclado.nextLine();

                    System.out.print("DNI: ");
                    String dni = teclado.nextLine();

                    System.out.print("Posicion del amarre: ");
                    int posicion = teclado.nextInt();

                    System.out.print("Eslora: ");
                    double eslora = teclado.nextDouble();

                    System.out.print("Cantidad de mastiles: ");
                    int mastiles = teclado.nextInt();

                    Velero velero = new Velero(
                            "VEL-001",
                            eslora,
                            2026,
                            mastiles
                    );

                    Alquiler alquilerVelero = new Alquiler(
                            nombre,
                            dni,
                            LocalDate.of(2026, 9, 1),
                            LocalDate.of(2026, 9, 5),
                            posicion,
                            velero
                    );

                    puerto.agregarAlquiler(alquilerVelero);

                    System.out.println("Alquiler agregado correctamente.");

                    break;

                case 3:

                    System.out.println();
                    System.out.println("CREAR ALQUILER DE YATE");

                    teclado.nextLine();

                    System.out.print("Nombre del cliente: ");
                    String nombreYate = teclado.nextLine();

                    System.out.print("DNI: ");
                    String dniYate = teclado.nextLine();

                    System.out.print("Posicion del amarre: ");
                    int posicionYate = teclado.nextInt();

                    YateLujo yate = new YateLujo();

                    Alquiler alquilerYate = new Alquiler(
                            nombreYate,
                            dniYate,
                            LocalDate.of(2026, 9, 1),
                            LocalDate.of(2026, 9, 5),
                            posicionYate,
                            yate
                    );

                    puerto.agregarAlquiler(alquilerYate);

                    System.out.println("Alquiler agregado correctamente.");

                    break;

                case 4:

                    System.out.println("Programa finalizado.");

                    break;

                default:

                    System.out.println("Opcion incorrecta.");
            }
        }

        teclado.close();
    }
}
