import java.util.Scanner;

public class myc {
    public static void main(String[] args) {

        int num1, num2, multXY, multMin;


        System.out.println("Introduzca 2 números de los que se quiere hayar el MCM y MCD");
        Scanner sc = new Scanner(System.in);
        num1=sc.nextInt();
        sc.nextLine();
        num2=sc.nextInt();

        multXY=num1*num2;
        multMin=multXY;


        for (int i=multXY; i >= Math.max(num1,num2); i--){

            if (i%num1==0 && i%num2==0){
                    multMin=i;
                }

            }
                 System.out.println("EL MCM de" + num1 + " " + "y" + num2 + "es" + multMin);


    }
}





