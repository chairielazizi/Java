/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l8q4;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Fraction {
    private int numerator;
    private int denominator;
    private Scanner s = new Scanner(System.in);

    public Fraction() {
        numerator = s.nextInt();
        denominator = s.nextInt();
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    
    public int lowestterm(int a,int b){
        if(a % b == 0){
            return b;
        }
        else
            return lowestterm(b,a%b);
    }

    @Override
    public String toString() {
        return "Numerator= " + numerator + "\n"+"Denominator= " + denominator + "\n" +"Lowest Term Fraction: " + lowestterm(numerator,denominator);
    }
    
    
}
