/*17- Solicite ao usuário que digite o valor de um produto e a quantidade de parcelas desejada.
Calcule o valor de cada parcela. Em seguida, mostre o resultado.*/
import java.util.Scanner;
public class exercicio17 {
    public static void main(String[] args) {
        double Produto,Parcelas;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        Produto = s.nextDouble();
        System.out.println("Digite quantidade de Parcelas: ");
        Parcelas = s.nextDouble();
        System.out.println("O valor de cada parcela é " + (Produto / Parcelas));
    }
}
