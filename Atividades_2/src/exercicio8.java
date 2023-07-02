/*8- Solicite ao usuário que digite um número inteiro e um número decimal,
 e em seguida, imprima uma mensagem mostrando os números fornecidos*/

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        double NumeroDeci;
        int NumeroInt;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        NumeroInt = s.nextInt();
        System.out.println("Digite um numero decimal: ");
        NumeroDeci = s.nextDouble();
        System.out.println("Numero decimal: " + NumeroDeci +"\nNumero inteiro"+NumeroInt);
    }
}
