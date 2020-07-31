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
public class Animal extends Organism{
    private int eatAmount;

    public Animal(int eatAmount, int initialSize, double growthRate) {
        super(initialSize, growthRate);
        this.eatAmount = eatAmount;
    }

    public int getEatAmount() {
        return eatAmount;
    }

    public void setEatAmount(int eatAmount) {
        this.eatAmount = eatAmount;
    }

    public int getInitialSize() {
        return initialSize;
    }

    public double getGrowthRate() {
        return growthRate;
    }
    
    public String toString() {
        return "Eat Amount: " + eatAmount + "\n" + super.toString();
    }
}
