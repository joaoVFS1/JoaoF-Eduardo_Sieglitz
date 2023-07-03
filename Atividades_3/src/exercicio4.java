/*4- Solicite ao usuário que digite uma temperatura em graus Celsius e converta para Fahrenheit.
 Em seguida, mostre o resultado.*/
import java.util.Scanner;
public class exercicio4 {
    public static void main(String[] args) {
        double Fahrenheit, Temperatura;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite temperatura: ");
        Temperatura = s.nextDouble();
        Fahrenheit = (Temperatura * 1.8) + 32;
        System.out.println("Resultado: " + Fahrenheit + " Fahrenjeit");
    }
}
