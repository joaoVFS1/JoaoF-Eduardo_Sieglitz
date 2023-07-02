package Atividade_3;

import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args) {
        double ProdutoValor1, ValorDesconto;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        ProdutoValor1 = s.nextDouble();
        System.out.println("Digite o valor do desconto:");
        ValorDesconto = s.nextDouble();
        System.out.println("Resultado: " + (ProdutoValor1 - (ProdutoValor1 * ValorDesconto)/100));
    }
}
