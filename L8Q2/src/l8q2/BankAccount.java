/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l8q2;

/**
 *
 * @author wif190007
 */
public class BankAccount {
    private String name;
    private String ic;
    private String passport;
    private double deposit;
    private double balance;

    public BankAccount(String name, String ic, String passport, double deposit) {
        this.name = name;
        this.ic = ic;
        this.passport = passport;
        this.deposit = deposit;
    }

    public String getName() {
        return name;
    }

    public String getIc() {
        return ic;
    }

    public String getPassport() {
        return passport;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }
    
    public double Deposit(double n){
        
        balance = deposit + n;
        return balance;
    }
    
    public double Withdraw(double n){
        
        balance = deposit - n;
        return balance;
    }

    
    public String toString() {
        return "Name: " + name + "\n"+ "IC:" + ic + "\n"+ "Passport Number: " + 
                passport + "\n" + "Deposit: " + deposit + "\n" + "Balance: " + balance ;
    }
    
    
}
