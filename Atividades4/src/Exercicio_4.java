/*4- Agora, alguns exercícios de geometria com a classe Math do Java, para conhecermos as fórmulas e
conceitos de geometria em cálculos de áreas, perímetros e outras propriedades das figuras geométricas.
a) Calcular a área de um círculo, sendo fornecido pelo usuário o RAIO.
b) Calcular a circunferência de um círculo, onde o usuário informa o RAIO.
c) Calcular a hipotenusa de um triângulo retângulo, onde o usuário fornece o CATETO1 e CATETO2
d) Calcular o perímetro de um retângulo:
e) Calcular a área de um triângulo, sendo fornecido pelo usuário a BASE e a ALTURA do triângulo
*/
import java.util.Scanner;
public class Exercicio_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double Raio_a, Area_a;//Variavel da alternativa (a)
        System.out.println("Digite o numero do raio: ");
        Raio_a = s.nextDouble();
        Area_a = Math.PI * (Raio_a * Raio_a);
        System.out.println("A área do círculo é " + Area_a + "\n");

        double Raio_b, Circinferencia_b;//Variavel da alternativa (b)
        System.out.println("Digite o numero do raio: ");
        Raio_b = s.nextDouble();
        Circinferencia_b = 2 * Math.PI * Raio_b;
        System.out.println("A circunferência do círculo é " + Circinferencia_b + "\n");

        double Cateto1_c, Cateto2_c, Hipotenusa_c;//Variavel da alternativa (c)
        System.out.println("Digite o numero do primeiro cateto: ");
        Cateto1_c = s.nextDouble();
        System.out.println("Digite o numero do segundo cateto: ");
        Cateto2_c = s.nextDouble();
        Cateto1_c = Math.pow(Cateto1_c, 2);
        Cateto2_c = Math.pow(Cateto2_c, 2);
        Hipotenusa_c = Cateto1_c + Cateto2_c;
        Hipotenusa_c = Math.sqrt(Hipotenusa_c);
        System.out.println("A hipotenusa do triângulo retângulo é " + Hipotenusa_c + "\n");

        double Perimetro_d, RetanguloLado1_d, RetanguloLado2_d;//Variavel da alternativa (d)
        System.out.println("Digite o primeiro lado do retângulo: ");
        RetanguloLado1_d = s.nextDouble();
        System.out.println("Digite o segundo lado do retângulo: ");
        RetanguloLado2_d = s.nextDouble();
        Perimetro_d = 2 * (RetanguloLado1_d + RetanguloLado2_d);
        System.out.println("O perímetro do retângulo é " + Perimetro_d + "\n");

        double Base_e, Altura_e, Area_e;//Variavel da alternativa (e)
        System.out.println("Digite altura do triângulo: ");
        Altura_e = s.nextDouble();
        System.out.println("Digite base do triângulo: ");
        Base_e = s.nextDouble();
        Area_e = (Altura_e * Base_e)/2;
        System.out.println("A área do triângulo é" + Area_e);


    }
}
