package application;

import java.util.Locale;
import java.util.Scanner;


/**
 *
 * @author anriu
 */
public class Program {

    
    public static void main(String[] args) {
        /*Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
        mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
        os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.*/
    
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
    
    
        int n = 0;
    
    
        System.out.print("Quantos elementos vai ter o vetor?");
        n = sc.nextInt();
   
        double[] vetor = new double[n];
    
    
        for(int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }
    
        double soma = 0.0;
        for(int i = 0; i < vetor.length; i++){
            soma += vetor[i];
        }
    
        double media = soma/n;
        System.out.printf("\nMEDIA DO VETOR = %.3f\n", media);
    
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i] < media){
            System.out.printf("%.1f\n",vetor[i]);
            }
        }
        sc.close();
    }

}
