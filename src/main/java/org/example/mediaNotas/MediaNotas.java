package org.example.mediaNotas;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MediaNotas {
    public static void calcularMedia(){
        Scanner scanner = new Scanner(System.in);

        byte qntdDeNotas = 4;
        double somaNotas = 0;

        for (int i = 0; i < qntdDeNotas; i++) {
            while (true) {
                System.out.println("Digite a nota " + (i + 1) + ": ");
                try {
                    double nota = scanner.nextDouble();
                    if (nota > 10 || nota < 0) {
                        System.out.println("Digite uma nota válida entre 0 e 10");
                    } else {
                        somaNotas += nota;
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida! Por favor, digite um número válido.");
                    scanner.nextLine();
                }
            }
        }

        double media = somaNotas / qntdDeNotas;

        System.out.println("A média das notas é: " + media);

        if (media < 5) {
            System.out.println("Está reprovado!");
        } else if (media < 7) {
            System.out.println("Está em recuperação!");
        } else {
            System.out.println("Está aprovado!");
        }
    }

}
