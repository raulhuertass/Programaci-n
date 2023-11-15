package Practica;

public class Animal {
    //Argumentos
    private String nombre;
    private int edad;
    private String raza;

    //Constructor
    public Animal(String nombre, int edad, String raza){
        this.nombre=nombre;
        this.edad=edad;
        this.raza=raza;
    }

    //Metodos

    public int getEdad(){

        return edad;
    }

    public void setEdad(int nuevaEdad){
        edad= nuevaEdad;
    }

    public String getNombre(){
        return nombre;
    }


    public void setNombre(String nuevoNombre){
        nombre= nuevoNombre;
    }
}
