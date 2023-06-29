package Atividade_2;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int Numero1 ;
        String Cidade ;
        System.out.println("Digite sua idade: ");
        Numero1 = s.nextInt();
        System.out.println("Digite em que cidade você mora: ");
        Cidade = s.next();

        System.out.println(Numero1 +"\n"+Cidade);
    }
}
