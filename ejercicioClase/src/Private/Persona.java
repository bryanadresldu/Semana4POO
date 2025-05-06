package Private;

public class Persona {

    private String nombre;
    private int edad;
//CONSTRUCTOR
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
//PARA TOMAR INFORMACION Y MOSTRAR
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
//PARA EDITAR INFORMACION
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
