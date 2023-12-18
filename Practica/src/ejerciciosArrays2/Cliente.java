package ejerciciosArrays2;

import java.security.PublicKey;

public class Cliente {
    String DNI;
    String nombre;
    String apellidos;
    String direccion;
    int edad;
    int fechaNac;
    int telefono;
    String email;

    public Cliente(String DNI, String nombre, String apellidos, String direccion, int telefono, int edad, int fechaNac, String email){
        this.DNI=DNI;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.direccion=direccion;
        this.edad=edad;
        this.fechaNac=fechaNac;
        this.telefono=telefono;
        this.email=email;
    }
}
