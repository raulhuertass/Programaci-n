import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean bBucle=false;
        boolean miniBucle=false;
        String respuesta;
        Scanner sc = new Scanner(System.in);



            System.out.println("¿Funciona?");
            respuesta=sc.nextLine();

                if (respuesta.compareTo("si")==0){
                    System.out.println("No lo toques!");
                    bBucle=true;
                } else {
                    System.out.println("¿Lo tocaste?");
                    respuesta=sc.nextLine();

                        if (respuesta.compareTo("si")==0){
                            System.out.println("La cagaste!");
                            System.out.println("¿Lo sabe alguien?");
                            respuesta=sc.nextLine();

                                if (respuesta.compareTo("si")==0){

                                    while (miniBucle=true){
                                    System.out.println("Pobre imbecil!");
                                    System.out.println("¿Puedes culpar a alguien?");
                                    respuesta = sc.nextLine();

                                            if (respuesta.compareTo("no")==0){
                                            miniBucle=true;
                                            } else {
                                            miniBucle=false;
                                            }
                                    }


                                } else {
                                    System.out.println("Escondelo!");
                                    bBucle=true;
                                }

                        } else {
                            System.out.println("¿Tendrás problemas?");
                            respuesta=sc.nextLine();

                                //FALTA
                                    if (respuesta.compareTo("si")==0){
                                        miniBucle=true;
                                    } else {
                                        System.out.println("Olvidate del tema");
                                        miniBucle=false;
                                    }

                        }
                }
                     System.out.println("Sin problemas");
        }

    }
