package javaapplication;


public class JavaApplication {

    public static void main(String[] args) {
        
        int valor=0;
        
        for (int i = -48; i<=48; i++){
            valor = (int) (Math.pow(i, 5) + 3 * Math.pow(i, 4) - 16 * Math.pow(i, 1) - 48);
            if(valor == 0){
                System.out.println("P("+i+") = " + valor);
            } else{
                /*if(i!= 0){
                    if(36%i == 0){
                     System.out.println("P("+i+") = " + valor); 
                    }
                }*/
            }
        }
    }
    
}
