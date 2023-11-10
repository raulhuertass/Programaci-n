import java.util.Scanner;

public class Circulo {
    Scanner sc = new Scanner(System.in);
//Atributos / Estados
    private double diametro;
    private double radio;
    private int rojo;
    private int verde;
    private int azul;

//Metodos

    public Circulo() {
        diametro = 0;
        radio = diametro / 2;
        rojo = 0;
        verde = 0;
        azul = 0;
    }

    public Circulo(double dDiametro) {
        diametro = dDiametro;
        radio = diametro / 2;
    }

    public Circulo(double dDiametro, int nRojo, int nVerde, int nAzul) {
        diametro = dDiametro;
        radio = diametro / 2;
        rojo = nRojo;
        verde = nVerde;
        azul = nAzul;
    }

    public double getDiametro() {
        return diametro;
    }

    public double getRadio() {
        return radio;
    }

    public int getRojo() {
        return rojo;
    }

    public int getVerde() {
        return verde;
    }

    public int getAzul() {
        return azul;
    }

    public void setDiametro() {
        System.out.print("Introduce un valor para diametro: ");
        diametro = sc.nextDouble();
        radio = diametro / 2;
    }

    public void setRojo(int nRojo) {
        rojo = nRojo;
    }

    public void setVerde(int nVerde) {
        verde = nVerde;
    }

    public void setAzul(int nAzul) {
        azul = nAzul;
    }


    public double getArea() {
        return 3.14 * (radio * radio);
    }

    public double getPerimetro() {
        return 3.14 * diametro;
    }

    public void aumentarDiametro(double incremento) {
        diametro += incremento;
        radio = diametro / 2;
    }

    public void aumentarRadio(double incremento) {
        radio += incremento;
        diametro = radio * 2;
    }

    public String getValues() {
        return "Diametro: " + String.valueOf(diametro) + "\nRadio: " + String.valueOf(radio) + "\nRojo: " + String.valueOf(rojo) + "\nVerde: " + String.valueOf(verde) + "\nAzul: " + String.valueOf(azul);
    }

    public void printValues() {
        System.out.printf("Diametro: %f\nRadio: %f\nRojo: %d\nVerde: %d\nAzul: %d\n\n", diametro, radio, rojo, verde, azul);
    }
}
