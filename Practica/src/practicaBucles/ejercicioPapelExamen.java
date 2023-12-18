package practicaBucles;

import java.util.Scanner;

public class ejercicioPapelExamen {
    public static void main(String[] args) {


    int n;
    int cuadradroN;

    System.out.println("Introduce un numero");
    Scanner sc = new Scanner(System.in);
    n= sc.nextInt();

    cuadradroN=n*n;

    String r;

        for (r=""; n<=cuadradroN; n+=2){
            r += n+ ",";
        }

        System.out.println(r);
}
}
