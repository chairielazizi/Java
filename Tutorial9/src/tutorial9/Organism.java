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
public class Organism {
    protected int initialSize;
    protected double growthRate;

    public Organism(int initialSize, double growthRate) {
        this.initialSize = initialSize;
        this.growthRate = growthRate;
    }

    public int getInitialSize() {
        return initialSize;
    }

    public double getGrowthRate() {
        return growthRate;
    }

    public void setInitialSize(int initialSize) {
        this.initialSize = initialSize;
    }

    public void setGrowthRate(double growthRate) {
        this.growthRate = growthRate;
    }

    public String toString() {
        return "Initial Size: " + initialSize + "\n" + "Growth Rate: " + growthRate + "\n";
    }
    
    
    
}

