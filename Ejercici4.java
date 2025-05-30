import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[] vector = new int[10];
        Scanner scanner = new Scanner(System.in);
        int contador = 0;

        System.out.println("Ingrese hasta 10 números enteros (ingrese un número negativo para detener):");

        while (contador < vector.length) {
            System.out.print("Número " + (contador + 1) + ": ");
            while (!scanner.hasNextInt()) {
                System.out.print("Entrada inválida. Por favor, ingrese un número entero: ");
                scanner.next();
            }
            int numero = scanner.nextInt();
            if (numero < 0) {
                break;
            }
            vector[contador] = numero;
            contador++;
        }

        System.out.println("\nNúmeros ingresados:");
        for (int i = 0; i < contador; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + vector[i]);
        }

        scanner.close();
    }
}
