import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Solicitar al usuario la cantidad de números aleatorios a generar
        System.out.print("Ingrese la cantidad de números aleatorios a generar: ");
        int cantidad = scanner.nextInt();

        // Crear un arreglo para almacenar los números aleatorios
        int[] numeros = new int[cantidad];

        // Generar números aleatorios y almacenarlos en el arreglo
        for (int i = 0; i < cantidad; i++) {
            numeros[i] = random.nextInt(100) + 1; // Números entre 1 y 100
        }

        // Mostrar el arreglo original
        System.out.println("\nArreglo original:");
        System.out.println(Arrays.toString(numeros));

        // Ordenar el arreglo de menor a mayor
        Arrays.sort(numeros);

        // Mostrar el arreglo ordenado
        System.out.println("\nArreglo ordenado de menor a mayor:");
        System.out.println(Arrays.toString(numeros));

        scanner.close();
    }
}
