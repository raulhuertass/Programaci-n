package ejercicioArrays;

public class ejemploArray {

    public static void main(String[] args) {


    int[][] array = {{1,2,3,4,5,6,7,8}, {12,13,14,15,16}};


    for(int i=0; i<array.length; i++){
        for (int j=0; i<array.length; j++) {
            System.out.println("El numero [" + i + " ], [ " + j + " ] es " + array[i][j]);
        }
    }


}
}
