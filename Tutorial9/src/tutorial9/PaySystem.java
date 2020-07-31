/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial9;

/**
 *
 * @author user
 */
public class PaySystem {
    protected double payrateperhour;
    protected int hour;

    public PaySystem(double payrateperhour, int hour) {
        this.payrateperhour = payrateperhour;
        this.hour = hour;
    }

    public double getPayrateperhour() {
        return payrateperhour;
    }

    public int getHour() {
        return hour;
    }

    public void setPayrateperhour(double payrateperhour) {
        this.payrateperhour = payrateperhour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
    
    public double totalPayment(){
        double total;
        total = payrateperhour * hour;
        return total;
    }
    
    public double display(){
        System.out.println("The total payment: " + totalPayment());
        return totalPayment();
    }

    @Override
    public String toString() {
        return "Payrate per hour: " + payrateperhour + "\n" + "Hours: " + hour + "\n" + "Total Payment: " + display();
    }
    
    
}
