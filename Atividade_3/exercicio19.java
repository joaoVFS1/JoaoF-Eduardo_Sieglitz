package Atividade_3;

import java.util.Scanner;

public class exercicio19 {
    public static void main(String[] args) {
        int Meses, Idade, Dias;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        Idade = s.nextInt();
        System.out.println("Digite quantos meses você viveu:");
        Meses = s.nextInt();
        Dias = Meses * 30;
        System.out.println("Resultado: " + Dias);
    }
}
