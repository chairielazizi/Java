/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl6q4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author chairiel
 */
public class DSL6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<Integer> QShare = new Queue<>();
        Queue<Integer> QSharePrice = new Queue<>();
        
        try{
            Scanner s = new Scanner(new FileInputStream(new File("lab6q4.txt")));
            String input="";
            int shareSelling=0;
            int sellingprice=0;
            String[] array;
            
            while(s.hasNextLine()){
                input = s.nextLine();
                //System.out.println(input);
                array = input.split(" ");
                
                System.out.print("DAY "+array[0]+" : ");
                if("B".equals(array[1])){
                    System.out.print(" Buy "+array[2]+" shares at RM"+array[3]);
                    QShare.enqueue(Integer.valueOf(array[2]));
                    QSharePrice.enqueue(Integer.valueOf(array[3]));
                    System.out.println();
                }
                else{
                    System.out.print(" Sell "+array[2]+" shares at RM"+array[3]);
                    shareSelling = Integer.valueOf(array[2]);
                    sellingprice = Integer.valueOf(array[3]);
                    System.out.println();
                }
            }
            
            int price,share,total=0;
            while(!QShare.isEmpty()){
                price = QSharePrice.dequeue();
                share = QShare.dequeue();
                if(shareSelling > share){
                    shareSelling = shareSelling - share;
                    total += share * (sellingprice - price);
                }
                else{
                    total += shareSelling * (sellingprice - price);
                }
            }
            System.out.println("The total gain is "+total);
            
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
    
}
