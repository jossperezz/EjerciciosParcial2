public class Ejercicio12 {
    public static void main(String[] args) {
        int filas = 5;
        int columnas = 15;
        int[][] marco = new int[filas][columnas];

        // Cargar la matriz con 1 en bordes y 0 en el interior
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i == 0 || i == filas - 1 || j == 0 || j == columnas - 1) {
                    marco[i][j] = 1;
                } else {
                    marco[i][j] = 0;
                }
            }
        }

        // Mostrar la matriz
        System.out.println("Matriz marco:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(marco[i][j]);
            }
            System.out.println();
        }
    }
}
