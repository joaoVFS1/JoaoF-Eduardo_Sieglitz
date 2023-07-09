/*1- Solicite ao usuário que digite dois números inteiros e realize a soma entre eles.
 Em seguida, mostre o resultado.*/
import java.util.Scanner;
public class exercicio_1 {
    public static void main(String[] args) {
        int NumeroPrimeiro, NumeroSegundo;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o primeiro numero inteiro: ");
        NumeroPrimeiro = s.nextInt();
        System.out.println("Digite o segundo numero inteiro: ");
        NumeroSegundo = s.nextInt();
        System.out.println("A soma entre os numeros inteiros é " + (NumeroPrimeiro + NumeroSegundo));
    }
}
