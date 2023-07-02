package Atividade_3;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        double DiasAlugados, ValorDiario;
        Scanner s = new Scanner(System.in);
        System.out.println("Preço de um dia de aluguel: ");
        ValorDiario = s.nextDouble();
        System.out.println("Quantidades de dias alugados: ");
        DiasAlugados = s.nextDouble();
        System.out.println("Resultado" + (DiasAlugados * ValorDiario));
    }
}
