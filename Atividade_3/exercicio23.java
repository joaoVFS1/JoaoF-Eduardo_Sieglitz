package Atividade_3;

import java.util.Scanner;

public class exercicio23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double num1 , num2;
        System.out.println("Digite um numero: ");
        num1 = s.nextDouble();
        System.out.println("Digite um numero: ");
        num2 = s.nextDouble();
        System.out.println(Math.sqrt(num1));
        System.out.println(Math.pow(num1 , num2));
    }
}
