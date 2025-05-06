package Publico;

public class Main {

    public static void main(String[] args) {
        Persona persona1=new Persona("Luis",20);
        Persona persona2=new Persona("Carlos");

        persona1.cambiarNombre();
        persona2.cambiarNombre();
    }
}
