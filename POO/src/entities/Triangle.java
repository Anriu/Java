
package entities;


public class Triangle {
    
    public double ladoA;
    public double ladoB;
    public double ladoC;
    
    
public double area(){
    double p = (ladoA+ladoB+ladoC)/2;
    return Math.sqrt(p * (p-ladoA)*(p-ladoB)*(p-ladoC));  
}
    
public void mostrarArea(double area){
    System.out.printf("Triangle area: %.4f%n",area);
}

public void compararAreas(double areaX,double areaY){
    if(areaX > areaY){
            System.out.println("Large area: X");
        }
        else {
            System.out.println("Large area: Y");
        }
}
}

