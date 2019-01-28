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
public class Person {
    private String name = "Ikpa Udo", accountType = "Savings";
    private int password = 1234;
    private double accountBalance = 2500.00;

    Person() {
        //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() {
        return name;
    }

    public String getAccountType() {
        return accountType;
    }

    public int getPassword() {
        return password;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    /*public void setName(String name) {
        this.name = name;
    }
    */

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Person(String name, String accountType, int password, double accountBalance) {
        this.name = name;
        this.accountType = accountType;
        this.password = password;
        this.accountBalance = accountBalance;
    }
    
    
}
