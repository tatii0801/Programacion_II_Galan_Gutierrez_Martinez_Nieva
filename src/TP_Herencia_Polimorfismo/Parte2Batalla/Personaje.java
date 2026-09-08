package TP_Herencia_Polimorfismo.Parte2Batalla;

// Clase abstracta que representa a un personaje de la batalla
public abstract class Personaje {

    // Atributos comunes de todos los personajes
    protected int vida;
    protected int nivelAtaque;
    protected int nivelDefensa;

    // Constructor de la clase Personaje
    public Personaje(int vida, int nivelAtaque, int nivelDefensa) {
        this.vida = vida;
        this.nivelAtaque = nivelAtaque;
        this.nivelDefensa = nivelDefensa;
    }

    // Método que devuelve los puntos de ataque del personaje
    // Este método es común para Guerrero y Mago
    public int atacar() {
        return nivelAtaque;
    }

    // Método abstracto:
    // cada subclase debe definir cómo se defiende
    public abstract void defender(int puntos);

    // Permite saber si el personaje todavía tiene vida
    public boolean estaVivo() {
        return vida > 0;
    }

    // Devuelve la cantidad de vida actual
    public int getVida() {
        return vida;
    }

    // Devuelve el nivel de ataque
    public int getNivelAtaque() {
        return nivelAtaque;
    }

    // Devuelve el nivel de defensa
    public int getNivelDefensa() {
        return nivelDefensa;
    }

    // Cada personaje devuelve su nombre
    public abstract String getNombre();
}