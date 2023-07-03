/*24- Elabore uma tabuada, sendo fornecido o número para a tabuado pelo usuário.
 A classe deve multiplicar este numero e mostrar o resultado da seguinte forma:*/
import java.util.Scanner;
public class exercicio24 {
    public static void main(String[] args) {
        double[] num1 = new double[100];
        double[] num2 = new double[100];
        Scanner s = new Scanner(System.in);
        System.out.println("Digite que tabuada você quer saber: ");
        num1[1] = s.nextDouble();
        System.out.println("Digite até onde ela vai: ");
        num2[1] = s.nextDouble();
        for(int i = 1 ; i <= num2[1]; i++) {
            System.out.println(num1[1] + " * " + i + " = " + (num1[1] * i));
        }
    }
}
