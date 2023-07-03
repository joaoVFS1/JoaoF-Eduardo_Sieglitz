/*7- Solicite ao usuário que digite dois números inteiros e realize a multiplicação entre eles.
 Em seguida, mostre o resultado.*/
import java.util.Scanner;
public class exercicio7 {
    public static void main(String[] args) {
        int Numero1,Numero2;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um numero 1: ");
        Numero1 = s.nextInt();
        System.out.println("Digite um numero 2: ");
        Numero2 = s.nextInt();
        System.out.println("Resultado: " + (Numero1 * Numero2));
    }
}
