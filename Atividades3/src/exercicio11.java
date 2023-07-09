/*11- Solicite ao usuário que digite um número inteiro e calcule o quadrado desse número.
 Em seguida, mostre o resultado*/
import java.util.Scanner;
public class exercicio11 {
    public static void main(String[] args) {
        int Quadrado;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um numero inteiro para calcular o quadrado: ");
        Quadrado = s.nextInt();
        System.out.println("O quadrado do numero digitado é " + (Quadrado * Quadrado));
    }
}
