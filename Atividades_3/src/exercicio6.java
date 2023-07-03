/*6- Solicite ao usuário que digite a quantidade de dias, horas, minutos e segundos.
 Calcule o total de segundos. Em seguida, mostre o resultado*/
import java.util.Scanner;
public class exercicio6 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int Dias, Segundos, Horas, Minutos, TotalSegundos;
        System.out.println("Digite quantos dias: ");
        Dias = s.nextInt();
        System.out.println("Digite quantos horas: ");
        Horas = s.nextInt();
        System.out.println("Digite quantos minutos: ");
        Minutos = s.nextInt();
        System.out.println("Digite quantos segundos: ");
        Segundos = s. nextInt();
        Dias = Dias * 86400;
        Horas = Horas * 3600;
        Minutos = Minutos * 60;
        TotalSegundos = (Dias + (Horas + Minutos) + Segundos);
        System.out.println(TotalSegundos + " Segundos");
    }
}
