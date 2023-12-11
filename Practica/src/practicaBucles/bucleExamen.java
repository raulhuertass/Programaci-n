package practicaBucles;

import java.util.Scanner;

public class bucleExamen {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int bucle1=0;
        int bucle2=0;
        int bucle3=0;
        String respuesta1, respuesta2;

        System.out.println("Realizar un programa");
        System.out.println("-----------------------------");
        System.out.println("Determino la función del programa");

        while(bucle1==0){
        System.out.println("Planteo el porgrama");
        System.out.println("Abro el compilador");

            while (bucle2 == 0){

                while (bucle3 == 0) { //Bucle Tengo Dudas
                    System.out.println("Pogramo");
                    System.out.println("¿Tengo dudas?");
                    respuesta1 = sc.nextLine();
                        if (respuesta1.compareTo("no") == 0) {
                            bucle3 = 1;
                        } else {
                            System.out.println("Repaso teoria");
                            bucle3 = 0;
                        }

                }

            System.out.println("Pulso tecla compilar");
            System.out.println("¿Hay algun error?");
            respuesta2=sc.nextLine();
                if (respuesta2.compareTo("si")==0){
                    System.out.println("Corrijo el codigo fuente");
                    bucle2=0;
                } else {
                    bucle2=1;
                }
            }



        }


    }

}
