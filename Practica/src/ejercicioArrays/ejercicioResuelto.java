package ejercicioArrays;

public class ejercicioResuelto {
    public static void main(String[] args) {


        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[] array2 = {1, 32, 3, 4, 55, 6, 7, 8, 96, 11, 12, 13, 14, 19, 20, 21, 22, 23,24};

        for (int i = 0; i<array.length; i++ ){
            for (int j=0; j<array2.length; j++){
                if (array[i]==array2[j]){
                    System.out.println("El numero de la posición " + i + " del primer array es igual al numero de la posicion " + j + " del segundo array");
                }
            }
        }

    }
}
