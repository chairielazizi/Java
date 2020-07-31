/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calenderinjava;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class CalenderInJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendar a = Calendar.getInstance();
        Scanner s= new Scanner(System.in);
        System.out.print("Enter year : ");
        int y = s.nextInt();
        a.set(Calendar.YEAR,y);
        a.set(Calendar.DAY_OF_YEAR,1);
        Date b = a.getTime();
        System.out.println("First day of the year :"+b.getDay());
   }
    
}
