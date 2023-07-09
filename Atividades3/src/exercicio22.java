/*22- Crie uma classe Java chamada MaiorNumero que contenha um método que receba dois
números inteiros e mostre o maior entre eles.*/
import java.util.Scanner;
public class exercicio22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int PrimeiroNumero ,SegundoNumero;
        System.out.println("Digite o primeiro numero inteiro: ");
        PrimeiroNumero = s.nextInt();
        System.out.println("Digite o segundo numero inteiro: ");
        SegundoNumero = s.nextInt();
        MaiorNumero(PrimeiroNumero,SegundoNumero);
    }
    static void MaiorNumero(int PrimeiroNumero,int SegundoNumero){
        if(SegundoNumero > PrimeiroNumero){
            System.out.println("O maior numero " + SegundoNumero);
        }else if(PrimeiroNumero > SegundoNumero){
            System.out.println("O maior numero " + PrimeiroNumero);
        }else{
            System.out.println("Os numeros inteiros tem o mesmo valor");
        }
    }
}
