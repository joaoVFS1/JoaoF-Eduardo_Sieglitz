package Atividade_3;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        int QuadradoNumero;
        Scanner s = new Scanner(System.in);
        System.out.println("Calcular o quadrado de um numero: ");
        QuadradoNumero = s.nextInt();
        System.out.println("Resultado" + (QuadradoNumero * QuadradoNumero));
    }
}
