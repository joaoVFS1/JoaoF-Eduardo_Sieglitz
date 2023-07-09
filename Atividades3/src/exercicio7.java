/*Solicite ao usuário que digite dois números inteiros e realize a multiplicação entre eles.
 Em seguida, mostre o resultado.*/
import java.util.Scanner;
public class exercicio7 {
    public static void main(String[] args) {
        int NumeroPrimeiro,NumeroSegundo;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o primeiro numero inteiro: ");
        NumeroPrimeiro = s.nextInt();
        System.out.println("Digite o segundo numero interio: ");
        NumeroSegundo = s.nextInt();
        System.out.println("O resultado da multiplicação entre os numeros inteiros é " + (NumeroPrimeiro * NumeroSegundo));




    }
}
