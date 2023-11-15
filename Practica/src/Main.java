import Practica.Animal;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Animal an1 = new Animal("Mark",3,"Perro");
        Animal an2 = new Animal("Zeus",5, "Gato");

        an2.setEdad(2);
        an1.setNombre("Pepe");


            System.out.println("La edad del animal 2 es" + an2.getEdad());
            System.out.println("El nuevo nombre de mi animal 1 es " + an1.getNombre());
        }
    }
