/*10- Solicite ao usuário que digite dois números inteiros e realize a troca dos valores digitados entre as variáveis. Em seguida,
imprima os novos valores das variáveis.
*/
import java.util.Scanner;
public class exercicio10 {
    public static void main(String[] args) {
        int Numero1, Numero2, Guardar;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um numero 1: ");
        Numero1 = s.nextInt();
        System.out.println("Digite um numero 2: ");
        Numero2 = s.nextInt();
        Guardar = Numero1;
        Numero1 = Numero2;
        Numero2 = Guardar;
        System.out.println("Numero 1: " +Numero1 +"\n"+ "Numero 2: " +Guardar);
    }
}