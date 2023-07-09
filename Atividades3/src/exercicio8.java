/*Solicite ao usuário que digite o valor de um produto e aplique um desconto de 10%.
Calcule o valor com desconto e mostre o resultado.*/
import java.util.Scanner;
public class exercicio8 {
    public static void main(String[] args) {
        int ValorProduto;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        ValorProduto = s.nextInt();
        System.out.println("O produto com um desconto de 10% " + (ValorProduto* 1.10));
    }
}
