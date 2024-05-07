package org.example;

public class Main {
    public static void main(String[] args) {
        Ciudades ciudad1 = Ciudades.BOGOTA;
        System.out.println("La ciudad de " + ciudad1.getNombre() + " tiene un clima " + ciudad1.getClima() + ", " + ciudad1.mostrarDescripcionCiudad() + " y tiene una población de " + ciudad1.getHabitantes() + " habitantes.");
        System.out.println("Estado de actividad: " + Ciudades.EstadoActividad(ciudad1));

        Ciudades ciudad2 = Ciudades.MEDELLIN;
        System.out.println("La ciudad de " + ciudad2.getNombre() + " tiene un clima " + ciudad2.getClima() + ", " + ciudad2.mostrarDescripcionCiudad() + " y tiene una población de " + ciudad2.getHabitantes() + " habitantes.");
        System.out.println("Estado de actividad: " + Ciudades.EstadoActividad(ciudad2));

        Ciudades ciudad3 = Ciudades.CALI;
        System.out.println("La ciudad de " + ciudad3.getNombre() + " tiene un clima " + ciudad3.getClima() + ", " + ciudad3.mostrarDescripcionCiudad() + " y tiene una población de " + ciudad3.getHabitantes() + " habitantes.");
        System.out.println("Estado de actividad: " + Ciudades.EstadoActividad(ciudad3));
    }
}
