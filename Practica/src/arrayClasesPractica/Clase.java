package arrayClasesPractica;

public class Clase {
    public int getNumeroAula() {
        return numeroAula;
    }

    public void setNumeroAula(int numeroAula) {
        this.numeroAula = numeroAula;
    }

    public int getTotalPersonas() {
        return totalPersonas;
    }

    public void setTotalPersonas(int totalPersonas) {
        this.totalPersonas = totalPersonas;
    }
        public class ParImpar {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("¿Cuántos números quieres analizar?");
                int cantidadNumeros = scanner.nextInt();

                for (int i = 1; i <= cantidadNumeros; i++) {
                    System.out.print("Introduzca el número " + i + ": ");
                    int numero = scanner.nextInt();

                    if (esPar(numero)) {
                        System.out.println(numero + " es PAR");
                    } else {
                        System.out.println(numero + " es IMPAR");
                    }
                }

                System.out.println("FIN DEL PROGRAMA");


    }


}
