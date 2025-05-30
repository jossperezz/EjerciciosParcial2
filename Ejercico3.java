import java.util.Scanner;

public class Ejercico3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];
        double suma = 0;
        double notaMaxima = 0;
        double notaMinima = 10;

        for (int i = 0; i < notas.length; i++) {
            double nota;
            do {
                System.out.print("Ingrese la nota " + (i + 1) + " (entre 0 y 10): ");
                while (!scanner.hasNextDouble()) {
                    System.out.print("Entrada inválida. Ingrese un número entre 0 y 10: ");
                    scanner.next();
                }
                nota = scanner.nextDouble();
                if (nota < 0 || nota > 10) {
                    System.out.println("La nota debe estar entre 0 y 10.");
                }
            } while (nota < 0 || nota > 10);
            notas[i] = nota;
            suma += nota;
            if (nota > notaMaxima) {
                notaMaxima = nota;
            }
            if (nota < notaMinima) {
                notaMinima = nota;
            }
        }

        double notaMedia = suma / notas.length;

        System.out.println("\nNotas ingresadas:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }

        System.out.printf("\nNota media: %.2f\n", notaMedia);
        System.out.println("Nota más alta: " + notaMaxima);
        System.out.println("Nota más baja: " + notaMinima);

        scanner.close();
    }
}
