/*Solicite ao usuário que digite a quantidade de dias, horas, minutos e segundos.
 Calcule o total de segundos. Em seguida, mostre o resultado.*/
import java.util.Scanner;
public class exercicio6 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int Dias, Horas, Segundos, Minutos;
        System.out.println("Digite uma quantidade de dias aleatorio: ");
        Dias = s.nextInt();
        System.out.println("Digite uma quantidade de horas aleatorio: ");
        Horas = s.nextInt();
        System.out.println("Digite uma quantidade de minutos aleatorio: ");
        Minutos = s.nextInt();
        System.out.println("Digite uma quantidade de segundos aleatorio: ");
        Segundos = s. nextInt();
        Dias = Dias * 86400;
        Horas = Horas * 3600;
        Minutos = Minutos * 60;
        Segundos = (Dias + (Horas + Minutos) + Segundos);
        System.out.println("A conversao de todo esse tem para segundos é " + Segundos + " Segundos");
    }
}
