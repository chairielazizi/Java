/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viva2q2;

import java.util.Scanner;

/**
 *
 * @author wif190007
 */
public class Viva2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String shape;
        int r,h,l;
        System.out.println("Circle or rectangle?");
        shape = s.nextLine();
        
        if(shape.equalsIgnoreCase("circle")){
            System.out.println("Enter the radius of the circle: ");
            r = s.nextInt();
            for(int i=0;i<r;i++){
                multiPrint(r - i - 1,' ');
                multiPrint(i * 2 + 2,'*');
                System.out.println();
            }
            for(int j=0;j<r;j++){
                multiPrint(j,' ');
                multiPrint(r*2 - j*2 - 0,'*');
                System.out.println();
                //multiPrint(r - j - 1,'0');
                // multiPrint(j * 2 + 2,'*');
                // System.out.println();
            }
        }
        if(shape.equalsIgnoreCase("rectangle")){
            System.out.print("Enter the length of the rectangle: ");
            l = s.nextInt();
            System.out.print("Enter the height of the rectangle: ");
            h = s.nextInt();
            for(int i=0;i<h;i++){
                multiPrint(l,'*');
                System.out.println();
            }
        }
    }
    public static void multiPrint(int n,char c){
        for(int i=0;i<n;i++){
            System.out.print(c);
        }
    }
}
