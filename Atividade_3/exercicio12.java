package Atividade_3;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        int ProdutoValor1;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        ProdutoValor1 = s.nextInt();
        System.out.println("Resultado: " + (ProdutoValor1 * 1.15));
    }
}
