/*1- Implemente uma classe em Java que leia as coordenadas de dois pontos
e calcule a distância entre eles.
    Equação de cálculo:
✔ Use a função Math.sqrt para calcular a raiz quadrada.
✔ Use a função Math.pow para elevar os números as suas devidas potências.
✔ Use double para as variáveis.*/
public class exercicio1 {
    public static void main(String[] args) {
    double Potencia1 = 0.0, Potencia2 = 0.0, Raiz, Parte1, Parte2;
        Parte1 = Math.pow (Potencia1, 2);
        Parte2 = Math.pow (Potencia2, 2);
        Raiz = Math.sqrt(Parte1 + Parte2);
        System.out.println("Resultado: " + Raiz);

    }
}
