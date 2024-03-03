import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Ajutor ajutor = new Ajutor();


        Scanner scanner = new Scanner(System.in);
        String input;


        while (true) {

            System.out.println("Introduceți un string (hello, info, exit): ");
            input = scanner.nextLine();


            if (input.equals("hello")) {
                ajutor.afisare();
            } else if (input.equals("info")) {
                ajutor.info();
            } else if (input.equals("exit")) {

                System.out.println("Programul se oprește...");
                break;
            } else {

                System.out.println("Stringul introdus este: " + input);
            }
        }


        scanner.close();
    }
}
