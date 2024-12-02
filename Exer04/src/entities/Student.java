package entities;


public class Student {
    public String name;
    public double point1;
    public double point2;
    public double point3;
    
    
    public double sumPoints(){
       return point1 + point2 + point3;
    }
    
    public double comparePoints(){
        if(sumPoints() < 60.0){
            return 60.0 - sumPoints();
        }
        else {
            return 0.0;
        }
    }
}
