package numerofatorial;

import java.util.Scanner;

/**
 * @author anriu
 */
public class NumeroFatorial {

    public static void main(String[] args) {
        // Um número fatorial é representando por ! e é representando como n! = n * (n-1), até que o n assuma o valor de 1, como por exemplo 4! = 4 * 3 * 2 * 1
        // Sendo N diferente de 0 e positivo
        int numero;
        int fator =1;
        
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        
        if(numero <= 0){
            System.out.println("Nao e possivel calcular o fatorial");
        } else {
            
            //Calculo do fatorial do numero
            for(int i = 1; i <= numero; i++){
                fator = fator * i;
            }
            System.out.println(fator);
        }
       
    


    }
    
}
