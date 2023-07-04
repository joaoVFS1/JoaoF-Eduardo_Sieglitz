/*5- Elabore um projeto em JAVA, para calcular o LADO ADJACENTE de um triângulo retângulo com base na
hipotenusa e no lado oposto. O programa deve solicitar que o usuário digite o VALOR DA HIPOTENUSA
e do VALOR DO OPOSTO do triângulo retângulo. Em seguida, utilizará a fórmula mencionada
anteriormente para calcular e exibir o resultado.*/
import java.util.Scanner;
public class exercicio5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double ValorHipotenusa, ValorOposto, Adjacente;
        System.out.println("Digite o valor da hipotenusa: ");
        ValorHipotenusa = s.nextDouble();
        System.out.println("Digite o valor oposto: ");
        ValorOposto = s.nextDouble();
        Adjacente = Math.sqrt(Math.pow(ValorHipotenusa, 2) - Math.pow(ValorOposto, 2));
        System.out.println("O cateto adjacente é: " + Adjacente);
    }
}
