/*3- Esses exercícios utilizam algumas funções trigonométricas e logarítmicas da classe Math em Java.
Calcule os itens abaixo com o VALOR fornecido por um usuário:
a) Calcular a tangente de um ângulo (VALOR) em radianos
b) Calcular o arco seno do VALOR
c) Calcular o arco cosseno do VALOR
d) Calcular o arco tangente do VALOR
e) Calcular o logaritmo natural do VALOR*/
import java.util.Scanner;
public class exercicio3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double ValorX;
        System.out.println("Digite um valor: ");
        ValorX = s.nextDouble();
        //a)
        System.out.println(Math.tan(ValorX));

        //b)
        System.out.println(Math.asin(ValorX));

        //c)
        System.out.println(Math.acos(ValorX));

        //d)
        System.out.println(Math.atan(ValorX));

        //e)
        System.out.println(Math.log(ValorX));
    }
}
