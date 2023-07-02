/*7- Solicite ao usuário que digite o seu nome, idade e cidade onde reside,
 e em seguida, imprima uma mensagem utilizando essas informações.*/
import java.util.Scanner;
public class exercicio7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int Idade ;
        String Cidade, Nome;
        System.out.println("Digite seu nome: ");
        Nome = s.next();
        System.out.println("Digite sua idade: ");
        Idade = s.nextInt();
        System.out.println("Digite em que cidade você mora: ");
        Cidade = s.next();

        System.out.println("Seu nome é " + Nome + "\nSua idade " + Idade + " anos\nVocê mora em " + Cidade);

    }
}
