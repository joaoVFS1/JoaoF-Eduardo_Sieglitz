package Atividade_3;

import java.util.Scanner;

public class exercicio20 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        double AreaQuadrado;

        System.out.println("Digite um lado do quadrado");
        AreaQuadrado = s.nextDouble();
        System.out.println("resultado: " + (AreaQuadrado * 4));
    }
}
