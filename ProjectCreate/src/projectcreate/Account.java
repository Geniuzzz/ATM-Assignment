/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectcreate;

/**
 *
 * @author IDEMUDO
 */
public class Account {
    private String name1;
    private String[] accountType = {"SAVINGS","CURRENT"};
    private double accountBalance;
    
    public Account(Person me){
        name1 = me.getName();
        accountBalance = me.getAccountBalance();
        
    }
    
}
