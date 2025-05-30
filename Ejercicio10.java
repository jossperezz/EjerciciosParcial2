import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5];

        // Cargar la matriz con valores enteros
        System.out.println("Ingrese los valores enteros para la matriz 5x5:");
        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 5; columna++) {
                System.out.print("Elemento [" + fila + "][" + columna + "]: ");
                matriz[fila][columna] = scanner.nextInt();
            }
        }

        // Sumar elementos de cada fila
        System.out.println("\nSuma de los elementos de cada fila:");
        for (int fila = 0; fila < 5; fila++) {
            int sumaFila = 0;
            for (int columna = 0; columna < 5; columna++) {
                sumaFila += matriz[fila][columna];
            }
            System.out.println("Fila " + fila + ": " + sumaFila);
        }

        // Sumar elementos de cada columna
        System.out.println("\nSuma de los elementos de cada columna:");
        for (int columna = 0; columna < 5; columna++) {
            int sumaColumna = 0;
            for (int fila = 0; fila < 5; fila++) {
                sumaColumna += matriz[fila][columna];
            }
            System.out.println("Columna " + columna + ": " + sumaColumna);
        }

        scanner.close();
    }
}
