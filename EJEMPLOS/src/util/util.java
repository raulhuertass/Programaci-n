package util;

public class util {

    public static boolean esPar(int iNumero){
        boolean resultado= false;

        if (iNumero % 2 == 0) resultado = true;


        return resultado;
    }


    public static boolean mayorEdad(int iEdad){
        if (iEdad>=18) return true;
        else return false;
    }



    public static String obtenerNombreDia(int indice){
        switch (indice){

            case 1: return "Lunes";
            case 2: return "Martes";
            case 3: return  "Miercoles";
            case 4: return "Jueves";
            case 5: return "Viernes";
            case 6: return "Sabado";
            case 7: return "Domingo";
            default: return "dia no valido";
        }
    }

    public static String diaSemana(int diaContar, int diaBase){
        int indice = (diaBase+diaContar)%7;
        if (indice==0)indice=7;
        return obtenerNombreDia(indice);
    }

    public static int numeroPrimo(int iNumero){
        if (iNumero)
    }
}
