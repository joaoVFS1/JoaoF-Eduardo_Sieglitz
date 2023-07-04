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
public class exercicio2 {
    public static void main(String[] args) {
        double ValorX = 100.9999, ValorY = -1.0;

        //a)
        System.out.println(Math.ceil(ValorX));

        //b)
        System.out.println(Math.floor(ValorX));

        //c)
        System.out.println(Math.random());

        //d)
        System.out.println(Math.abs(-1));

        //e)
        System.out.println(Math.max(10, 20));

        //f)
        System.out.println(Math.min(10 , 20));

        //g)
        System.out.println(Math.asin(ValorY));

        //h)
        System.out.println(Math.acos(ValorY));
    }
}
