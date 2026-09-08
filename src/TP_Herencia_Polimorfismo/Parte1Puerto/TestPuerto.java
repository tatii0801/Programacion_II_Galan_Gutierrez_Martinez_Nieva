package TP_Herencia_Polimorfismo.Parte1Puerto;

public class TestPuerto {

    // Este sería como los Test que veníamos haciendo.

    // Sirve para probar la parte 1 sin necesidad de usar el menú.

    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println("          TEST PUERTO");
        System.out.println("===================================");

        // Crear un puerto utilizando
        // el constructor con datos de prueba
        Puerto puerto = new Puerto();

        // Mostrar los alquileres
        puerto.mostrarAlquileres();

        System.out.println();
        System.out.println("===================================");
        System.out.println("       FIN DEL TEST");
        System.out.println("===================================");
    }
}

/**
 * ¿Qué ventaja tiene esto?
 * 
 * Cuando ejecutás: TestPuerto.java
 * no tenés que cargar nada.
 * 
 * El constructor: public Puerto()
 * 
 * ya crea automáticamente:
 * + new Alquiler()
 * 
 * y ese alquiler ya tiene: new Velero()
 *  Entonces podés probar todo rápidamente.
 */