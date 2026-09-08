package TP_Herencia_Polimorfismo.Parte1Puerto;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler {

    //datos del alquiler
    private String nombreCliente;
    private String dniCliente;

    //Para las fechas utilizamos LocalDate
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    private int posicionAmarre;

    // El barco que ocupa el amarre
    private Barco barco;

    // Valor fijo indicado en el enunciado
    private static final double VALOR_FIJO = 50000;

    // Constructor con datos
    public Alquiler(String nombreCliente, String dniCliente,
            LocalDate fechaInicio, LocalDate fechaFin,
            int posicionAmarre, Barco barco) {

        this.nombreCliente = nombreCliente;
        this.dniCliente = dniCliente;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    // Constructor sin parametros con datos de prueba
    public Alquiler() {

        nombreCliente = "Juan Perez";
        dniCliente = "30111222";

        fechaInicio = LocalDate.of(2026, 9, 1);
        fechaFin = LocalDate.of(2026, 9, 5);

        posicionAmarre = 1;

        // Polimorfismo:
        // La variable es de tipo Barco,
        // pero contiene un Velero.
        barco = new Velero();
    }

    // Calcula los dias de ocupacion
    // Se cuenta el dia inicial y el dia final
    public long calcularDias() {

        return ChronoUnit.DAYS.between(fechaInicio, fechaFin) + 1;
    }

    // Calcula el precio total del alquiler
    public double calcularAlquiler() {

        return calcularDias()
                * barco.calcularModulo()
                * VALOR_FIJO;
    }

    // Muestra los datos del alquiler
    public void mostrarAlquiler() {

        System.out.println("-----------------------------------");
        System.out.println("DATOS DEL ALQUILER");
        System.out.println("-----------------------------------");

        System.out.println("Cliente: " + nombreCliente);
        System.out.println("DNI: " + dniCliente);
        System.out.println("Fecha inicio: " + fechaInicio);
        System.out.println("Fecha fin: " + fechaFin);
        System.out.println("Posicion del amarre: " + posicionAmarre);

        System.out.println();
        System.out.println("DATOS DEL BARCO");

        barco.mostrarDatos();

        System.out.println();
        System.out.println("Dias de ocupacion: " + calcularDias());
        System.out.println("Costo total: $" + calcularAlquiler());

        System.out.println("-----------------------------------");
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getDniCliente() {
        return dniCliente;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }
}