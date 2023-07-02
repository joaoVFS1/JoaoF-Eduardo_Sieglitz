package Atividade_3;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        double Base, Altura, Area;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite base : ");
        Base = s.nextDouble();
        System.out.println("Digite altura : ");
        Altura = s.nextDouble();
        Area = (Altura * Base)/2;
        System.out.println("Resultado: " + Area);
    }
}
