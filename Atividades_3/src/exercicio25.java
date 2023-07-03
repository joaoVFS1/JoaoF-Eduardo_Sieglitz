/*25- Faça um programa que converte de dólar para moeda real e exibe para o usuário o resultado. O valor que o
usuário digitar será considerado em dólar e o resultado na moeda real. (Cotação de 1 (um) dólar é R$ 3,55)*/
import java.util.Scanner;
public class exercicio25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double Real, Dolar;
        System.out.println("Digite um valor em dolar: ");
        Dolar = s.nextDouble();
        Real = Dolar * 4.70;
        System.out.println(Dolar + "para real é " + Real + " reais");
    }
}
