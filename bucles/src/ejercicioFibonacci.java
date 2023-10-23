import java.util.Scanner;

public class ejercicioFibonacci {

    public static void main(String[] args) {

        //entrada

        int num1, num2, suma, contador2;
        num1=0;
        num2=1;

        System.out.println("Ingrese el numero de fibonacci que desee calcular");
        Scanner newScanner = new Scanner(System.in);
        contador2= newScanner.nextInt();
        int i = 1;

            while(contador2>=i) {

                System.out.println(num1 + " ");
                suma= num1 + num2;
                num1=num2;
                num2=suma;
                i++;


         }


    }

}
