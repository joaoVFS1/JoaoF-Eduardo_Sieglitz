/*2- Solicite ao usuário que digite o seu nome e,
 em seguida, imprima uma mensagem de boas-vindas utilizando o nome fornecido.*/
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        String NomePessoa;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        NomePessoa = s.nextLine();
        System.out.println("Boas vindas " + NomePessoa);
    }
}
