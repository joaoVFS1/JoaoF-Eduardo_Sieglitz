/*Solicite ao usuário que digite uma temperatura em graus Celsius e converta para Fahrenheit.
 Em seguida, mostre o resultado.*/
import java.util.Scanner;
public class exercicio4 {
    public static void main(String[] args) {
        double Fahrenheit, Celsius;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite temperatura em graus celsius: ");
        Celsius = s.nextDouble();
        Fahrenheit = (Celsius * 1.8) + 32;
        System.out.println("Graus celsius para fahrenhait é " + Fahrenheit + " fahrenhait");
    }
}
