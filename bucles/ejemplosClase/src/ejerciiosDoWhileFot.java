import java.util.Scanner;

public class ejerciiosDoWhileFot {
    public static void main(String[] args){

        int numEntero, num1, num2, num3, i;
        num1=1;
        num2=1;

        System.out.println("Ingrese el número del cual desea calcular el factorial");
        Scanner miScan = new Scanner(System.in);
        numEntero = miScan.nextInt();


        for (i =1; i<=numEntero; i++) {

            if (numEntero<0){
                System.out.println("Ingrese un número positivo");
            } else {
                num3= num1 * num2;
                num2=num3;
                num1++;
            }
        }
         System.out.println("El numero factoial es " + num2);

    }

}

