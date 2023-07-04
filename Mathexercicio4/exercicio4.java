/*4- Agora, alguns exercícios de geometria com a classe Math do Java, para conhecermos as fórmulas e
conceitos de geometria em cálculos de áreas, perímetros e outras propriedades das figuras geométricas.
a) Calcular a área de um círculo, sendo fornecido pelo usuário o RAIO.
b) Calcular a circunferência de um círculo, onde o usuário informa o RAIO.
c) Calcular a hipotenusa de um triângulo retângulo, onde o usuário fornece o CATETO1 e CATETO2
d) Calcular o perímetro de um retângulo:
e) Calcular a área de um triângulo, sendo fornecido pelo usuário a BASE e a ALTURA do triângulo
*/
import java.util.Scanner;
public class exercicio4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double Raio, AreaA, Circinferencia;//a, b)
        double Cateto1, Cateto2, Hipotenusa;//c)
        double Perimetro, PeriRetanguloLado1, PeriRetanguloLado2;//d)
        double Base, Altura, AreaE;//e)

        //a)
        System.out.println("Digite o raio: ");
        Raio = s.nextDouble();
        AreaA = Math.PI * (Raio * Raio);
        System.out.println("Resultado da a:" + AreaA);
        //*************************************************************************
        //b)
        Circinferencia = 2 * Math.PI * Raio;
        System.out.println("Resultado da b:" + Circinferencia);
        //*************************************************************************
        //c)
        System.out.println("Digite o cateto 1: ");
        Cateto1 = s.nextDouble();
        System.out.println("Digite o cateto 2: ");
        Cateto2 = s.nextDouble();
        Cateto1 = Math.pow(Cateto1, 2);
        Cateto2 = Math.pow(Cateto2, 2);
        Hipotenusa = Cateto1 + Cateto2;
        Hipotenusa = Math.sqrt(Hipotenusa);
        System.out.println("Resultado da c: " + Hipotenusa);
        //*************************************************************************
        //d)
        System.out.println("Digite o primeiro lado do retângulo: ");
        PeriRetanguloLado1 = s.nextDouble();
        System.out.println("Digite o segundo lado do retângulo: ");
        PeriRetanguloLado2 = s.nextDouble();
        Perimetro = 2 * (PeriRetanguloLado1 + PeriRetanguloLado2);
        System.out.println("Resultado da d: " + Perimetro);

        //*************************************************************************
        //e)
        System.out.println("Digite altura do triângulo: ");
        Altura = s.nextDouble();
        System.out.println("Digite base do triângulo: ");
        Base = s.nextDouble();
        AreaE = (Altura * Base)/2;
        System.out.println("Resultado da e: " + AreaE);


    }
}
