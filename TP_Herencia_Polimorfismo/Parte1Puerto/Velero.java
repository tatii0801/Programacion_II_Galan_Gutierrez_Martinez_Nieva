package Programacion_II_Galan_Gutierrez_Martinez_Nieva.TP_Herencia_Polimorfismo.Parte1Puerto;

//aqui aparece la herencia
public class Velero extends Barco {

    // Atributo propio del velero

    //El Velero reutiliza los atributos de Barco y agrega:
    private int numeroMastiles;

    // Constructor con datos
    public Velero(String matricula, double eslora, int anioFabricacion, int numeroMastiles) {

        super(matricula, eslora, anioFabricacion);

        this.numeroMastiles = numeroMastiles;
    }

    // Constructor sin parametros con datos de prueba
    public Velero() {

        super();

        //datos de prueba para colocar de refencia cunado no se ingresan datos 
        numeroMastiles = 2;
    }

    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    // Redefinimos el calculo del modulo
    @Override
    public double calcularModulo() {

        return super.calcularModulo() + numeroMastiles;
    }

    @Override
    public void mostrarDatos() {

        super.mostrarDatos();

        System.out.println("Numero de mastiles: " + numeroMastiles);
    }
}