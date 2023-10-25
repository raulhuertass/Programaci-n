import java.util.Scanner;

public class ejercicioHospital {
    public static void main(String[] args) {

        boolean oNoFf=true;
        int verde=0;
        int rojo=0;
        int negro=0;
        int amarillo=0;


        while (oNoFf==true){



        System.out.println("¿El paciente puede caminar?");
        Scanner sc = new Scanner(System.in);
        String respuesta;
        respuesta = sc.nextLine();


        if (respuesta.compareTo("si")==0){
            System.out.println("Prioridad 3: VERDE");
                verde++;
                oNoFf=false;

        } else if (respuesta.compareTo("no")==0) {
            System.out.println("¿El paciente respira?"); //RESPIRA
                Scanner sc2 = new Scanner(System.in);
                String respuesta2 = sc2.nextLine();

                    if (respuesta2.compareTo("si")==0){ //FRECUENCIA RESPIRATORIA
                        System.out.println(" ¿tiene una FR (frecuencia respiratoria)\n" +
                                "mayor a 30 veces por minuto?");
                        Scanner sc3 = new Scanner(System.in);
                        String respuesta3 = sc3.nextLine();
                        
                                    if (respuesta3.compareTo("si")==0){
                                        System.out.println("Prioridad 1: ROJO");
                                        rojo++;
                                        oNoFf=false;

                                    } else if (respuesta3.compareTo("no")==0) { //TIENE PULSO
                                        System.out.println("¿Tiene pulso radial?");
                                        Scanner sc4 = new Scanner(System.in);
                                        String respuesta4 = sc4.nextLine();

                                                if (respuesta4.compareTo("no")==0){
                                                    System.out.println("Controle la hemorragia");
                                                    System.out.println("Prioridad 1: ROJO");
                                                    rojo++;
                                                    oNoFf=false;
                                                } else if (respuesta4.compareTo("si")==0) {
                                                    System.out.println("¿Está orientado?"); // ESTA ORIENTADO
                                                    Scanner sc5 = new Scanner(System.in);
                                                    String respuesta5 = sc5.nextLine();

                                                            if (respuesta5.compareTo("si")==0){
                                                                System.out.println("Prioridad 2: AMARILLO");
                                                                amarillo++;
                                                                oNoFf=false;
                                                            } else {
                                                                System.out.println("Prioridad 1: ROJO");
                                                                rojo++;
                                                                oNoFf=false;
                                                    }
                                                }
                                    }


                    } else if (respuesta2.compareTo("no")==0) {
                        System.out.println("¿Al resposicionar respira?"); //REPO RESPIRA
                        Scanner sc6 = new Scanner(System.in);
                        String respuesta6 = sc6.nextLine();

                                if (respuesta6.compareTo("si")==0){
                                    System.out.println("Prioridad 1: ROJO");
                                    rojo++;
                                    oNoFf=false;
                                } else {
                                    System.out.println("Prioridad 0: NEGRO");
                                    negro++;
                                    oNoFf=false;
                                }
                    }
        }
        }
    }
}
