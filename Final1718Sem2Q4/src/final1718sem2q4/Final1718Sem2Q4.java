/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final1718sem2q4;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Final1718Sem2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[]in=new int[6];
        //int a,b,c,d,e,f;
        System.out.println("Enter the values for a,b,c,d,e and f:");
        /*
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        d=s.nextInt();
        e=s.nextInt();
        f=s.nextInt();
        */
        for(int i=0;i<in.length;i++){
            in[i]=s.nextInt();
        }
        LinearEquation equation = new LinearEquation(in[0],in[1],in[2],in[3],in[4],in[5]);
        System.out.println(equation.toString());
    }
    
}
