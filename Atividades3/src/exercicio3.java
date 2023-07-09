/*3- Solicite ao usuário que digite a base e a altura de um triângulo e calcule a área do triângulo.
 Em seguida, mostre o resultado.
*/
import java.util.Scanner;
public class exercicio3 {
    public static void main(String[] args) {
        double Base, Altura, Area;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a base do triângulo: ");
        Base = s.nextDouble();
        System.out.println("Digite a altura do triângulo: ");
        Altura = s.nextDouble();
        Area = (Altura * Base)/2;
        System.out.println("A área do triângulo é " + Area);
    }
}
