package Practica1;

public class Persona {
    private String nombre;
    private int edad;

    public Persona() {
        this.nombre = "Felipe";
        this.edad = 30;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void imprimir() {
        System.out.println("Nombre de la persona: "+nombre+"tiene "+edad+" anios");
    }
}
