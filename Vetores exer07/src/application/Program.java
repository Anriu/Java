

package application;

import java.util.Scanner;

/**
 *
 * @author anriu
 */
public class Program {

    
    public static void main(String[] args) {
        
         /*Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
        terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
        o vetor C gerado.*/   
        Scanner sc = new Scanner(System.in);
    
        int n = 0;
    
        System.out.print("Quantos valores tera em cada vetor? ");
        n = sc.nextInt();
    
        int[] vectA = new int[n];
        int[] vectB = new int[n];
        int[] vectC = new int[n];
    
        System.out.println("Digite os valores do vetor A:");
        for(int i = 0; i < vectA.length; i++) {
            vectA[i] = sc.nextInt();
        }
    
        System.out.println("Digite os valores do vetor B:");
        
        for(int i = 0; i < vectB.length; i++) {
        vectB[i] = sc.nextInt();
        }
 
        for(int i = 0; i < vectC.length; i++) {
            vectC[i] = vectA[i] + vectB[i];
        }
    
        System.out.println("VETOR RESULTANTE:");
        for(int i = 0; i < vectA.length; i++) {
            System.out.println(vectC[i]);
        }
    
   
    
        sc.close();
    }

}
