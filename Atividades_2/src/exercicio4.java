/*4- Solicite ao usuário que digite um número inteiro e
,em seguida, imprima uma mensagem confirmando o número digitado*/
import java.util.Scanner;
public class exercicio4 {
    public static void main(String[] args) {
        int Numero;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        Numero = s.nextInt();
        System.out.println("O numero digitado é: " + Numero);
    }
}
