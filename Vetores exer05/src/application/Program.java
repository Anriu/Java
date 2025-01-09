package application;

import entities.Pessoa;
import java.util.Locale;
import java.util.Scanner;


public class Program {

    public static void main(String[] args) {
        
        /*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
        tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
        bem como os nomes dessas pessoas caso houver.*/
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        
        Pessoa[] pessoa = new Pessoa[n];
        
        for(int i=0; i < pessoa.length; i++) {
            sc.nextLine();
            System.out.printf("Dados da %da pessoa\n", i+1);
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            pessoa[i] = new Pessoa(name, idade, altura);
        }
        double sum = 0.0;
        
        for(int i=0; i<pessoa.length; i++) {
            sum += pessoa[i].getAltura();
        }
        
        double avg = sum / pessoa.length;
        System.out.printf("\nAltura media: %.2f\n", avg);
        
        int count = 0;
        
        for(int i=0; i<pessoa.length; i++) {
            if (pessoa[i].getIdade() < 16) {
                count += 1;
            }
        }
        double percentage = (count * 100)/pessoa.length;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n",percentage);
        
        for(int i=0; i<pessoa.length; i++) {
            if (pessoa[i].getIdade() < 16) {
                System.out.println(pessoa[i].getName());
            }
        }
        
        sc.close();
    }
    
}
