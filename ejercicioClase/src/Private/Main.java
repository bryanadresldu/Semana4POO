package Private;

public class Main {

    public static void main(String[] args) {
    Persona persona=new Persona("Juan",25);
        System.out.println(persona.getNombre()+" tiene "+persona.getEdad()+" anios");
        //CON SET MODIFICO LOS ATRIBUTOS
        persona.setNombre("Julio");
        persona.setEdad(35);
        //CON GET MUESTRO LOS ATRIBUTOS
        System.out.println(persona.getNombre()+" tiene "+persona.getEdad()+" anios");

    }
}
