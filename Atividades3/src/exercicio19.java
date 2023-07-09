/*19- Solicite ao usuário que digite a sua idade e a quantidade de meses que ele viveu.
Calcule o número aproximado de dias que ele viveu. Em seguida, mostre o resultado.*/
import java.util.Scanner;
public class exercicio19 {
    public static void main(String[] args) {
        int Meses,Idade;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        Idade = s.nextInt();
        System.out.println("Digite quantos de meses que você viveu: ");
        Meses = s.nextInt();
        System.out.println("Aproximadamento você viveu " + (Meses * 30) + " dias");
    }
}
