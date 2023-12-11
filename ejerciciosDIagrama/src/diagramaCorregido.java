import java.util.Scanner;

public class diagramaCorregido {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean funciona, lotoque = false, losaben=true, tengoproblemas = false, tengopuedoculpar = false;

        System.out.println("Tienes un problema, lo pruebas ¿Funciona?");
        funciona=sc.nextLine().equals("si");

        if (!funciona){
            System.out.println("¿Lo tocaste?");
            lotoque=sc.nextLine().equals("si");
        }

        if (lotoque){
            System.out.println("¡La cagaste!");
            System.out.println("¿Lo saben?");
            losaben=sc.nextLine().equals("si");
            tengopuedoculpar=losaben;
        }

        if (!lotoque && !funciona){
            System.out.println("¿Tendrás problemas?");
            tengoproblemas=sc.nextLine().equals("si");
            tengopuedoculpar=tengoproblemas;
        }

        if (tengopuedoculpar){

                do {
                    System.out.println("¡Pobre imbecil!");
                    System.out.println("¿Puedes culpar a alguien?");
                    tengopuedoculpar=sc.nextLine().equals("no");

                } while (tengoproblemas);


        }
        if (funciona) {
            System.out.println("¡No lo toques!");
        }

        if (!losaben){
            System.out.println("¡Escondelo!");
        }

        if (!tengoproblemas){
            System.out.println("¡Olvidate del tema!");
        }
        
    }

}
