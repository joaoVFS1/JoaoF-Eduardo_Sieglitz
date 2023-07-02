package Atividade_3;

import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {
        double PesoQuilogramas, Altura, PesoKg;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite seu peso em quilogramas: ");
        PesoQuilogramas = s.nextDouble();
        System.out.println("Digite sua altura em metros: ");
        Altura = s.nextDouble();
        PesoKg = PesoQuilogramas / 1000;
        System.out.println("Resultado" + (PesoKg / (Altura * Altura)));
    }
}
