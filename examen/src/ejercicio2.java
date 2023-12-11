import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int nSueldo;
        int nTotalS;
        int nTotalI;
        int nIRPF=0;
        boolean bSalimos=true;
        Scanner sc = new Scanner(System.in);

            while (bSalimos){

                System.out.println("Introduzca el sueldo (Entre 10000 y 60000). Fuera de rango salimos:");
                nSueldo= sc.nextInt();

                    if (nSueldo>10000 && nSueldo<60000){

                            if (nSueldo <30000){
                                nIRPF=nSueldo*10/100;
                                System.out.println("El sueldo es de " + nSueldo + " el IRPF es el 10% que es " + nIRPF);

                            } else if (nSueldo>30001 && nSueldo<50000 ) {
                                nIRPF= nSueldo*15/100;
                                System.out.println("El sueldo es de " + nSueldo + " el IRPF es el 15% que es " + nIRPF);

                            } else if (nSueldo>50001) {
                                nIRPF= nSueldo*20/100;
                                System.out.println("El sueldo es de " + nSueldo + " el IRPF es el 20% que es " + nIRPF);                            }

                    } else {
                        System.out.println("Fuera de rango, salimos");
                        bSalimos= false;
                    }

                nTotalS=nSueldo;
                nTotalI=nIRPF;
                int nTotSul= nSueldo+nTotalS;
                int nTotIrp= nIRPF+nTotalI;

                System.out.println("Totales: " + nTotSul + " y " + nTotIrp + " en IRPF");

                nSueldo=0;
                nIRPF=0;

            }



    }
}