package Atividade_3;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        int Numero1,Numero2;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um numero 1: ");
        Numero1 = s.nextInt();
        System.out.println("Digite um numero 2: ");
        Numero2 = s.nextInt();
        System.out.println("Resultado: " + (Numero1 + Numero2));
    }
}
