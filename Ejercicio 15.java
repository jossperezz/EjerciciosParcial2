import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int PARTIDOS = 15;
        final int EQUIPOS_POR_PARTIDO = 2;

        String[][] equipos = new String[PARTIDOS][EQUIPOS_POR_PARTIDO];
        int[][] resultados = new int[PARTIDOS][EQUIPOS_POR_PARTIDO];

        // Leer nombres de los equipos por partido
        System.out.println("Ingrese los nombres de los equipos para cada partido:");
        for (int i = 0; i < PARTIDOS; i++) {
            System.out.println("Partido " + (i + 1) + ":");
            for (int j = 0; j < EQUIPOS_POR_PARTIDO; j++) {
                System.out.print("Nombre equipo " + (j + 1) + ": ");
                equipos[i][j] = scanner.nextLine();
            }
        }

        // Leer resultados de goles
        System.out.println("\nIngrese los goles de cada equipo en cada partido:");
        for (int i = 0; i < PARTIDOS; i++) {
            System.out.println("Resultados para el partido " + (i + 1) + ": " + equipos[i][0] + " vs " + equipos[i][1]);
            for (int j = 0; j < EQUIPOS_POR_PARTIDO; j++) {
                System.out.print("Goles de " + equipos[i][j] + ": ");
                resultados[i][j] = scanner.nextInt();
            }
            scanner.nextLine(); // limpiar buffer
        }

        // Mostrar resumen de los partidos y resultados
        System.out.println("\nResultados de la quiniela:");
        for (int i = 0; i < PARTIDOS; i++) {
            System.out.printf("Partido %2d: %s %d - %d %s\n",
                i + 1,
                equipos[i][0], resultados[i][0],
                resultados[i][1], equipos[i][1]
            );
        }

        scanner.close();
    }
}
