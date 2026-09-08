package grupal.TP_Herencia_Polimorfismo.Parte2Batalla;

// Mago hereda de Personaje
public class Mago extends Personaje {

    // Constructor con parámetros
    public Mago(int vida, int nivelAtaque, int nivelDefensa) {
        super(vida, nivelAtaque, nivelDefensa);
    }

    // Constructor por defecto
    // Establece los valores iniciales del Mago
    public Mago() {
        super(100, 40, 10);
    }

    // Redefinimos el método defender
    // El Mago tiene una forma diferente de defenderse
    @Override
    public void defender(int puntos) {

        // El Mago utiliza el doble de su nivel de defensa
        int danio = puntos - (nivelDefensa * 2);

        // El daño no puede ser negativo
        if (danio < 0) {
            danio = 0;
        }

        // Se descuenta el daño de la vida del Mago
        vida = vida - danio;

        System.out.println("Mago recibe "
                + danio + " puntos de dano.");

        // Si la vida llega a cero o es menor
        // significa que el Mago murió
        if (vida <= 0) {
            System.out.println("Muerte");

            // La vida no queda con un valor negativo
            vida = 0;
        }
    }

    // Devuelve el nombre del personaje
    @Override
    public String getNombre() {
        return "Mago";
    }
}