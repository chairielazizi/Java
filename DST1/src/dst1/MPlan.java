/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dst1;

/**
 *
 * @author user
 */
public class MPlan extends ISP {
    private double price;

    public MPlan(int name, int gb) {
        super(name, gb);
        this.price = price;
    }
    
    public double plan(){
       price = 5*super.name + 0.8*super.gb;
       
       return price;
    }
    
    public String toString() {
        return "Plan: MPlanwith price RM: " + plan();
    }
}
