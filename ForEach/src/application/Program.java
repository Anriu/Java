

package application;

/**
 *
 * @author anriu
 */
public class Program {

    
    public static void main(String[] args) {
        
        
        /*For each* sendo uma sintaxe opcional e simplificada para percorrer colecoes
        
        
        sintaxe:
        
        for (Ripo apelido : colecao){
            <comando 1>
            <comando 2>
        ...
        }
        
        */
        
        String[] vect = new String []{"Maria","Bob","Alex"};
        
        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }
        
        System.out.println();
        
        for (String obj : vect){
            System.out.println(obj);
        }
        
    }

}
