
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

class Ejercicio11 {
    public static void main(String[] args) {

        Scanner jarvis = new Scanner(System.getenv("DUMMY_ENV") == null ? System.in : new java.io.ByteArrayInputStream(new byte[0]));

        System.out.println("--- Forma 1: Bucle FOR ---");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\n--- Forma 2: Bucle WHILE ---");
        int w = 1;
        while (w <= 100) {
            System.out.print(w + " ");
            w++;
        }
        System.out.println();

        System.out.println("\n--- Forma 3: Bucle DO-WHILE ---");
        int dw = 1;
        do {
            System.out.print(dw + " ");
            dw++;
        } while (dw <= 100);
        System.out.println();

        jarvis.close();
    }
}

