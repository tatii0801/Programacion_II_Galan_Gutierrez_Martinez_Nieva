package grupal.TP_Herencia_Polimorfismo.Parte2Batalla;

// Guerrero hereda de Personaje
public class Guerrero extends Personaje {

    // Constructor con parámetros
    public Guerrero(int vida, int nivelAtaque, int nivelDefensa) {
        super(vida, nivelAtaque, nivelDefensa);
    }

    // Constructor por defecto
    // Establece los valores iniciales del Guerrero
    public Guerrero() {
        super(150, 30, 15);
    }

    // Redefinimos el método defender
    // El Guerrero reduce el daño recibido utilizando su nivel de defensa
    @Override
    public void defender(int puntos) {

        // Se calcula el daño restando la defensa al ataque recibido
        int danio = puntos - nivelDefensa;

        // El daño no puede ser negativo
        if (danio < 0) {
            danio = 0;
        }

        // Se descuenta el daño de la vida del Guerrero
        vida = vida - danio;

        System.out.println("Guerrero recibe "
                + danio + " puntos de dano.");

        // Si la vida llega a cero o es menor
        // significa que el Guerrero murió
        if (vida <= 0) {
            System.out.println("Muerte");

            // La vida no queda con un valor negativo
            vida = 0;
        }
    }

    // Devuelve el nombre del personaje
    @Override
    public String getNombre() {
        return "Guerrero";
    }
}