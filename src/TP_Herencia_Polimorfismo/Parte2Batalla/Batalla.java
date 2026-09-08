package TP_Herencia_Polimorfismo.Parte2Batalla;

import java.util.Random;

// Clase que representa una batalla entre dos personajes
public class Batalla {

    // Los personajes que participan en la batalla
    private Personaje personaje1;
    private Personaje personaje2;

    // Constructor que recibe los dos personajes
    public Batalla(Personaje personaje1, Personaje personaje2) {
        this.personaje1 = personaje1;
        this.personaje2 = personaje2;
    }

    // Constructor por defecto
    // Crea automáticamente un Guerrero y un Mago
    public Batalla() {
        personaje1 = new Guerrero();
        personaje2 = new Mago();
    }

    // Método que inicia el combate
    public void iniciarCombate() {

        // Se crea un objeto Random para elegir
        // aleatoriamente quién comienza
        Random random = new Random();

        // nextBoolean() devuelve true o false
        boolean empiezaPersonaje1 = random.nextBoolean();

        System.out.println();
        System.out.println("======================================");
        System.out.println("           INICIO DEL COMBATE");
        System.out.println("======================================");

        // Mostramos los datos iniciales
        System.out.println("Personaje 1: "
                + personaje1.getNombre());

        System.out.println("Vida: "
                + personaje1.getVida());

        System.out.println();

        System.out.println("Personaje 2: "
                + personaje2.getNombre());

        System.out.println("Vida: "
                + personaje2.getVida());

        System.out.println();

        // Informamos quién comienza
        if (empiezaPersonaje1) {

            System.out.println("Comienza atacando: "
                    + personaje1.getNombre());

        } else {

            System.out.println("Comienza atacando: "
                    + personaje2.getNombre());
        }

        System.out.println();

        // El combate continúa mientras
        // los dos personajes tengan vida
        while (personaje1.estaVivo()
                && personaje2.estaVivo()) {

            // Si comienza el personaje 1
            if (empiezaPersonaje1) {

                // El personaje 1 ataca al personaje 2
                realizarAtaque(personaje1, personaje2);

                // El personaje 2 solamente ataca
                // si todavía está vivo
                if (personaje2.estaVivo()) {

                    realizarAtaque(personaje2, personaje1);
                }

            } else {

                // El personaje 2 ataca al personaje 1
                realizarAtaque(personaje2, personaje1);

                // El personaje 1 solamente ataca
                // si todavía está vivo
                if (personaje1.estaVivo()) {

                    realizarAtaque(personaje1, personaje2);
                }
            }
        }

        // Mostramos el resultado del combate
        System.out.println("======================================");
        System.out.println("            FIN DEL COMBATE");
        System.out.println("======================================");

        // Determinamos quién ganó
        if (personaje1.estaVivo()) {

            System.out.println("Ganador: "
                    + personaje1.getNombre());

        } else {

            System.out.println("Ganador: "
                    + personaje2.getNombre());
        }

        // Mostramos la vida final de ambos
        System.out.println();

        System.out.println("Vida final de "
                + personaje1.getNombre()
                + ": "
                + personaje1.getVida());

        System.out.println("Vida final de "
                + personaje2.getNombre()
                + ": "
                + personaje2.getVida());

        System.out.println();
    }

    // Método privado que realiza un ataque
    private void realizarAtaque(Personaje atacante,
            Personaje defensor) {

        System.out.println(atacante.getNombre()
                + " ataca a "
                + defensor.getNombre());

        // Obtenemos los puntos de ataque
        // utilizando el método atacar()
        Integer puntosAtaque = atacante.atacar();

        System.out.println("Puntos de ataque: "
                + puntosAtaque);

        // El defensor recibe el ataque
        // y aplica su propia forma de defensa
        defensor.defender(puntosAtaque);

        // Mostramos la vida que le queda al defensor
        System.out.println("Vida de "
                + defensor.getNombre()
                + ": "
                + defensor.getVida());

        System.out.println();
    }
}