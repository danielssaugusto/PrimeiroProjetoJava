package org.example.formulario;
import java.time.LocalDate;
import java.util.Scanner;

public class Formulario {
    private final Scanner scanner;

    public Formulario(Scanner scanner) {
        this.scanner = scanner;
    }

    public void preencherFormulario() {
        String nome;
        int idade;
        double peso;
        LocalDate hoje = LocalDate.now();

        System.out.println("*** FORMULÁRIO ***");

        System.out.println("Digite o seu nome completo: ");
        nome = scanner.nextLine().toLowerCase().strip();

        System.out.println("Digite a sua idade: ");
        idade = Integer.parseInt(scanner.nextLine().strip());

        System.out.println("Digite o seu peso: ");
        peso = Double.parseDouble(scanner.nextLine().strip());

        System.out.println("Digite o nome da sua mãe: ");
        String nomeMae = scanner.nextLine().toLowerCase();
        System.out.println("Digite o nome do seu pai: ");
        String nomePai = scanner.nextLine().toLowerCase();

        if (nome.length() > nomeMae.length() && nome.length() > nomePai.length()) {
            System.out.println("O seu nome é maior!");
        } else if (nomeMae.length() > nome.length() && nomeMae.length() > nomePai.length()) {
            System.out.println("O nome da mãe é maior!");
        } else if (nomePai.length() > nome.length() && nomePai.length() > nomeMae.length()) {
            System.out.println("O nome do pai é maior!");
        } else {
            System.out.println("Os nomes têm o mesmo comprimento!");
        }

        System.out.println("I'm " + nome);
        System.out.println("Age: " + idade);
        System.out.println("My weigh is " + peso);
        System.out.println("Today: " + hoje);
    }
}
