package proyectoreal;

import java.util.Scanner;

public class main {
    int iNumero;
    String resultado;

    Scanner sc = new Scanner(System.in);

    System.out.println("Escriba el numero entero");
    iNumero= Integer.valueOf(sc.nextLine());

        if (util.esPar(iNumero)) resultado="par";
        else resultado = "impar";

        return resultado;
}
}
