/*3- Solicite ao usuário que digite a sua idade e,
 em seguida, imprima uma mensagem informando a idade fornecida.*/
import java.util.Scanner;
public class exercicio3 {
    public static void main(String[] args) {
        int Idade;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        Idade = s.nextInt();

        System.out.println("Sua idade é: " + Idade);

    }
}
