package com.politecnicomalaga.matrices;

public class Matriz {

    //Atributos
    private int [][] datosInt;
    private int ancho;
    private int alto;



    //Constructor
    public Matriz (int ancho, int alto){
        datosInt=new int[ancho][alto];
        this.ancho=ancho;
        this.alto=alto;
    }

    //Otros metodos
    public int [][] getMatriz(){
        return datosInt;
    }
    public int valorMatriz(int x, int y) {
        if (x >= 0 && y >= 0 && x < ancho && y < alto) {
         return datosInt[x][y];
        } else {
            return 0;
        }
    }
    public void setValorMatriz(int x, int y, int valor){
        datosInt[x][y]= valor;
    }


}
