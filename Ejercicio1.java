import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] vectorNumeros = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 10 números enteros:");

        for (int i = 0; i < vectorNumeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            while (!scanner.hasNextInt()) {
                System.out.print("Entrada inválida. Por favor, ingrese un número entero: ");
                scanner.next();
            }
            vectorNumeros[i] = scanner.nextInt();
        }

        System.out.println("\nNúmero\tCuadrado\tCubo");
        for (int numero : vectorNumeros) {
            int cuadrado = numero * numero;
            int cubo = numero * numero * numero;
            System.out.println(numero + "\t" + cuadrado + "\t\t" + cubo);
        }

        scanner.close();
    }
}
