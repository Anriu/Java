package application;

/**
 * @author anriu
 */
public class Program {

    
    public static void main(String[] args) {
        
       int x  = 20; 
       //Wrapper classes tratam tipos primitivos como calsses de maneira transparente para o compitalador
       Integer obj = x;
       System.out.println(obj);
       
       //Com o uso da Wrapper, não é necessario fazer casting 
       int y = obj;
       System.out.println(y);
    
    
    }

}
