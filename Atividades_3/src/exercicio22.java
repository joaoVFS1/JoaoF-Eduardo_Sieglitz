/*22- Crie uma classe Java chamada MaiorNumero que contenha um método que receba dois números inteiros e
mostre o maior entre eles.*/
import java.util.Scanner;
public class exercicio22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 ,num2;
        System.out.println("Digite o numero 1: ");
        num1 = s.nextInt();
        System.out.println("Digite o numero 2: ");
        num2 = s.nextInt();
        MaiorNumero(num1, num2);
    }
    static void MaiorNumero(int num1, int num2){
        if(num1 > num2){
            System.out.println("O maior numero é " + num1);
        }else{
            System.out.println("O maior numero é " + num2);
        }
    }
}
