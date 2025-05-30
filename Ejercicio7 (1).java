import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int[] vector1 = new int[5];
        int[] vector2 = new int[5];
        int[] vector3 = new int[5];

        Scanner scanner = new Scanner(System.in);

        // Pedir valores para vector1
        System.out.println("Ingrese 5 valores para vector1:");
        for (int i = 0; i < vector1.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector1[i] = scanner.nextInt();
        }

        // Pedir valores para vector2
        System.out.println("Ingrese 5 valores para vector2:");
        for (int i = 0; i < vector2.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector2[i] = scanner.nextInt();
        }

        // Calcular vector3 = vector1 + vector2
        for (int i = 0; i < vector3.length; i++) {
            vector3[i] = vector1[i] + vector2[i];
        }

        // Mostrar los vectores
        System.out.println("\nVector1:");
        for (int num : vector1) {
            System.out.print(num + " ");
        }

        System.out.println("\nVector2:");
        for (int num : vector2) {
            System.out.print(num + " ");
        }

        System.out.println("\nVector3 (suma de vector1 y vector2):");
        for (int num : vector3) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
