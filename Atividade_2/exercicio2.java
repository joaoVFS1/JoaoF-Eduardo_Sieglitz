package Atividade_2;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        String NomePessoa;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        NomePessoa = s.nextLine();

        System.out.println("Boas vindas " + NomePessoa);
    }
}
