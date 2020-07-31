/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l4q4;

/**
 *
 * @author user
 */
public class L4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int year=2019;
        int J,M,A;//J=january,M=may,A=august
        
        //first day january 2019 is Tuesday
        J=2;
        if((year%4==0 && year%100!=0)||year%400==0){
            M = (J+2)%7;
            A = (J+3)%7;
        }
        else{
            //not leap year
            M = (J+1)%7;
            A = (J+2)%7;
        }
        //print calendar
        System.out.println("    Su  M  Tu  W  Th  F  Sa");
        
        //print space
        for(int i=0;i<M;i++){
            System.out.printf("%4s","");
        }
        
        //print day May 1-31
        for(int i=1;i<=31;i++){
            System.out.printf("%4d",i);
            //how to know it is Saturday
            //because Saturday we need to print new line
            M++;
            M=M%7;
            if(M==0){
                System.out.println("");
            }
        }
    }
    
}
