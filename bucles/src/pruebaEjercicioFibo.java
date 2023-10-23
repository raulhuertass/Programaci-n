import java.util.Scanner;

public class pruebaEjercicioFibo {

    public static void main(String[] args) {

        int num1, num2, suma, contador;
        num1=0;
        num2=1;

        System.out.println("Introduzca el numero de Fibonachi que desea calcular ");
        Scanner miScanner = new Scanner (System.in);
        contador= miScanner.nextInt();

        int i= 1;

        while(contador>=i) {
            System.out.println(num1 + "");
            suma = num1 + num2;
            num1=num2;
            num2=suma;
            i++;

        }
    }

    public static class mcdYmcm {
        public static void main(String[] args) {

            int num1, divisor;
            divisor=2;


            System.out.println("Ingrese el numero");
            Scanner newSrc = new Scanner(System.in);
            num1=newSrc.nextInt();



        }
    }
}
