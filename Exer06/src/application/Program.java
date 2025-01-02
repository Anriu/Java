package application;

import java.util.Locale;
import java.util.Scanner;
import entidades.Conta;

public class Program {

    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta usuarioConta;
        
        System.out.printf("Enter account number:");
        int numero = sc. nextInt();
        sc.nextLine();
        System.out.printf("Enter account holder:");
        String name = sc.nextLine();
        System.out.printf("Is there na initial deposit (y/n)? ");
        char resposta = sc.next().charAt(0);
        
        if(resposta == 'y'){
            System.out.printf("Emter initial deposit value: ");
            double valor = sc.nextDouble();
            usuarioConta = new Conta(numero, name, valor);
        } else{
            usuarioConta = new Conta(numero, name);
        }
        
        
        System.out.println("Accnout data: ");
        System.out.println(usuarioConta);
        System.out.println();
        
        System.out.printf("Enter a deposit value: ");
        double deposito = sc.nextDouble();
        usuarioConta.deposito(deposito);
        System.out.println("Updated account data: ");
        System.out.println(usuarioConta);
        System.out.println();
        
        System.out.printf("Enter a withdraw value: ");
        double saque = sc.nextDouble();
        usuarioConta.saque(saque);
        System.out.println("Updated account data: ");
        System.out.println(usuarioConta);
       
        sc.close();
    }
    
}
