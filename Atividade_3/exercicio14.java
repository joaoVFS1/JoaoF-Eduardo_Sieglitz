package Atividade_3;

import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        int Cubo;
        Scanner s = new Scanner(System.in);
        System.out.println("Calcular o cubo de um numero: ");
        Cubo = s.nextInt();
        System.out.println("Resultado" + ((Cubo * Cubo) * Cubo));
    }
}
