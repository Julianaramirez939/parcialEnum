package org.example;

public enum Ciudades {
    BOGOTA("Bogota","frio","Capital de colombia",20000) {
        @Override
        public String mostrarDescripcionCiudad() {
            return BOGOTA.getDescripcion();
        }
    },
    MEDELLIN("Medellin","templado","Ciudad turistica",34000) {
        @Override
        public String mostrarDescripcionCiudad() {
            return MEDELLIN.getDescripcion();
        }
    },
    CALI("cali","caliente","Ciudad normal",23000) {
        @Override
        public String mostrarDescripcionCiudad() {
            return CALI.getDescripcion();
        }
    };

    private String nombre;
    private String clima;
    private String descripcion;
    private int habitantes;

    public String getNombre() {
        return nombre;
    }

    public String getClima() {
        return clima;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getHabitantes() {
        return habitantes;
    }

    Ciudades(String nombre,String clima, String descripcion, int habitantes) {
        this.nombre = nombre;
        this.clima =clima;
        this.descripcion = descripcion;
        this.habitantes = habitantes;
    }

    public abstract String mostrarDescripcionCiudad();

    public static String EstadoActividad(Ciudades ciudad) {
        if (ciudad.getHabitantes() > 10000) {
            return "Activa";
        } else {
            return "Desactivada";
        }
    }
}