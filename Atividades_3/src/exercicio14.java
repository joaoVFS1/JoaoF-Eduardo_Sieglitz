/*14- Solicite ao usuário que digite um número inteiro e calcule o cubo desse número.
 Em seguida, mostre o resultado.*/
import java.util.Scanner;
public class exercicio14 {
    public static void main(String[] args) {
        int Cubo;
        Scanner s = new Scanner(System.in);
        System.out.println("Calcular o cubo de um numero: ");
        Cubo = s.nextInt();
        System.out.println("Resultado: " + ((Cubo * Cubo) * Cubo));
    }
}
