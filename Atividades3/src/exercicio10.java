/*0. Solicite ao usuário que digite a quantidade de dias que um carro foi alugado e o valor da diária.
Calcule o valor total do aluguel. Em seguida, mostre o resultado*/
import java.util.Scanner;
public class exercicio10 {
    public static void main(String[] args) {
        double QuantDiasAlugados, ValorDiario;
        Scanner s = new Scanner(System.in);
        System.out.println("Preço de um dia de aluguel de um carro: ");
        ValorDiario = s.nextDouble();
        System.out.println("Quantidades de dias alugados: ");
        QuantDiasAlugados = s.nextDouble();
        System.out.println("O total do aluguel é " + (QuantDiasAlugados * ValorDiario));
    }
}
