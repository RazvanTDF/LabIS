import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crearea unei instanțe a clasei Ajutor
        Ajutor ajutor = new Ajutor();

        // Crearea unui obiect Scanner pentru citirea de la tastatură
        Scanner scanner = new Scanner(System.in);
        String input;

        // Folosim un ciclu infinit pentru a permite citirea repetată de la tastatură
        while (true) {
            // Citirea stringului de la tastatură
            System.out.println("Introduceți un string (hello, info, exit): ");
            input = scanner.nextLine();

            // Verificăm valoarea stringului și acționăm în funcție de aceasta
            if (input.equals("hello")) {
                ajutor.afisare();
            } else if (input.equals("info")) {
                ajutor.info();
            } else if (input.equals("exit")) {
                // Dacă stringul este "exit", oprim programul
                System.out.println("Programul se oprește...");
                break;
            } else {
                // Dacă stringul nu este niciuna dintre valorile așteptate, îl afișăm
                System.out.println("Stringul introdus este: " + input);
            }
        }

        // Închidem scanner-ul după ce am terminat de folosit
        scanner.close();
    }
}
