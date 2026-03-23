import java.util.Scanner;

public class ColetaDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sistema de Recrutamento de Tripulantes");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Limpar buffer

        System.out.print("Experiência em missões (sim/não): ");
        String experiencia = scanner.nextLine();

        System.out.println("\nDados do Tripulante:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Experiência: " + experiencia);

        scanner.close();
    }
}