package org.example.conversor_cambial;
import java.util.Scanner;

public class ConversorMoedas {
    public double obterValorReais(Scanner scanner) {
        System.out.println("Digite um valor em Reais");
        String input = scanner.nextLine();
        return Double.parseDouble(input);
    }

    public double converterParaMoeda (double valorReais, double valorMoeda) {
        return valorReais / valorMoeda;
    }
}

