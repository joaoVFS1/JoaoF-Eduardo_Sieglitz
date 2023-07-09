/*20- Solicite ao usuário que digite o valor do lado de um quadrado e calcule a área desse quadrado.
Em seguida, mostre o resultado.*/
import java.util.Scanner;
public class exercicio20 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        double QuadradoValorDeUmLado;
        System.out.println("Digite um lado do quadrado: ");
        QuadradoValorDeUmLado = s.nextDouble();
        System.out.println("A área do quadrado é " + (QuadradoValorDeUmLado * 4));
    }
}
