package javaapplication1;

import java.util.Scanner;

public class Funcoes {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int maior = max(a,b,c);
        mostrarResultado(maior);
        
        sc.close();
    }
    
    
    //Função responsavel para testar qual dos três números é o maior, rescebendo 3 numeros como parametro e retornando o maior
    public static int max(int x, int  y, int z){
        int aux;
        
        if(x > y && x > z){
            aux = x;
        }
        else if(y>z){
            aux = y;
        } 
        else{
            aux = z;
        }
        
        return aux;
    }
    //Função com retorno vazio (Void) para imprimir na tela o maior valor
    public static void mostrarResultado(int valor){
        System.out.println("O maior numero e o:" + valor);
    }
}

