/*1- Elabore um projeto em JAVA, para calcular o LADO ADJACENTE de um triângulo retângulo com base na
hipotenusa e no lado oposto. O programa deve solicitar que o usuário digite o VALOR DA HIPOTENUSA
e do VALOR DO OPOSTO do triângulo retângulo. Em seguida, utilizará a fórmula mencionada
anteriormente para calcular e exibir o resultado.*/
import java.util.Scanner;
public class Exercicio_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double Hipotenusa, Oposto, Adjacente;
        System.out.println("Digite o valor da hipotenusa: ");
        Hipotenusa = s.nextDouble();
        System.out.println("Digite o valor do lado oposto: ");
        Oposto = s.nextDouble();
        Adjacente = Math.sqrt(Math.pow(Hipotenusa, 2) - Math.pow(Oposto, 2));
        System.out.println("Calculo do lado adjacente de um triângulo retângulo é " + Adjacente);
    }
}
