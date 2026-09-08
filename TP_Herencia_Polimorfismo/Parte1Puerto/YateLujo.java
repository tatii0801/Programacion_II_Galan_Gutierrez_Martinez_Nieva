package Programacion_II_Galan_Gutierrez_Martinez_Nieva.TP_Herencia_Polimorfismo.Parte1Puerto;

public class YateLujo extends Barco {

    // Atributos propios del yate de lujo
    private int potenciaCV;
    private int numeroCamarotes;

    // Constructor con datos
    public YateLujo(String matricula, double eslora,
            int anioFabricacion, int potenciaCV,
            int numeroCamarotes) {

        super(matricula, eslora, anioFabricacion);

        this.potenciaCV = potenciaCV;
        this.numeroCamarotes = numeroCamarotes;
    }

    // Constructor sin parametros con datos de prueba
    public YateLujo() {

        super();

        potenciaCV = 500;
        numeroCamarotes = 6;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public int getNumeroCamarotes() {
        return numeroCamarotes;
    }

    // Redefinimos el calculo del modulo
    @Override
    public double calcularModulo() {

        return super.calcularModulo()
                + potenciaCV
                + numeroCamarotes;
    }

    @Override
    public void mostrarDatos() {

        super.mostrarDatos();

        System.out.println("Potencia: " + potenciaCV + " CV");
        System.out.println("Numero de camarotes: " + numeroCamarotes);
    }
}