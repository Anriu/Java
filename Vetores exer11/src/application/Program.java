package application;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author anriu
 */
public class Program {

    public static void main(String[] args) {
        /*Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
        no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
        os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
        igual a 6.0 (seis).*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quantidadeAlunos = 0;
        
        System.out.print("Quantos alunos serao digitados? ");
        quantidadeAlunos = sc.nextInt();
        
        String[] nome = new String[quantidadeAlunos];
        double[] nota1 = new double[quantidadeAlunos];
        double[] nota2 = new double[quantidadeAlunos];
        
        for(int i = 0; i < quantidadeAlunos; i++){
          
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno\n", i+1);
            sc.nextLine();
            nome[i] = sc.nextLine();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();  
        }
        
        
        
        System.out.println("Alunos aprovados: ");
        for(int i =0; i < quantidadeAlunos; i++){
            
           double soma = nota1[i] + nota2[i];  
           double media = soma / 2;
           
           if(media >= 6.0){
               System.out.println(nome[i]);
           }
            
        }
        
        sc.close();
    }

}
