/*6- Solicite ao usuário que digite dois números inteiros e,
 em seguida, imprima uma mensagem mostrando os números fornecidos*/
import java.util.Scanner;
public class exercicio6 {
    public static void main(String[] args) {
        int Numero1,Numero2;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um numero 1: ");
        Numero1 = s.nextInt();
        System.out.println("Digite um numero 2: ");
        Numero2 = s.nextInt();
        System.out.println("Numero 1: " + Numero1 +"\nNumero 2: "+Numero2);
    }
}
