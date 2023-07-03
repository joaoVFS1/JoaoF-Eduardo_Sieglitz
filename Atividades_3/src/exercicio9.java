/*9- Solicite ao usuário que digite a quantidade de litros de combustível abastecidos
 e o valor do litro. Calcule o valor total a ser pago. Em seguida, mostre o resultado.*/
import java.util.Scanner;
public class exercicio9 {
    public static void main(String[] args) {
        double ValorLitros, QuantLitros;
        Scanner s = new Scanner(System.in);
        System.out.println("Valor do litro: ");
        ValorLitros = s.nextDouble();
        System.out.println("quantidade de litros de combustível : ");
        QuantLitros = s.nextDouble();
        System.out.println("Resultado: " + (ValorLitros * QuantLitros));

    }
}
