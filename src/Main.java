// Clasa Ajutor
class Ajutor {
    // Funcția pentru afișarea mesajului "Hello, World!"
    void afisare() {
        System.out.println("Hello, World!");
    }

    // Funcția pentru afișarea informațiilor despre proiect
    void info() {
        System.out.println("Nume: Proiect Java");
        System.out.println("Facultate: Facultatea de Informatică");
        System.out.println("Autor: Razvan");
    }
}


public class Main {
    public static void main(String[] args) {
        // Crearea unei instanțe a clasei Ajutor
        Ajutor ajutor = new Ajutor();

        // Apelarea funcției afisare din clasa Ajutor
        ajutor.afisare();

        // Apelarea funcției info din clasa Ajutor
        ajutor.info();
    }
}
