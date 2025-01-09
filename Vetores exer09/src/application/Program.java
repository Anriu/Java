package application;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author anriu
 */
public class Program {

    public static void main(String[] args) {
        /*Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
        aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
        digitado, mostrar a mensagem "NENHUM NUMERO PAR"*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = 0;
        int soma = 0, quantidade = 0;
        System.out.print("Quantos elementos vai ter no vetor? ");
        n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                quantidade++;
                soma += vetor[i];
            }
        }
        double media = 0.0;

        if (quantidade > 0) {
            media = soma / quantidade;
            System.out.printf("\nMEDIA DOS PARES = %.1f\n", media);
        } else {
            System.out.println("NENHUM NUMERO PAR");
        }
    }

}
