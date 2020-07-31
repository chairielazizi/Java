/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x,y;
        char ass = s.next().charAt(0);
        String move;
        System.out.println("Enter coordinate X and Y: ");
        x = s.nextInt();
        y = s.nextInt();
        s.nextLine();
        System.out.println("Enter the move: ");
        move = s.nextLine();
        System.out.println("Initial coordinate: ("+ x + ","+ y + ")");
        for(int i=0;i<move.length();i++){
            if(move.charAt(i)=='R'){
                x++;
            }
            else if(move.charAt(i)=='L'){
                x--;
            }
            else if(move.charAt(i)=='U'){
                y++;
            }
            else if(move.charAt(i)=='D'){
                y--;
            }
        }
        System.out.println("Final coordinate: ("+ x + ","+ y + ")");
        /*
        System.out.println("Enter the diameter of the circle: ");
        Scanner sc = new Scanner(System.in);
        double d;
        d = sc.nextDouble();
        System.out.printf("The circumference of the circle is %.2f\n",Math.PI*d);
        
        System.out.println("Enter the length in inches: ");
        
        double inch,cm;
        
        inch = sc.nextDouble();
        cm = inch * 2.54;
        System.out.printf("The length in metres is %.2f\n",cm/100);
        
        int x,y,z;
        System.out.println("Enter the value for x,y and z:");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        
        if(x>y && x>z)
            System.out.println(x +" is the biggest number");
        else if(y>x && y>z)
            System.out.println(y +" is the biggest number");
        else if(z>x && z>y)
            System.out.println(z +" is the biggest number");
        else if(x==y|| x==z|| y==z)
            System.out.println("There some numbers that are equal");
        else
            System.out.println("Invalid numbers");
        
        int leapYear;
        System.out.println("Enter the year:");
         leapYear = sc.nextInt();
         if(leapYear%4==0 || leapYear%400==0 ){
             if(leapYear%100 != 0)
                 System.out.println("This is a leap year");
             else
                 System.out.println("This is not a leap year");
         }
         else
             System.out.println("This is a not a leap year");*/
        
        /*int n=1,square;
        while(n<+12){
            square = n*n;
            n++;
            System.out.println(square);*/
            
        /*int [][] a = new int[4][5];
        int r,c;
        Random s = new Random();
        for(r=1;r<=4;r++){
            for(c=1;c<=5;c++){
                a = s.nextInt(101);
                System.out.print(a);
            }
            System.out.println("");
        }
                   
        }
        int n,max,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the max number: ");
        max = sc.nextInt();
        for(n=1;n<=max;n++){
            sum+=n;
            
        }
        System.out.println(max);
        */
        /*
        String[] student=new String[5];
        for(int i=0;i<student.length;i++){
            System.out.println("Enter name:");
            student[i]=sc.nextLine();
    }
*/
    
}
}
