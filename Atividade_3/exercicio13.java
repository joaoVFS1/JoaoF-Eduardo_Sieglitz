package Atividade_3;

import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        double ValorProduto, QuantComprada;
        Scanner s = new Scanner(System.in);
        System.out.println("Preço de um dia de aluguel: ");
        ValorProduto = s.nextDouble();
        System.out.println("Quantidades de dias alugados: ");
        QuantComprada = s.nextDouble();
        System.out.println("Resultado" + (QuantComprada * ValorProduto));
    }
}
