package Atividade_2;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        int Numero1;
        double Numero2;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        Numero1 = s.nextInt();
        System.out.println("Digite um numero decimal: ");
        Numero2 = s.nextDouble();
        System.out.println(Numero1 +"\n"+Numero2);
    }
}
