/*14- Solicite ao usuário que digite um número inteiro e calcule o cubo desse número. Em seguida,
 mostre o resultado.*/
import java.util.Scanner;
public class exercicio14 {
    public static void main(String[] args) {
        int Cubo;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        Cubo = s.nextInt();
        System.out.println("O cubo do numero que foi digitado é " + ((Cubo * Cubo) * Cubo));
    }
}
