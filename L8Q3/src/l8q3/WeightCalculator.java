/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l8q3;

import java.util.Scanner;

/**
 *
 * @author wif190007
 */
public class WeightCalculator {
    private int age;
    private double height;
    private double weight;
    private Scanner s = new Scanner(System.in);

    public WeightCalculator() {
        age = s.nextInt();
        height = s.nextDouble();
        
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public double recWeight(){
        weight =  (height - 100 + age / 10.0) * 0.9;
        return weight;
    }
    
    public String toString() {
        return "Age: " + age + "\n"+ "Height:" + height + "\n"+  "Recommended Weight: " + weight ;
    }
    
    
}
