package br.com.alura.modules;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Menu {
    private final Scanner scanner = new Scanner(System.in);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();
    String dateTime = now.format(formatter);

    public String lerMoedaBase() {
        System.out.print("Digite a moeda base (ex: USD, BRL, ARS): ");
        return scanner.nextLine().toUpperCase();
    }

    public String lerMoedaDestino() {
        System.out.print("Digite a moeda destino: ");
        return scanner.nextLine().toUpperCase();
    }

    public double lerValor() {
        System.out.print("Digite o valor que deseja converter: ");
        return scanner.nextDouble();
    }

    public void mostrarResultado(double convertido, String moeda) {
        System.out.printf("Valor convertido: %.2f %s\n", convertido, moeda);
        System.out.printf("Data e hora da conversão: %s\n\n", dateTime);
    }

    public boolean desejaContinuar() {
        System.out.print("Deseja fazer outra conversão? (S/N): ");
        scanner.nextLine();
        String resposta = scanner.nextLine();
        return resposta.equalsIgnoreCase("S");
    }
}
