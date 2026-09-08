package grupal.TP_Herencia_Polimorfismo.Parte2Batalla;

// Acá hacemos exactamente lo que pide la consigna:
// Realizar tres combates entre los Personajes “Guerrero” y “Mago”.
// Cada combate crea personajes nuevos.

public class TestBatalla {

    // Esto es importante porque si en el primer combate el Guerrero muere, no
    // podemos reutilizarlo para el segundo.

    // Clase utilizada para realizar pruebas

    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println("          TEST DE BATALLA");
        System.out.println("===================================");

        // Creamos el primer Guerrero y Mago
        Personaje guerrero1 = new Guerrero();
        Personaje mago1 = new Mago();

        // Creamos la primera batalla
        Batalla batalla1 = new Batalla(
                guerrero1,
                mago1);

        // Realizamos el primer combate
        System.out.println();
        System.out.println("********** COMBATE 1 **********");
        batalla1.iniciarCombate();

        // Creamos el segundo Guerrero y Mago
        Personaje guerrero2 = new Guerrero();
        Personaje mago2 = new Mago();

        // Creamos la segunda batalla
        Batalla batalla2 = new Batalla(
                guerrero2,
                mago2);

        // Realizamos el segundo combate
        System.out.println();
        System.out.println("********** COMBATE 2 **********");
        batalla2.iniciarCombate();

        // Creamos el tercer Guerrero y Mago
        Personaje guerrero3 = new Guerrero();
        Personaje mago3 = new Mago();

        // Creamos la tercera batalla
        Batalla batalla3 = new Batalla(
                guerrero3,
                mago3);

        // Realizamos el tercer combate
        System.out.println();
        System.out.println("********** COMBATE 3 **********");
        batalla3.iniciarCombate();

        System.out.println();
        System.out.println("===================================");
        System.out.println("           FIN DEL TEST");
        System.out.println("===================================");
    }
}