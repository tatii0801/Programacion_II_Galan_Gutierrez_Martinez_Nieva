package Programacion_II_Galan_Gutierrez_Martinez_Nieva.TP_Herencia_Polimorfismo.Parte1Puerto;

public class DeportivoMotor extends Barco {

    // Atributo propio del barco deportivo
    private int potenciaCV;

    // Constructor con datos
    public DeportivoMotor(String matricula, double eslora,
            int anioFabricacion, int potenciaCV) {

        super(matricula, eslora, anioFabricacion);

        this.potenciaCV = potenciaCV;
    }

    // Constructor sin parametros con datos de prueba
    public DeportivoMotor() {

        super();

        potenciaCV = 300;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    // Redefinimos el calculo del modulo
    @Override
    public double calcularModulo() {

        return super.calcularModulo() + potenciaCV;
    }

    @Override
    public void mostrarDatos() {

        super.mostrarDatos();

        System.out.println("Potencia: " + potenciaCV + " CV");
    }
}