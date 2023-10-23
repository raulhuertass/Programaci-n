import java.util.Scanner;

public class EjericicioDiabetes {

    public static void main(String[] args) {


        final double cntHipog = 70;
        final double cntHipergl = 180;
        double cantGlucemia;
        boolean consciente;

        while (consciente = true) {

        System.out.println("Ingrese la cantidad de Glucemia");
        Scanner miScanner = new Scanner(System.in);
        cantGlucemia = miScanner.nextDouble();


            if (cantGlucemia < cntHipog) {

                System.out.println("El paciente tiene Hipoglucemia");
                System.out.println("¿Está consciente?");
                Scanner scConsciente = new Scanner(System.in);
                consciente = scConsciente.nextBoolean();


                if (consciente = true) {
                    System.out.println("Dar liquidos azucarados de absorsión rápida (Zumos, glucosport, azúcar...) /n" +
                            "Repetir glucemia 5-10 min después" + "Dar hidratos de carbono de absorción lenta(Galletas, bocadillo...)");




                } else if (consciente = false) {
                    System.out.println("NO DAR NADA POR BOCA");
                    System.out.println("ADMINISTRAR GLUCAGÓN, Avisar a familia y a Emergencias");

                } consciente=false;

            } else if (cantGlucemia > cntHipergl) {
                System.out.println("El paciente tiene Hiperlucemia");
                System.out.println("Administrar agua y avisar a su familia");

            } else{
                System.out.println("Su nivel de glucemia es normal");
            }

        }
            }
    }


