/*23- Use as funções SQRT e POW da classe MATH para calcular a raiz quadrada
e elevar os números as suas devidas potências.*/
import java.util.Scanner;
public class exercicio23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double PrimeiroNumero, SegundoNumero;
        System.out.println("Digite um numero inteiro: ");
        PrimeiroNumero = s.nextDouble();
        System.out.println("Digite um numero inteiro: ");
        SegundoNumero = s.nextDouble();
        System.out.println("A raiz do primeiro numero e elevando a sua potência " + Math.pow(Math.sqrt(PrimeiroNumero),2) + "\n");
        System.out.println("A raiz do segundo numero e elevando a sua potência " +Math.pow(Math.sqrt(SegundoNumero),2) + "\n");

    }
}
