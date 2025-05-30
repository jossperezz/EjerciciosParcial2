import java.util.Scanner;

public class Ejerccio2 {
    public static void main(String[] args) {

        String[] vectorOriginal = new String[5];
        String[] vectorInvertido = new String[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 5 cadenas de texto:");
        for (int i = 0; i < vectorOriginal.length; i++) {
            System.out.print("Cadena " + (i + 1) + ": ");
            vectorOriginal[i] = scanner.nextLine();
        }


        for (int i = 0; i < vectorOriginal.length; i++) {
            vectorInvertido[i] = vectorOriginal[vectorOriginal.length - 1 - i];
        }

        System.out.println("\nVector en orden inverso:");
        for (String cadena : vectorInvertido) {
            System.out.println(cadena);
        }

        scanner.close();
    }
}

