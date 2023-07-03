/*18- Solicite ao usuário que digite a sua idade e em que ano estamos, e em seguida,
 mostre uma mensagem mostrando o ano de nascimento.*/
import java.util.Scanner;
public class exercicio18 {
    public static void main(String[] args) {
        int Ano, Idade;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        Idade = s.nextInt();
        System.out.println("Digite em que ano estamos:");
        Ano = s.nextInt();
        System.out.println("Nascimento em: " + (Ano - Idade));
    }
}
