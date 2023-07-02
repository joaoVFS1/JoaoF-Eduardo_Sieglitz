package Atividade_3;

import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args) {
        double ProdutoValor1, Parcelas;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        ProdutoValor1 = s.nextDouble();
        System.out.println("Digite o valor do desconto:");
        Parcelas = s.nextDouble();
        System.out.println("Resultado: " + (ProdutoValor1 / Parcelas));
    }
}
