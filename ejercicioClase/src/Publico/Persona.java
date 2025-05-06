package Publico;

public class Persona {

    public String nombre;
    public int edad;


    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }


    public void cambiarNombre() {
         /*  this.nombre = nombre;
           edad = nuevaEdad;*/
        System.out.println("Nombre del persona: " + nombre+"\nEdad del persona: " + edad);
    }
}
