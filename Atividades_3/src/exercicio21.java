/*21- Solicite ao usuário que digite a sua altura em metros e o seu peso em quilogramas. Calcule o valor do IMC
(Índice de Massa Corporal) utilizando a fórmula: IMC = peso / (altura * altura). Em seguida, mostre o resultado.*/
import java.util.Scanner;
public class exercicio21 {
    public static void main(String[] args) {
        double PesoQuilogramas, Altura;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite seu peso em quilogramas: ");
        PesoQuilogramas = s.nextDouble();
        System.out.println("Digite sua altura em metros: ");
        Altura = s.nextDouble();
        System.out.println("Resultado: " + (PesoQuilogramas / (Altura * Altura)));
    }
}
