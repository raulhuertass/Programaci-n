import java.util.Scanner;

public class diagrama3 {
    public static void main(String[] args) {


        int bucle1=0;
        int bucle2=0;
        int bucle3=0;
        String respues1;
        String respues2;
        String respues3;

        Scanner sc = new Scanner(System.in);

        System.out.println("Habilitar Inte. por TMR0, GIE = TOIE = 1");
        System.out.println("Cargar registro auxilixar Reg1 con d'45'");

            while (bucle1==0){

                System.out.println("Cargar registro auxiliar Reg2 con d'100'");

                    while (bucle2==0){

                        System.out.println("Cargar TMR0 con d'216'");

                        while(bucle3==0){

                            System.out.println("Cual es el valor de TMR0 Bit7?");
                            respues1 = sc.nextLine();
                                    if (respues1.compareTo("0")==0){
                                        bucle3=1;
                                    } else {
                                        bucle3=0;
                                    }

                        }

                        System.out.println("Hace Reg2 -1");
                        System.out.println("Cual es el valor de Reg2?");
                        respues2=sc.nextLine();
                            if (respues2.compareTo("0")==0){
                                bucle2=1;
                            } else {
                                bucle2=0;
                                bucle3=0;
                            }
                    }

                System.out.println("Hace Reg1 -1");
                System.out.println("Cual es el valor de Reg1?");
                respues3=sc.nextLine();
                        if (respues3.compareTo("0")==0){
                            bucle1=1;
                        } else {
                            bucle3 = 0;
                            bucle2 = 0;
                            bucle1 = 0;
                        }


            } System.out.println("Continua con el programa principal");









    }
}
