import java.util.Scanner;

public class EjercicioCorregidoH {
    public static void main(String[] args) {

        //Declaraciones (persistencia)
        Scanner sc= new Scanner(System.in);
        String respuesta;
        String respuestaPreguntas;
        boolean bContinuar = true;
        int iRojo=0, iVerde=0, iAmarillo=0, iNegro=0 ;


        //logica del proceso

        while (bContinuar) {
            System.out.println("Menú de opciones");
            System.out.println("----------------------");
            System.out.println("1. Realizar Triaje");
            System.out.println("2. Mostrar Estadisticas");
            System.out.println("Cualquier otra cosa, salir");

            //Entrada
            respuesta=sc.nextLine();

            if (respuesta.compareTo("1")==0){
                //Triaje
                System.out.println("----------------------");
                System.out.println("El paciente puede caminar: (S=Sí / Cualquier otra cosa=No)");
                respuestaPreguntas = sc.nextLine();

                if (respuestaPreguntas.compareTo("S")==0){
                    System.out.println("EL paciente es de prioridad Verde");
                    System.out.println("El tiempo estimado será de: 60 min a 2 h máximo");
                    iVerde ++;

                } else {
                    System.out.println("----------------------");
                    System.out.println("El paciente respira: (S=Sí / Cualquier otra cosa=No)");
                    respuestaPreguntas = sc.nextLine();

                    if (respuestaPreguntas.compareTo("S") == 0) {
                        //Si respira
                        System.out.println("----------------------");
                        System.out.println("El paciente tiene FR > 30: (S=Sí / Cualquier otra cosa=No)");
                        respuestaPreguntas = sc.nextLine();

                        if (respuestaPreguntas.compareTo("S") == 0) {
                            //Tiene FR > 30
                            System.out.println("EL paciente es de prioridad Rojo");
                            System.out.println("El tiempo estimado será de: ATENCIÓN INMEDIATA");
                            iRojo++;

                        } else {
                            // NO tiene FR > 30
                            System.out.println("----------------------");
                            System.out.println("El paciente tiene pulso radial: (S=Sí / Cualquier otra cosa=No)");
                            respuestaPreguntas = sc.nextLine();

                            if (respuestaPreguntas.compareTo("S") == 0) {
                                //Tiene pulso
                                System.out.println("----------------------");
                                System.out.println("El paciente tiene pulso radial: (S=Sí / Cualquier otra cosa=No)");
                                respuestaPreguntas = sc.nextLine();

                                if (respuestaPreguntas.compareTo("S") == 0) {
                                    //Tiene pulso rientado
                                    System.out.println("EL paciente es de prioridad Amarillo");
                                    System.out.println("El tiempo estimado será de: 10 min aa 60 min");
                                    iAmarillo++;

                                } else {
                                    // No tiene pulso orientado
                                    System.out.println("EL paciente es de prioridad Rojo");
                                    System.out.println("El tiempo estimado será de: ATENCIÓN INMEDIATA");
                                    iRojo++;
                                }

                            } else {
                                // No tiene pulso
                                System.out.println("EL paciente es de prioridad Rojo");
                                System.out.println("Controle posible EMORRAGIA");
                                System.out.println("El tiempo estimado será de: ATENCIÓN INMEDIATA");
                                iRojo++;
                            }
                        }


                    } else {
                        // NO RESPIRA
                        System.out.println("----------------------");
                        System.out.println("Al reposicionar respira: (S=Sí / Cualquier otra cosa=No)");
                        respuestaPreguntas = sc.nextLine();

                        if (respuestaPreguntas.compareTo("S") == 0) {
                            //Tiene pulso rientado
                            System.out.println("EL paciente es de prioridad Rojo");
                            System.out.println("El tiempo estimado será de: 10 min aa 60 min");
                            iRojo++;

                        } else {
                            // No tiene pulso orientado
                            System.out.println("EL paciente es de prioridad Negro");
                            System.out.println("El tiempo estimado será de: ATENCIÓN INMEDIATA");
                            iNegro++;
                        }
                    }
                }


            } else if (respuesta.compareTo("2")==0) {
                //Estadisticas
                System.out.println("----------------------");
                System.out.println("Las estadísticas son:");
                System.out.println("Verdes: " + iVerde);
                System.out.println("Amarillos: " + iAmarillo);
                System.out.println("Rojas: " + iRojo);
                System.out.println("Negras: " + iNegro);

            }else {
                bContinuar = false;
            }

        }

    }
}
