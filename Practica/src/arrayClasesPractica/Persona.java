package arrayClasesPractica;

public class Persona {


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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    String nombre;
    int edad;
    int dni;


    public Persona(String nombre, int edad, int dni){
        this.nombre=nombre;
        this.edad=edad;
        this.dni=dni;


    }
}
