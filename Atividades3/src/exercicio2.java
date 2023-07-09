/*2- Solicite ao usuário que digite o raio de um círculo e calcule a área do círculo.
 Em seguida, mostre o resultado.*/
import java.util.Scanner;
public class exercicio2 {
    public static void main(String[] args) {

        double PI = Math.PI,Raio,Area;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o valor do raio: ");
        Raio = s.nextDouble();
        Area = PI * (Raio * Raio);
        System.out.println("A área do circulo é " + Area);
    }
}
