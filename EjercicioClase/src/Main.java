import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
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
        System.out.println("0.Salir");

    }

    private static int recogerOpcion(){

        Scanner scanner= new Scanner(System.in);
        System.out.println("Seleccione mediante 1,2,3,4 la opción que de desea realizar y 0 para salir");
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
            case 3:
                numeroPrimo();
                break;

        }

    }

    private static boolean numeroPar(){
        int numeroPar;
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
        int mayorEdad;
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


    private static boolean numeroPrimo() {

        int numeroPrimo;
        boolean nPrimo = false;
        System.out.println("Ingrese un número para comprobar si es primo");
        Scanner sc = new Scanner(System.in);
        numeroPrimo= sc.nextInt();

        for (int contador=2; (numeroPrimo % contador)==0; contador++){

            if ((numeroPrimo==0)){
                System.out.println("El número es primo");
                nPrimo= true;
            } else {
                System.out.println("El número no es primo");
                nPrimo= false;
            }
             return nPrimo;
        }

        return nPrimo;
    } 


    }


