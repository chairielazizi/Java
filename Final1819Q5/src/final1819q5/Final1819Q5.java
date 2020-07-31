/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final1819q5;

/**
 *
 * @author user
 */
public class Final1819Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Delivery a = new Delivery("Ali","Ahmad",4.4);
        System.out.println(a.toString());
        System.out.println();
        
        Delivery b = new Delivery("Ah Chong","Fatimah",63.1);
        System.out.println(b.toString());
        System.out.println();
        
        SpecialDelivery c = new SpecialDelivery("FSKTM","FK, UM",32.5,true,false);
        System.out.println(c.toString());
        System.out.println();
        
        SpecialDelivery d = new SpecialDelivery("Ang","Liew",19.0,true,true);
        System.out.println(d.toString());
        System.out.println();
        
        double sum=a.totalCost()+b.totalCost()+c.totalCost()+d.totalCost();
        System.out.println("The total shipping cost is RM"+sum);
        
    }
    
}
