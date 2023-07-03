/*23- Use as funções SQRT e POW da classe MATH para calcular a raiz quadrada e elevar os números as suas
devidas potências*/
import java.util.Scanner;
public class exercicio23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double num1 , num2;
        System.out.println("Digite um numero 1: ");
        num1 = s.nextDouble();
        System.out.println("Digite um numero 2: ");
        num2 = s.nextDouble();
        System.out.println(Math.sqrt(num1));
        System.out.println(Math.pow(num1 , num2));
    }
}
