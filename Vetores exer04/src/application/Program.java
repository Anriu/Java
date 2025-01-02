package application;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author anriu
 */
public class Program {

    
    public static void main(String[] args) {
        /*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
          - Imprimir todos os elementos do vetor
          - Mostrar na tela a soma e a média dos elementos do vetor*/
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos numeros voce vai digitar ? ");
        int n = sc.nextInt();
        double[] vect = new double[n];
        
        for (int i=0; i< vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i]= sc.nextDouble();
        }
        
        double sum = 0.0;
        
        System.out.print("Valores = ");
        for (int i=0; i<vect.length; i++) {
            System.out.printf("%.1f ",vect[i]);
            sum += vect[i];
        }
        
        double avg = sum/ vect.length;
        
        System.out.printf("%nSOMA = %.2f%n", sum);
        System.out.printf("MEDIA = %.2f%n", avg);
                
                
        sc.close();
    }
    
}
