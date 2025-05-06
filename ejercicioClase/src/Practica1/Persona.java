package Practica1;

public class Persona {
    private String nombre;


    public void imprimir() {
              System.out.println("Nombre de la persona: "+nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
