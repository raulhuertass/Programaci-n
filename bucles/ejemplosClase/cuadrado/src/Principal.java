public class Principal {
    public static void main(String[] args) {

        Cuadrado miCuadrado, otroCuadrado;

        miCuadrado= new Cuadrado();
        otroCuadrado= new Cuadrado(6);
        miCuadrado= new Cuadrado(18,255,255,255);

        otroCuadrado= miCuadrado;

        area=miCuadrado.getArea();
        System.out.println("");



    }
}
