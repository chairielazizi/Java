package dsl1q2;

import java.util.Scanner;

public class Polynomial {
    private double degree;
    private double[] coef;

    public Polynomial(double degree, double[] coef) {
        this.degree = degree;
        this.coef = coef;
    } 
    public double xvalue(double x){
        //double y=0;
        double y = coef[0];
        for(int i=0;i<this.degree;i++){
            //y= this.coef[i] * Math.pow(x, degree - i);
            y = y * x + coef[i + 1];
        }
        return y;
//        Scanner s = new Scanner(System.in);
//        double x = s.nextDouble();
//        return x;
    }
    
//    public double calc(){
//        double x=0;
//        double result = coef[0];
//        for(int i=1;i<degree;i++){
//            result = result * x + coef[i];
//        }
//        return result;
//          double result=0;
//          for(double i=degree;i>0;i--){
//              result = coef[i]* Math.pow(x, coef-i);
//        
//          }
//    }

    
    public String toString() {
        String display="";
        for(int i=0;i<this.coef.length;i++){
            //display+=String.format("%.dx^d + ",this.coef[i],degree-i);
            display += coef[i];
            display += "x^";
            display += (degree - i);
            display += " + ";
        }
        return display;
         
    }
    
    
}
