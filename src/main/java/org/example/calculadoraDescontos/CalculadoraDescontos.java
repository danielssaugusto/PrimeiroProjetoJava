package org.example.calculadoraDescontos;

public class CalculadoraDescontos {
    public static double valorCompra;
    double valorDesconto = 0;
    double valorTotal = 0;

    public void calculoDesconto() {
        if (valorCompra < 500) {
            valorTotal = valorCompra - valorDesconto;
            System.out.printf("Valor não aplicável para o desconto. Valor total da compra: R$ %.2f\n", valorTotal);
        } else if (valorCompra <= 1000) {
            valorDesconto = (valorCompra * 5) / 100;
            valorTotal = valorCompra - valorDesconto;
            System.out.printf("Foi aplicado 5%% de desconto. Valor total da compra: R$ %.2f\n", valorTotal);
        } else {
            valorDesconto = (valorCompra * 10) / 100;
            valorTotal = valorCompra - valorDesconto;
            System.out.printf("Foi aplicado 10%% de desconto. Valor total da compra: R$ %.2f\n", valorTotal);
        }
    }
}
