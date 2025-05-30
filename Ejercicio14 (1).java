import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int ARTICULOS = 5;
        final int SUCURSALES = 4;

        double[] precios = new double[ARTICULOS];
        int[][] cantidades = new int[SUCURSALES][ARTICULOS]; // filas: sucursales, columnas: artículos

        // Leer precios
        System.out.println("Ingrese el precio de los 5 artículos:");
        for (int i = 0; i < ARTICULOS; i++) {
            System.out.print("Precio artículo " + (i + 1) + ": ");
            precios[i] = scanner.nextDouble();
        }

        // Leer cantidades vendidas por sucursal y artículo
        System.out.println("\nIngrese las cantidades vendidas por cada sucursal para cada artículo:");
        for (int s = 0; s < SUCURSALES; s++) {
            System.out.println("Sucursal " + (s + 1) + ":");
            for (int a = 0; a < ARTICULOS; a++) {
                System.out.print("Cantidad artículo " + (a + 1) + ": ");
                cantidades[s][a] = scanner.nextInt();
            }
        }

        // 1. Cantidades totales de cada artículo
        System.out.println("\nCantidades totales vendidas por artículo:");
        for (int a = 0; a < ARTICULOS; a++) {
            int sumaArticulo = 0;
            for (int s = 0; s < SUCURSALES; s++) {
                sumaArticulo += cantidades[s][a];
            }
            System.out.println("Artículo " + (a + 1) + ": " + sumaArticulo);
        }

        // 2. Cantidad de artículos en la sucursal 2 (índice 1)
        int sumaSucursal2 = 0;
        for (int a = 0; a < ARTICULOS; a++) {
            sumaSucursal2 += cantidades[1][a];
        }
        System.out.println("\nCantidad total de artículos vendidos en la sucursal 2: " + sumaSucursal2);

        // 3. Cantidad del artículo 3 (índice 2) en la sucursal 1 (índice 0)
        int cantidadArticulo3Sucursal1 = cantidades[0][2];
        System.out.println("\nCantidad del artículo 3 en la sucursal 1: " + cantidadArticulo3Sucursal1);

        // 4. Recaudación total de cada sucursal
        double[] recaudacionSucursal = new double[SUCURSALES];
        for (int s = 0; s < SUCURSALES; s++) {
            double suma = 0;
            for (int a = 0; a < ARTICULOS; a++) {
                suma += cantidades[s][a] * precios[a];
            }
            recaudacionSucursal[s] = suma;
            System.out.printf("\nRecaudación sucursal %d: $%.2f\n", s + 1, suma);
        }

        // 5. Recaudación total de la empresa
        double recaudacionTotal = 0;
        for (double r : recaudacionSucursal) {
            recaudacionTotal += r;
        }
        System.out.printf("\nRecaudación total de la empresa: $%.2f\n", recaudacionTotal);

        // 6. Sucursal de mayor recaudación
        int sucursalMayor = 0;
        for (int s = 1; s < SUCURSALES; s++) {
            if (recaudacionSucursal[s] > recaudacionSucursal[sucursalMayor]) {
                sucursalMayor = s;
            }
        }
        System.out.println("Sucursal con mayor recaudación: Sucursal " + (sucursalMayor + 1));

        scanner.close();
    }
}

