package application;

import java.util.Scanner;

/**
 *
 * @author anriu
 */
public class Program {

    public static void main(String[] args) {
        /*Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
        devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
        da pessoa mais velha.*/

        Scanner sc = new Scanner(System.in);

        int tamanhoVetor = 0;
        System.out.print("Quantas pessoas voce vai digitar? ");
        tamanhoVetor = sc.nextInt();

        String[] nome = new String[tamanhoVetor];
        int[] idade = new int[tamanhoVetor];

        for (int i = 0; i < tamanhoVetor; i++) {
            sc.nextLine();
            System.out.printf("dados da %da pessoa\n", i + 1);
            System.out.print("Nome: ");
            nome[i] = sc.nextLine();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
        }

        int indice = 0;
        int maior = idade[0];

        for (int i = 0; i < idade.length; i++) {
            if (idade[i] > maior) {
                maior = idade[i];
                indice = i;
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + nome[indice]);

        sc.close();
    }

}
