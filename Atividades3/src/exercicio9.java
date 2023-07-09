/*9- Solicite ao usuário que digite a quantidade de litros de combustível abastecidos e o valor do litro. Calcule o valor
total a ser pago. Em seguida, mostre o resultado.*/
import java.util.Scanner;
public class exercicio9 {
    public static void main(String[] args) {

        double ValorDoLitro, QuantDeLitrosComprado;

        Scanner s = new Scanner(System.in);
        System.out.println("Valor do litro: ");
        ValorDoLitro = s.nextDouble();
        System.out.println("quantidade de litros de combustível comprado: ");
        QuantDeLitrosComprado = s.nextDouble();
        System.out.println("O valor a ser pago pelo combustivel é " + (ValorDoLitro * QuantDeLitrosComprado));

    }
}
