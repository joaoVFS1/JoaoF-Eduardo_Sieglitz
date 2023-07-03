/*5- Solicite ao usuário que digite a quantidade de horas trabalhadas
 em um dia e o valor da sua hora de trabalho. Calcule o salário diário. Em seguida, mostre o resultado.*/

import java.util.Scanner;
public class exercicio5 {
    public static void main(String[] args) {
        double DinheiroPorHora,HorasThabalhadas,SalarioDiario;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite quantidade de dinheiro ganho por hora : ");
        DinheiroPorHora = s.nextDouble();
        System.out.println("Digite horas trabalhadas: ");
        HorasThabalhadas = s.nextDouble();
        SalarioDiario = DinheiroPorHora * HorasThabalhadas;
        System.out.println("Salario diario: " + SalarioDiario);
    }
}
