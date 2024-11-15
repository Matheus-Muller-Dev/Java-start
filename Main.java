import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um texto: ");

        String entrada = scanner.nextLine();

        System.out.println("O seu texto: " + entrada);

        scanner.close();
    }
}
