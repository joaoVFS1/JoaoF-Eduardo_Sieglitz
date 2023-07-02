package Atividade_3;

import java.util.Scanner;

public class exercicio22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int MaiorNumero, num1 , num2;
        System.out.println("Digite um numero: ");
        num1 = s.nextInt();
        System.out.println("Digite um numero: ");
        num2 = s.nextInt();
        MaiorNumero(num1, num2);
    }
    static void MaiorNumero(int num1, int num2){
        if(num1 > num2){
            System.out.println("O maior numero é " + num1);
        }else{
            System.out.println("O maior numero é " + num2);
        }
    }
}
