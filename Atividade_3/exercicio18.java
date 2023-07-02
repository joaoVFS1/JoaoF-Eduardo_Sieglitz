package Atividade_3;

import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) {
        int Ano, Idade;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        Idade = s.nextInt();
        System.out.println("Digite em que ano estamos:");
        Ano = s.nextInt();
        System.out.println("Resultado: " + (Ano - Idade));
    }
}
