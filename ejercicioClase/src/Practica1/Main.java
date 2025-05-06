package Practica1;

public class Main {

    public static void main(String[] args) {


        Persona p=new Persona();
        System.out.println("Nombre de la persona: "+p.getNombre()+" tiene "+p.getEdad()+" anios");
        p.setNombre("Luisa");
        p.setEdad(12);
        p.imprimir();
        p.setNombre("Martin");
        p.setEdad(15);
        p.imprimir();
    }
}
