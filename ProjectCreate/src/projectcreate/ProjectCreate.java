
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectcreate;

import java.util.Scanner;

/**
 *
 * @author IDEMUDO
 */
public class ProjectCreate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person we = new Person();
        String choice; 
        System.out.println("welcome to FirstBank\nPlease press C to create an account\n or press L to login");
        Scanner put = new Scanner(System.in);
        choice = put.nextLine();
        switch(choice.toLowerCase()){
            case "l":
                System.out.println("WELCOME " + we.getName() + "\nYOUR ACCOUNT BALANCE IS " + we.getAccountBalance() );
                System.out.println("\nWHAT WOULD YOU LIKE TODO\nPRESS W TO WITHDRW\nT TO TRANSFER");
                String choice1;
                choice1 = put.nextLine();
                switch(choice1.toLowerCase()){
                    case "t":
                        
                        break;
                    case "w":
                        
                        break;
                        
                }
                break;
            case "c":
                
                break;
        }
        
        
        
        
        
    }
    
}
