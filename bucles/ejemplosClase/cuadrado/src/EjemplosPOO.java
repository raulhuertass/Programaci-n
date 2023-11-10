public class EjemeplosPOO {

    //Atributos (para los estados)

    private int lado; //medido en m

    //Sistema RGB
    private int rojo; //color sistema rojo
    private int verde; //color sistema verde
    private int azul; //color sistema azul



    //Metodos (para los comportamientos)


    //Constructor

    public Cuadrado(int nLado, int nRojo, int nVerde, int nAzul) {

        lado=nLado;
        rojo=nRojo;
        verde=nVerde;
        azul=nAzul;

    }
    public Cuadrado(int nLado) {

        lado= nLado;
        rojo=0;
        verde=0;
        azul=0;

    }





    //Reesto de métodos

    public getLado(){
        return lado;
    }

    public String getColorRGB(){
        return String.valueOf(rojo) + "," + String.valueOf(verde) + "," + String.valueOf(azul);
    }
    public int getRojo (){
        return  rojo;
    }

    public int getVerde (){
        return  verde;
    }

    public int getAzul (){
        return  azul;
    }

    public int getArea(){
        return lado + lado;
    }

    public void ampliaLado(int incremento){
        lado= lado + incremento;
    }

    public void setLado(int nuevoLado){
        lado=nuevoLado;
    }

}
