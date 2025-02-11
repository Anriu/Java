package exer03;


import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

/**
 * @author anriu
 */
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Employee employee = new Employee();
        
        System.out.print("Name: ");
        employee.name = sc.nextLine();
        
        System.out.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble();
        
        System.out.print("tax: ");
        employee.tax = sc.nextDouble();
        
        System.out.println();
        System.out.println("Employee: " + employee);
        
        System.out.print("Whic percentage to increase salary? ");
        employee.increaseSalary(sc.nextDouble());
        
        System.out.println("Updated data: " + employee);
        
        sc.close();
    }   
    
}
