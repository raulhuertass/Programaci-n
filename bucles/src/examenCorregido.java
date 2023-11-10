import java.util.Scanner;

public class examenCorregido {
    public static void main(String[] args) {

        boolean bErrores, bDudas, bErrorPlantea, bFunciona;
        bErrores=true;
        bErrorPlantea=true;
        bFunciona=false;
        bDudasr=true;
        String respuesta;

        Scanner sc = new Scanner(System.in);

        while (bDudas) {

            //bucle interior, el de las dudas
            System.out.println("Repaso teoría");
            System.out.println("Programo");
            System.out.println("Tengo dudas(S=SI, Otra cosa=NO)");

            respuesta= sc.nextLine();
            bDudas = respuesta.compareTo("S")==0; //esto es igual que si pusiesemos un if

        }

        System.out.println("Pulsa la tecla compilar");
        System.out.println("¿Hay algun error?(S=SI, Otra cosa para no)");

        respuesta=sc.nextLine();
        bErrores=respuesta.compareTo("S")==0;

        if (bErrores){
            System.out.println("");
        }




    }
}
