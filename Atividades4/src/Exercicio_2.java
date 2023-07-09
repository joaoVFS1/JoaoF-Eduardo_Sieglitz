import java.util.Scanner;
/*2- Abaixo alguns exercícios que utilizam funções para diversos tipos de cálculos.
Calcule os itens abaixo com o NUMERO fornecido por um usuário:
a) Arredondar um número para cima:
b) Arredondar um número para baixo:
c) Gerar um número aleatório entre 0 e 1:
d) Calcular o valor absoluto de um número:
e) Calcular o máximo entre dois números:
f) Calcular o mínimo entre dois números:
g) Calcular o seno de um ângulo em radianos:
h) Calcular o cosseno de um ângulo em radianos:*/
public class Exercicio_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        //a-
        double NumeroDecimal_a;//Variavel da alternativa (a)
        System.out.print("Digite um numero decimal: ");
        NumeroDecimal_a = s.nextDouble();
        System.out.print("O número que você digitou foi arredondado para cima " + Math.ceil(NumeroDecimal_a) + "\n");

        //b-
        double NumeroDecimal_b;//Variavel da alternativa (b)
        System.out.print("\nDigite um numero decimal: ");
        NumeroDecimal_b = s.nextDouble();
        System.out.print("O número que você digitou foi arredondado para baixo " + Math.floor(NumeroDecimal_b) + "\n");

        //c-
        System.out.println("\nVai ser gerado um numero aleatório entre 0 e 1");
        System.out.println(Math.random() + "\n");

        //d-
        int NumeroNegativo_d;//Variavel da alternativa (d)
        System.out.println("Digite um numero inteiro negativo: ");
        NumeroNegativo_d = s.nextInt();
        System.out.println("O valor absoludo do numero que foi digitado é " + Math.abs(NumeroNegativo_d) + "\n");

        //e-
        int PrimeiroNumeroInteiro_e, SegundoNumeroInteiro_e;//Variavel da alternativa (e)
        System.out.println("Digite um numero inteiro: ");
        PrimeiroNumeroInteiro_e = s.nextInt();
        System.out.println("Digite outro numero inteiro: ");
        SegundoNumeroInteiro_e = s.nextInt();
        System.out.println("O maior numero digitado foi " + Math.max(PrimeiroNumeroInteiro_e, SegundoNumeroInteiro_e) + "\n");

        //f-
        int PrimeiroNumeroInteiro_f, SegundoNumeroInteiro_f;//Variavel da alternativa (f)
        System.out.println("Digite um numero inteiro: ");
        PrimeiroNumeroInteiro_f = s.nextInt();
        System.out.println("Digite outro numero inteiro: ");
        SegundoNumeroInteiro_f = s.nextInt();
        System.out.println("O menor numero digitado foi " + Math.min(PrimeiroNumeroInteiro_f, SegundoNumeroInteiro_f) + "\n");
        //g-
        double NumeroRadiano_g;//Variavel da alternativa (g)
        System.out.println("Digite um numero seno radiano: -1, 1, -0,5, 0,5: ");
        NumeroRadiano_g = s.nextDouble();
        System.out.println("Seno do radiano que foi digitado é " + Math.asin(NumeroRadiano_g) + "\n");

        //h-
        double NumeroRadiano_h;//Variavel da alternativa (g)
        System.out.println("Digite um numero cosseno radiano -1, ou -0,5, 0,5: ");
        NumeroRadiano_h = s.nextDouble();
        System.out.println("Cosseno do radiano que foi digitado é " + Math.acos(NumeroRadiano_h) + "\n");

    }
}
