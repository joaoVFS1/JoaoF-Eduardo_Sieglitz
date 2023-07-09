/*25. Faça um programa que converte de dólar para moeda real e exibe para o usuário o resultado.
 O valor que ousuário digitar será considerado em dólar e o resultado na moeda real.
(Cotação de 1 (um) dólar é R$ 3,55). Pegue a cotação do dolar em:*/
import java.util.Scanner;
public class exercicio25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double Real, Dolar;
        System.out.println("Digite um valor em dolar: ");
        Dolar = s.nextDouble();
        Real = Dolar * 4.90;
        System.out.println(Dolar + "dolares para real é " + Real + " reais");
    }
}
