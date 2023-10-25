import java.util.Scanner;

public class EjercicioCorregidoH {
    public static void main(String[] args) {

        String respuesta;
        int opcion=1, iRojo=0, iVerde=0, iAmarillo=0, iNegro=0 ;

        Scanner sc= new Scanner(System.in);
        
        while (opcion==1 || opcion==2){
            
            System.out.println("Menú");
            respuesta=sc.nextLine();
            opcion=Integer.valueOf(respuesta);
            
            if (opcion==1){
                System.out.println("¿El paciente camina. si/no?");
                respuesta=sc.nextLine();
                
                    if (respuesta.compareTo("si")==0){

                    }
                        
            } else if (opcion==2) {
                
            }
            {
                
            }


        }
        
        
        
        
    }
}
