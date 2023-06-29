package Atividade_2;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        String NomeCidade, NomePessoa;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        NomePessoa = s.nextLine();
        System.out.println("Digite o nome da cidade em que você mora: ");
        NomeCidade = s.nextLine();

        System.out.println(" Olá " +  NomePessoa + ", você mora na cidade de " + NomeCidade + ".");
    }
}
