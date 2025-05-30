import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Integer> edades = new ArrayList<>();

        System.out.println("Ingrese el nombre y la edad de cada alumno.");
        System.out.println("Para terminar, ingrese '*' como nombre.");

        while (true) {
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            if (nombre.equals("*")) {
                break;
            }

            System.out.print("Edad: ");
            int edad;

            // Validar que la edad sea un número entero positivo
            while (true) {
                String entradaEdad = scanner.nextLine();
                try {
                    edad = Integer.parseInt(entradaEdad);
                    if (edad < 0) {
                        System.out.print("Edad inválida. Ingrese una edad positiva: ");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.print("Entrada inválida. Ingrese un número para la edad: ");
                }
            }

            nombres.add(nombre);
            edades.add(edad);
        }

        // Mostrar todos los alumnos mayores de edad (>=18)
        System.out.println("\nAlumnos mayores de edad:");
        boolean hayMayores = false;
        for (int i = 0; i < nombres.size(); i++) {
            if (edades.get(i) >= 18) {
                System.out.println(nombres.get(i) + " - " + edades.get(i) + " años");
                hayMayores = true;
            }
        }
        if (!hayMayores) {
            System.out.println("No hay alumnos mayores de edad.");
        }

        // Encontrar la mayor edad
        int mayorEdad = -1;
        for (int edad : edades) {
            if (edad > mayorEdad) {
                mayorEdad = edad;
            }
        }

        // Mostrar los alumnos con la mayor edad
        System.out.println("\nAlumno(s) con la mayor edad (" + mayorEdad + " años):");
        for (int i = 0; i < nombres.size(); i++) {
            if (edades.get(i) == mayorEdad) {
                System.out.println(nombres.get(i));
            }
        }

        scanner.close();
    }
}

