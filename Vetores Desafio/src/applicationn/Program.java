package applicationn;

import entities.Rent;
import java.util.Scanner;

/**
 * @author anriu
 */
public class Program {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Rent[] rooms = new Rent[10];
        
        System.out.print("How many rooms will be rented? ");
        int quantity = sc.nextInt();
        
        for(int i = 1; i <= quantity; i++) {
            System.out.println("\nRent #" + i + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int roomNumeber = sc.nextInt();
            
            rooms[roomNumeber] = new Rent(name, email);
            
        }
        
        System.out.println("\nBusy room: ");
        for (int i = 0; i < 10; i++) {
            if(rooms[i] != null){
                System.out.println(i + ": " + rooms[i]);
            }
        }
        
        
        sc.close();
    }

}
