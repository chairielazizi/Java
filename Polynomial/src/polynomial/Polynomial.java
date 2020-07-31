/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polynomial;

/**
 *
 * @author user
 */
public class Polynomial {
    private int degree;
    private int[] coef;
    
    public Polynomial(){
        degree = 0;
    }
    
    public Polynomial(int[] coef) {
        //this.degree = degree;
        this.coef = coef;
    }

    public double getDegree() {
        return degree;
    }

    public int[] getCoefficient() {
        return coef;
    }
    
    public String toString() {
        String display="";
        degree = coef.length-1;
        for(int i=0;i<this.coef.length;i++){
            //display+=String.format("%.dx^d + ",this.coef[i],degree-i);
            if(coef[i]!=0){
                display += coef[i];
                display += "x^";
                display += (degree - i);
                display += " + ";
            }
            
        }
        return display;
         
    }
    
    public double getValue(double x){
        
        double y = coef[0];
        for(int i=0;i<this.degree;i++){
            //y= coef[i] * Math.pow(x, degree - i);
            y = y * x + coef[i + 1];
        //y += 0;
        }
        return y;
    }
    
    public void add(Polynomial p1,Polynomial p2){
        
        if(p1.getCoefficient().length>p2.getCoefficient().length){
          for(int i=0,j=p1.getCoefficient().length-1;i<p1.getCoefficient().length;i++,j--){
               
              System.out.print(p1.getCoefficient()[i]+"X^"+j);
               if(i==p2.getCoefficient().length){
                   
                   for(int k=0,l=p2.getCoefficient().length-1;k<p2.getCoefficient().length;k++,l--){
                       
                       System.out.print(p2.getCoefficient()[k]+" X^ "+l);  
                   }
               }
            }
        }
    }
    
    
    public static void main(String[] args) {
        int x =2;
        int[] co1 = {5,0,-3,8,-4};
        int[] co2 = {-2,-4,0,5};
        Polynomial p1 = new Polynomial(co1);
        System.out.println(p1.toString());
        
        Polynomial p2 = new Polynomial(co2);
        System.out.println(p2.toString());
        
        Polynomial p3 = new Polynomial();
        
        System.out.println(p1.getValue(x));
        System.out.println(p2.getValue(x));
        //System.out.println(p2.getValue((p1.getValue(x)+p2.getValue(x))));
        
    }
    
}
