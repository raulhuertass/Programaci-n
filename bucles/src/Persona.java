public class Persona {

    String nombre;
    String apellidos;
    String numeroDNI;
    String paisNacimiento;
    char genero;
    int aNacimiento;


    Persona(String nombre, String apellidos, String numeroDNI, int aNacimiento, String paisNacimiento, char genero){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.numeroDNI=numeroDNI;
        this.aNacimiento=aNacimiento;
        this.paisNacimiento=paisNacimiento;
        this.genero=genero;
    }

    void  imprimir(){
        System.out.println("Nombre=" + nombre);
        System.out.println("Apellidos=" + apellidos);
        System.out.println("Numero de documento de indentidad="+ numeroDNI);
        System.out.println("Año de nacimiento="+ aNacimiento);
        System.out.println("Pais de nacimiento="+ paisNacimiento);
        System.out.println("Género=" + genero);
        System.out.println();
    }


    public static void main(String[] args) {
        Persona p1= new Persona("Pedro", "Perez","105311212","1998", "España", 'H');
        Persona p2= new Persona("Luis", "León", "137736292", "2001", "Belgica", 'H');
        p1.imprimir();
        p2.imprimir();
    }

}