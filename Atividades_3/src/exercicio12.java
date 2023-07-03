/*12- Solicite ao usuário que digite o valor de um produto e aplique um acréscimo de 15%.
 Calcule o valor com acréscimo e mostre o resultado.*/
import java.util.Scanner;
public class exercicio12 {
    public static void main(String[] args) {
        double ProdutoValor1;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        ProdutoValor1 = s.nextDouble();
        System.out.println("Resultado: " + (ProdutoValor1 * 1.15));
    }
}
