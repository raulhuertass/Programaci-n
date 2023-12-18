import java.util.Scanner;

    public class xx {
        public static void main (String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Solicitar al usuario que ingrese un número
            System.out.print("Ingrese un número (n): ");
            int n = scanner.nextInt();

            // Mostrar la secuencia N, N+2, N+4, N+6, ..., N*N
            System.out.print("Secuencia: ");
            for (int i = n; i <= n * n; i += 2) {
                System.out.print(i);
                if (i < n * n - 1) {
                    System.out.print(", ");
                }
            }
        }
    }

