package application;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author anriu
 */

public class Program {

    
    public static void main(String[] args) {
        
     /*Fazer um programa para ler um número inteiro N e a altura de N pessoas.
       Armazene as N alturas em um vetor. Em seguida, mostrar a altura média dessas pessoas.*/  
    
    Locale.setDefault(Locale.US);    
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    
    
    //Declaraão de vetores em java, tipo de dado a ser utilizado seguido de []
    double[] vect = new double [n];
    
    
    //Para atribuir valores ao vetor, informamos a posição desejada e o valor, então utlizamos um For para percorrer todas as possições do vetor
    for (int i=0; i<n; i++){
        vect[i] = sc.nextDouble();
    }
    
    double sum = 0.0;
    //percorrendo novamente o vetor, para somar o valor de cada posição na variavel sum
    for (int i=0; i<n; i++){
        sum += vect[i];
    }
    
    double avg = sum/n;
    System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
    
    sc.close();
     
    }
    
}
