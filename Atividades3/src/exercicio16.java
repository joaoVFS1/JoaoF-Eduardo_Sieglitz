/*16- Solicite ao usuário que digite o valor de um produto e a porcentagem de desconto.
Calcule o valor com desconto aplicado. Em seguida, mostre o resultado*/
import java.util.Scanner;
public class exercicio16 {
    public static void main(String[] args) {
        double Produto, ValorDesconto;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        Produto = s.nextDouble();
        System.out.println("Digite o desconto do produto: ");
        ValorDesconto = s.nextDouble();
        System.out.println("O produto com um desconto de "+ValorDesconto+ "% " + (Produto - (Produto * ValorDesconto)/100));
    }
}
