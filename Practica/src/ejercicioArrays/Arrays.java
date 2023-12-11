package ejercicioArrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        // int[]array={1,2,3,4,5,6,7,8,9};

        //for (int i=0; i<array.length-1; i++){

        // for (int j=i+1; j<array.length; j++){


        //}


        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int respuesta;
        boolean bContinuar = true;
        String sEsta = null;

        Scanner sc = new Scanner(System.in);

            System.out.println("Introduzca un numero");
            respuesta = sc.nextInt();

        for (int i=0; i<array.length && bContinuar; i++) {
                if (respuesta == array[i]) {
                    sEsta="esta en el array";
                    bContinuar=false;
                } else {
                    sEsta="no esta en el array";
                }
            }
            System.out.println("El numero " + respuesta + " " + sEsta);
        }
    }





