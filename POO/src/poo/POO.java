package poo;

import entities.Triangle;
import java.util.Locale;
import java.util.Scanner;


public class POO {

    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangle x,y;
        x = new Triangle();
        y = new Triangle();
        
        
        System.out.println("Enter the measures of triangle X:");
        x.ladoA = sc.nextDouble();
        x.ladoB = sc.nextDouble();
        x.ladoC = sc.nextDouble();
        System.out.println("Enter the measures of triangle X:");
        y.ladoA = sc.nextDouble();
        y.ladoB = sc.nextDouble();
        y.ladoC = sc.nextDouble();
        
        
        double areaX  = x.area();
        double areaY  = y.area();
        
        x.mostrarArea(areaX);
        y.mostrarArea(areaY);
        
        x.compararAreas(areaX, areaY);
        
        sc.close();   
    }
    
}
