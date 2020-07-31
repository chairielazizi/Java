/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3fop;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Lab3fop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Question 1
        System.out.println("Enter two integer number: ");
        int x,y;
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        y = s.nextInt();
        System.out.println("Enter the operand: ");
        
        char operand;
        operand = s.next().charAt(0);
        if(operand=='+'){
            int sum = x + y;
            System.out.println("The sum is " + sum);
        }
        else if (operand=='-'){
            int dif = x - y;
            System.out.println("The difference is " + dif);
        }
        else if (operand=='*'){
            int  multi = x * y;
            System.out.println("The product is " + multi);
        }
        else if (operand=='/'){
            int div = x / y;
            System.out.println("The division is " + div);
        }
        else
            System.out.println("Invalid operand!!");
        
        //Question 2
        Random r = new Random();
        int n;
        n = r.nextInt(6);
        
        if(n==0)
            System.out.println(n +" is zero");
        else if(n==1)
            System.out.println(n +" is one");
        else if(n==2)
            System.out.println(n +" is two");
        else if(n==3)
            System.out.println(n +" is three");
        else if(n==4)
            System.out.println(n +" is four");
        else if(n==5)
            System.out.println(n +" is five");
        
        //Question 3
        double sale,c;
        System.out.println("Enter the sales volume: ");
        sale = s.nextDouble();
        if(sale<=100){
            c = sale * (5.0/100);
            System.out.printf("The commission is %.2f\n",c);
        }
        else if(sale>100 && sale <=500){
            c = sale * (7.5/100);
            System.out.printf("The commission is %.2f\n",c);
        }
        else if(sale>500 && sale<=1000){
            c = sale *(10.0/100);
            System.out.printf("The commission is %.2f\n",c);
        }
        else if(sale>1000){
            c = sale * (12.5/100);
            System.out.printf("The commission is %.2f\n",c);
        }
        
        //Question 4
        
        //Question 5
        int a,b,c1,d,e,f,k,l;
        System.out.println("Enter the value for a,b,c,d,e and f:");
        a = s.nextInt();
        b = s.nextInt();
        c1 = s.nextInt();
        d = s.nextInt();
        e = s.nextInt();
        f = s.nextInt();
        
        int determinant = (a*d)-(b*c1);
        
        
        if(determinant==0)
            System.out.println("The equation has no solution");
        else{
            k = (e*d - b-c1)/determinant;
            l = (a*f - e*c1)/determinant;
            System.out.println("The value of x is " + x);
            System.out.println("The value of y is " + y);
        }
        
        //Question 6
        System.out.println("Enter the radius of the circle: ");
        double radius = s.nextDouble();
        System.out.println("Enter the coordinate: ");
        int x1,y1;
        x1 = s.nextInt();
        y1 = s.nextInt();
        
        if(x1>radius && y1>radius)
            System.out.println("The coordinate is outside of the circle");
        else
            System.out.println("The coordinate is inside the circle");
        
    }
    
}
