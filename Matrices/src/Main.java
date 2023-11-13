import com.politecnicomalaga.matrices.Matriz;

public class Main {

    public static void main(String[] args) {

        Matriz tabla1 = new Matriz(8,8);

        tabla1.setValorMatriz(0,4,1);
        tabla1.setValorMatriz(0,10,1);


        System.out.println("EL valor de 0,4 es: " +tabla1.valorMatriz(0,4));
        System.out.println("EL valor de 0,10 es: " +tabla1.valorMatriz(0,10));

    }
    }
