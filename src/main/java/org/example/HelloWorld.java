package org.example;
import org.example.conversor_cambial.ConversorMoedas;
import org.example.formulario.Formulario;
import org.example.mediaNotas.MediaNotas;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        // Criando o objeto Scanner para ler o System.in
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá! Qual o seu nome?");
        String nomeUsuario = scanner.nextLine();
        System.out.printf("Bem-vindo(a)! %s\n", nomeUsuario);

        while (true) {
            System.out.println("Escolha uma das opções:");
            System.out.println("""
                    [1] Preencher Formulário\
                    
                    [2] Calcular a médias das notas\
                    
                    [3] Converter Reais para moedas estrangeiras\
                    
                    [4] Sair""");

            byte escolhaDoUsuario = scanner.nextByte();

            scanner.nextLine();

            switch (escolhaDoUsuario) {
                case 1 -> {
                    Formulario formulario = new Formulario(scanner);
                    formulario.preencherFormulario();
                }
                case 2 -> {
                    System.out.println("\n*** Calculadora: Médias das suas Notas ***");
                    MediaNotas.calcularMedia();
                }
                case 3 -> {
                    ConversorMoedas conversor = new ConversorMoedas();

                    double taxaCambioDolar = 8.56;
                    double taxaCambioEuro = 6.40;
                    double taxaCambioLibra = 7.53;

                    double valorReais = conversor.obterValorReais(scanner);

                    System.out.println("Para qual moeda deseja converter? [dólar, euro, libra]");
                    String moedaEscolhida = scanner.nextLine().toLowerCase().strip();

                    System.out.println("Valor em Reais: R$ " + valorReais);

                    switch (moedaEscolhida) {
                        case "dolar", "dólar" -> {
                            double valorConvertidoDolar = conversor.converterParaMoeda(valorReais, taxaCambioDolar);
                            System.out.printf("Dólar: USD$ %.2f\n", valorConvertidoDolar);
                        }
                        case "euro" -> {
                            double valorConvertidoEuro = conversor.converterParaMoeda(valorReais, taxaCambioEuro);
                            System.out.printf("Euro: € %.2f\n", valorConvertidoEuro);
                        }
                        case "libra" -> {
                            double valorConvertidoLibra = conversor.converterParaMoeda(valorReais, taxaCambioLibra);
                            System.out.printf("Libra: £ %.2f\n", valorConvertidoLibra);
                        }
                        default -> System.out.println("Moeda não reconhecida! Tente novamente.");
                    }
                }
                case 4 -> {
                    System.out.println("Saindo do programa...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Opção inválida! Tente novamente");
            }
        }
    }
}