/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l7q6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class L7Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String productid[]=new String[7];
        String productname[]=new String[7];
        double productprice[]=new double[10];
        int orderquantity[]=new int[7];
        String productorder[]=new String[7];
        double totalprice[]=new double[10];
        
        try{
            PrintWriter p = new PrintWriter(new FileOutputStream("merge.txt"));
            Scanner product = new Scanner(new FileInputStream("product.txt"));
            Scanner order = new Scanner(new FileInputStream("order.txt"));
            
            int i=0;
            String input1;
            String part1[];
            while(product.hasNextLine()){
                input1 = product.nextLine();
                part1 = input1.split(",");
                productid[i]=part1[0];
                productname[i]=part1[1];
                productprice[i]= Double.parseDouble(part1[2]);
                i++;
            }
            
            int j=0;
            String input2;
            String part2[];
            while(order.hasNextLine()){
                input2 = order.nextLine();
                part2 = input2.split(",");
                productorder[j]=part2[1];
                orderquantity[j]=Integer.parseInt(part2[2]);
                j++;
            }
            System.out.println("ProductID      ProductName      Quantity        PricePerUnit        Total");
            
            for(int a=0;a<productorder.length;a++){
                for(int b=0;b<productid.length;b++){
                    if(productid[b].equals(productorder[a])){
                        System.out.printf("%-6s %20s %10d %17.2f %15.2f",productorder[a],productname[b],orderquantity[a],productprice[b],productprice[b]*orderquantity[a]);
                        System.out.println();
                        //System.out.printf("%40s\n",productname[b]);
                    }
                }
            }
            
            p.close();
            product.close();
            order.close();
        }catch(FileNotFoundException e){
            System.out.println("File was not found");
        }catch(IOException e){
            System.out.println("Problem with file output");
        }
    }
    
}
