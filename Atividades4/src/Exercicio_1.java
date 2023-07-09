/*1- Implemente uma classe em Java que leia as coordenadas de dois pontos e calcule a distância
entre eles.
Equação de cálculo:
✔ Use a função Math.sqrt para calcular a raiz quadrada.
✔ Use a função Math.pow para elevar os números as suas devidas potências.
✔ Use double para as variáveis*/
import java.util.Scanner;

public class Exercicio_1 {

    public static void main(String[] args) {
    double CoordenadaPonto1 = 0.0, CoordenadaPonto2 = 0.0, DistenciaFinalEntreOsPontos,
            DistanciaPonto1, DistenciaPonto2;
        Scanner s = new Scanner (System.in);
        System.out.println("Digite a coordenada do primeiro ponto, em inteiro ou deciamal: ");
        CoordenadaPonto1 = s.nextDouble();
        System.out.println("Digite a coordenada do segundo ponto, em inteiro ou deciamal: ");
        CoordenadaPonto2 = s.nextDouble();
        DistanciaPonto1 = Math.pow (CoordenadaPonto1, 2);
        DistenciaPonto2 = Math.pow (CoordenadaPonto2, 2);
        DistenciaFinalEntreOsPontos = Math.sqrt(DistanciaPonto1 + DistenciaPonto2);
        System.out.println("A distancia entre o primeiro ponto e o segundo ponto é " + DistenciaFinalEntreOsPontos);
    }
}
