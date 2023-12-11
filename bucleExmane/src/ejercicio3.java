import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean bSalimos=true;
        boolean bBucle1=true;
        boolean bBucle2=true;
        int nJugador=0, nAdroid=0, nEmpate=0;
        String respuesta;
        Scanner sc = new Scanner(System.in);

        while (bSalimos){
            System.out.println("MENÚ");
            System.out.println("-----------");
            System.out.println("1.Hacer algoritmo");
            System.out.println("2.Mostrar estadisticas");
            System.out.println("3.Salir");

            respuesta=sc.nextLine();

                if (respuesta.compareTo("1")==0){

                    while (bBucle1){
                        bBucle2=true;
                        System.out.println("Turno de jugador");
                        System.out.println("Comprobar fichas");

                            while (bBucle2){
                                System.out.println("¿Existen 2 fichas alineadas?");
                                respuesta=sc.nextLine();

                                    if (respuesta.compareTo("NO")==0){
                                        System.out.println("Pongo en un epacio vacio");
                                        System.out.println("¿Está todo el tablero ocupado?");
                                        respuesta=sc.nextLine();

                                            if (respuesta.compareTo("SI")==0){
                                                System.out.println("EMPATE");
                                                nEmpate++;
                                                bBucle2=false;
                                                bBucle1=false;
                                            } else {
                                                bBucle2=false;
                                            }
                                    } else if (respuesta.compareTo("ANDROID")==0){
                                        System.out.println("Pongo en el tercer hueco para hanar");
                                        System.out.println("GANA ANDROID");
                                        nAdroid++;
                                        bBucle1 = false; bBucle2= false;

                                    } else if (respuesta.compareTo("JUGADOR")==0) {
                                        System.out.println("Pongo en el tercer hueco para evitar perder");
                                        System.out.println("¿Ha ganado el jugador?");
                                        respuesta=sc.nextLine();
                                            if (respuesta.compareTo("SI")==0){
                                                System.out.println("GANA JUGADOR");
                                                nJugador++;
                                                bBucle1=false;
                                                bBucle2=false;
                                            } else {
                                                System.out.println("¿Está todo el tablero ocupado?");
                                                respuesta=sc.nextLine();
                                                    if (respuesta.compareTo("SI")==0){
                                                        System.out.println("EMPATE");
                                                        bBucle1=false;
                                                        bBucle2=false;
                                                        nEmpate++;

                                                    } else {
                                                        bBucle2=false;
                                                    }
                                            }
                                    }
                            }
                    }

                } else if (respuesta.compareTo("2")==0) {
                    System.out.println("ESTADISTICAS");
                    System.out.println("-------------");
                    System.out.println("Jugador " + nJugador);
                    System.out.println("Andoid " + nAdroid);
                    System.out.println("Empate " + nEmpate);

                } else {
                    bSalimos=false;
                }

        bBucle1=true;
        bBucle2=true;
        }

    }
}