package exer04;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

/**
 * @author anriu
 */

public class Main {

    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Student student = new Student();
        
        student.name = sc.nextLine();
        student.point1 = sc.nextDouble();
        student.point2 = sc.nextDouble();
        student.point3 = sc.nextDouble();
        
        System.out.printf("FINAL GRADE = %.2f%n", student.sumPoints());
        
        if(student.sumPoints() < 60){
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f%n POINTS", student.comparePoints());
        }
        else {
            System.out.println("PASS");
        }
        
        sc.close();
    }
    
}
