/*3- Esses exercícios utilizam algumas funções trigonométricas e logarítmicas da classe Math em Java.
Calcule os itens abaixo com o VALOR fornecido por um usuário:
a) Calcular a tangente de um ângulo (VALOR) em radianos
b) Calcular o arco seno do VALOR
c) Calcular o arco cosseno do VALOR
d) Calcular o arco tangente do VALOR
e) Calcular o logaritmo natural do VALOR*/
import java.util.Scanner;
public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double ValorRadiano_a;//Variavel da alternativa (a)
        System.out.print("Digite um numero radiano 0 a 100: ");
        ValorRadiano_a = s.nextDouble();
        System.out.print("A tangente do ângulo que foi digitado é " + Math.toDegrees(ValorRadiano_a) + "\n");
        //a-
        System.out.println(Math.tan(ValorRadiano_a));
        //b-
        double NumeroRadiano_b;//Variavel da alternativa (b)
        System.out.println("Digite um numero seno radiano: -1, 1, -0,5, 0,5: ");
        NumeroRadiano_b = s.nextDouble();
        System.out.println("Seno do radiano que foi digitado é " + Math.asin(NumeroRadiano_b) + "\n");
        //c-
        double NumeroRadiano_c;//Variavel da alternativa (c)
        System.out.println("Digite um numero cosseno radiano -1, ou -0,5, 0,5: ");
        NumeroRadiano_c = s.nextDouble();
        System.out.println("Cosseno do radiano que foi digitado é " + Math.acos(NumeroRadiano_c) + "\n");
        //d-
        double NumeroRadiano_d;//Variavel da alternativa (d)
        System.out.println("Digite um numero radiano: ");
        NumeroRadiano_d = s.nextDouble();
        System.out.println("Tangente do radiano que foi digitado é " + Math.atan(NumeroRadiano_d) + "\n");
        //e-
        double ValorLogaritmo_e;//Variavel da alternativa (e)
        System.out.println("Digite um valor de 0 a 100: ");
        ValorLogaritmo_e = s.nextDouble();
        System.out.println("O logaritmo natural do valor foi digitado é " + Math.log(ValorLogaritmo_e) + "\n");
    }
}
