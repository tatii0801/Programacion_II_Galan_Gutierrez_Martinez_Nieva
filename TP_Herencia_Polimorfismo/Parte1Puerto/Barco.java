package grupal.TP_Herencia_Polimorfismo.Parte1Puerto;

//clase padre
public class Barco {

    // clase deportivo yate velero

    // Atributos comunes de todos los barcos
    private String matricula;
    private double eslora;
    private int anioFabricacion;

    // Constructor con datos
    public Barco(String matricula, double eslora, int anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    // Constructor sin parametros con datos de prueba
    public Barco() {
        matricula = "BAR-001";
        eslora = 10.0;
        anioFabricacion = 2020;
    }

    // Getter de matricula
    public String getMatricula() {
        return matricula;
    }

    // Getter de eslora
    public double getEslora() {
        return eslora;
    }

    // Getter del año de fabricacion
    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    // Calcula el modulo normal
    public double calcularModulo() {
        return 10 * eslora;
    }

    // Muestra los datos
    public void mostrarDatos() {

        System.out.println("Matricula: " + matricula);
        System.out.println("Eslora: " + eslora + " metros");
        System.out.println("Anio de fabricacion: " + anioFabricacion);
        System.out.println("Modulo: " + calcularModulo());
    }
}