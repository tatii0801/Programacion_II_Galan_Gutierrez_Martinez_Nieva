package Programacion_II_Galan_Gutierrez_Martinez_Nieva.TP_Herencia_Polimorfismo.Parte1Puerto;

import java.util.ArrayList;

//El puerto mantiene los alquileres

//La clase Puerto puede encargarse de administrar los alquileres realizados en el puerto
public class Puerto {

    private String nombre;
    private ArrayList<Alquiler> alquileres;

    // Constructor con datos
    public Puerto(String nombre) {

        this.nombre = nombre;
        alquileres = new ArrayList<>();
    }

    // Constructor sin parametros con datos de prueba
    public Puerto() {

        nombre = "Puerto Principal";

        alquileres = new ArrayList<>();

        // Agregamos un alquiler de prueba
        alquileres.add(new Alquiler());
    }

    // Agregar un alquiler
    public void agregarAlquiler(Alquiler alquiler) {

        alquileres.add(alquiler);
    }

    // Mostrar todos los alquileres
    public void mostrarAlquileres() {

        System.out.println();
        System.out.println("===================================");
        System.out.println("PUERTO: " + nombre);
        System.out.println("===================================");

        if (alquileres.isEmpty()) {

            System.out.println("No hay alquileres registrados.");

        } else {

            for (Alquiler alquiler : alquileres) {

                alquiler.mostrarAlquiler();
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Alquiler> getAlquileres() {
        return alquileres;
    }
}
