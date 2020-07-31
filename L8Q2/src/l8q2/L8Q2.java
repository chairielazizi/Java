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
public class L8Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BankAccount a = new BankAccount("Amar Aiman","000916064242","7543449",505.70);
        //a.setDeposit(0);
        a.Deposit(200);
        System.out.println(a.toString());;
    }
    
}
