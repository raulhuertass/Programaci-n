import java.util.Scanner;

public class ejercicioPC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String respuesta;
        String respuestaPregunta;
        boolean bTF= true;

        int iProbarPant=0, iCambiarFuente=0;

        while (bTF=true){

            System.out.println("Menú de opciones");
            System.out.println("----------------------");
            System.out.println("1. Realizar prueba");
            System.out.println("2. Mostrar Estadisticas");
            System.out.println("Cualquier otra cosa, salir");

            respuesta=sc.nextLine();


            if (respuesta.compareTo("1")==0){

                System.out.println("¿Se enciende el LED al encender el ordenador?:. si/no");
                respuestaPregunta=sc.nextLine();

                        if (respuestaPregunta.compareTo("si")==0);{

                            System.out.println("Está la pantalla conectada por cable: si/no");

                        } else

            }

        }


    }
}
