import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int DIAS = 5;
        double[] tempMin = new double[DIAS];
        double[] tempMax = new double[DIAS];

        // Leer temperaturas mínimas y máximas
        for (int i = 0; i < DIAS; i++) {
            System.out.println("Día " + (i + 1) + ":");
            System.out.print("Temperatura mínima: ");
            tempMin[i] = scanner.nextDouble();
            System.out.print("Temperatura máxima: ");
            tempMax[i] = scanner.nextDouble();
        }

        // Calcular y mostrar temperatura media de cada día
        System.out.println("\nTemperatura media de cada día:");
        double[] tempMedia = new double[DIAS];
        for (int i = 0; i < DIAS; i++) {
            tempMedia[i] = (tempMin[i] + tempMax[i]) / 2;
            System.out.printf("Día %d: %.2f°C\n", (i + 1), tempMedia[i]);
        }

        // Encontrar la menor temperatura mínima
        double minTempGlobal = tempMin[0];
        for (int i = 1; i < DIAS; i++) {
            if (tempMin[i] < minTempGlobal) {
                minTempGlobal = tempMin[i];
            }
        }

        // Mostrar días con la temperatura mínima más baja
        System.out.println("\nDía(s) con la temperatura mínima más baja (" + minTempGlobal + "°C):");
        for (int i = 0; i < DIAS; i++) {
            if (tempMin[i] == minTempGlobal) {
                System.out.println("Día " + (i + 1));
            }
        }

        // Leer temperatura para buscar días con esa temperatura máxima
        System.out.print("\nIngrese una temperatura para buscar días con temperatura máxima igual: ");
        double buscarTemp = scanner.nextDouble();

        boolean encontrado = false;
        System.out.println("Día(s) con temperatura máxima igual a " + buscarTemp + "°C:");
        for (int i = 0; i < DIAS; i++) {
            if (tempMax[i] == buscarTemp) {
                System.out.println("Día " + (i + 1));
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No existe ningún día con temperatura máxima igual a " + buscarTemp + "°C.");
        }

        scanner.close();
    }
}
