/*15- Solicite ao usuário que digite a sua altura em metros e o seu peso em quilogramas.
Calcule o índice de massa corporal (IMC). Em seguida, mostre o resultado.*/
import java.util.Scanner;
public class exercicio15 {
    public static void main(String[] args) {
        double Quilogramas, Altura;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o peso de uma pessoa em quilogramas: ");
        Quilogramas = s.nextDouble();
        System.out.println("Digite a altura dessa pessoa em  metros: ");
        Altura = s.nextDouble();
        System.out.println("O índice de massa corporal dessa pessoa é " + (Quilogramas / (Altura * Altura)));
    }
}
