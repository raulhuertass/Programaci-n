import java.util.Scanner;

public class ejercicioClase {

    private static int numeroPar;
    private static int mayorEdad;
    private int diaSemana;
    private int numeroPrimo;

    public ejercicioClase(int numeroPar, int mayorEdad, int diaSemana, int numeroPrimo) {
        this.numeroPar=numeroPar;
        this.mayorEdad=mayorEdad;
        this.diaSemana=diaSemana;
        this.numeroPrimo=numeroPrimo;
    }



    public static void main(String[] args) {

        int opcion;

        do {
            mostrarMenu();
            opcion=recogerOpcion();
            hacerMenu(opcion);
        } while (opcion!=0);


    }



    private static void mostrarMenu(){

        System.out.println("---------------------------");
        System.out.println("MENÚ");
        System.out.println("---------------------------");
        System.out.println("1.Número par");
        System.out.println("2.Mayor de edad");
        System.out.println("3.Dia de la semana");
        System.out.println("4.Número primo");

    }

    private static int recogerOpcion(){

        Scanner scanner= new Scanner(System.in);
        System.out.println("Seleccione mediante 1,2,3,4 la opción que de desea realizar");
        return scanner.nextInt();

    }
    
    private static void hacerMenu(int opcion){

        switch (opcion){
            case 1:
                numeroPar();
                break;
            case 2:
                mayorEdad();
                break;

        }

    }

    private static boolean numeroPar(){

        boolean resultado;
        System.out.println("Introduzca un número");
        Scanner sc = new Scanner(System.in);
        numeroPar=sc.nextInt();

            if (numeroPar%2==0){
                System.out.println("Tu número es par");
               resultado=true;
            } else {
                System.out.println("Tu número es impar");
               resultado=false;
            }
            return resultado;
    }

    private static boolean mayorEdad(){
        boolean mEdad;
        System.out.println("Ingrese edad");
        Scanner sc = new Scanner(System.in);
        mayorEdad=sc.nextInt();

            if (mayorEdad>=18){
                System.out.println("Es mayor de edad");
                mEdad=true;
            } else {
                System.out.println("No es mayor de edad");
                mEdad=false;
            }
            return mEdad;

    }


}
