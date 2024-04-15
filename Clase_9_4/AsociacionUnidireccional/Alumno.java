package Clase_9_4.AsociacionUnidireccional;

public class Alumno {
    String nombre;
    Universidad universidadAsiste;




    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Universidad getUniversidadAsiste() {
        return universidadAsiste;
    }


    public void setUniversidadAsiste(Universidad universidadAsiste) {
        this.universidadAsiste = universidadAsiste;
    }


    public Alumno(){};
    public Alumno(String nombre, Universidad universidadAsiste) {
        this.nombre = nombre;
        this.universidadAsiste = universidadAsiste;
    }

    public void showUni(){
        System.out.println("El estudiante " + nombre + " asiste a la universidad " + this.universidadAsiste.getNombreUniversidad());
    }

    public void cambiarUniversidad(Universidad universidad){
        this.setUniversidadAsiste(universidad);
    }








}
