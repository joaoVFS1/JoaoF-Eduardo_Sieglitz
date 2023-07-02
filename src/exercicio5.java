/*5- Solicite ao usuário que digite um número decimal e,
 em seguida, imprima uma mensagem confirmando o número digitado*/
import java.util.Scanner;
public class exercicio5 {
    public static void main(String[] args) {
        double NumeroDecimal;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um numero decimal: ");
        NumeroDecimal = s.nextDouble();

        System.out.println("O numero digitado é: " + NumeroDecimal);
    }
}
