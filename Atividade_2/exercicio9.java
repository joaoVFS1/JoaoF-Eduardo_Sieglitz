package Atividade_2;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String NomePessoa,NomeRua,Numero,CEP,Cidade,Estado,Telefone,CPF;

        System.out.println("Digite seu nome: ");
        NomePessoa = s.next();
        System.out.println("Digite nome da rua: ");
        NomeRua = s.next();
        System.out.println("Digite seu numero: ");
        Numero = s.next();
        System.out.println("Digite seu CEP: ");
        CEP = s.next();
        System.out.println("Digite sua cidade: ");
        Cidade = s.next();
        System.out.println("Digite seu estado: ");
        Estado = s.next();
        System.out.println("Digite seu telefone: ");
        Telefone = s.next();
        System.out.println("Digite seu CPF: ");
        CPF = s.next();

        System.out.println(
                "Nome........:"+ NomePessoa +"\n" +
                "Endereço RUA:" +NomeRua +  " NUMERO:" + Numero + " CEP:"+ CEP +"\n" +
                "Cidade......:" + Cidade + "\n" +
                "Estado......:" +Estado+ "\n" +
                "CPF.........:"+ CPF +"\n" +
                "Tel. Celular:" + Telefone);

    }
}
