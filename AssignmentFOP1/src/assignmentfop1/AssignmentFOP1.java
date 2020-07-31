/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentfop1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class AssignmentFOP1 {

    /**
     * @param args the command line arguments
     */
    public static void main (String[]args) 
            throws FileNotFoundException{
    Random r=new Random();
    Scanner s=new Scanner(System.in);
    String sym;
    int min, max,count;
    String des;
   int l=2,h=4,n1,n2;
    
   int[][]check=new int[20][20];
   String [][] symbol = new String[20][20];
   
   for(int i=0;i<20;i++){
    for(int j=0;j<20;j++){
         symbol[i][j]="     |";    
     }
 }
            try {
                  PrintWriter p = new PrintWriter(new FileOutputStream("Symbols.txt"));
   System.out.println("Enter Symbol, Minimum Block, Maximum Block and Description(Enter Z to end):");
      do {
               sym = s.next();
               if(sym.equals("Z"))
                   break;
                min = s.nextInt();
                max = s.nextInt();
                des = s.next();
                p.print(sym + " ");
                p.print(min + " ");
                p.print(max + " ");
                p.println(des + " ");
                
                
        } while (!sym.equals("Z"));
                p.close();
            }catch(IOException e){
                System.out.println("File not found");
            }
   
   try{
Scanner sc=new Scanner(new FileInputStream("Symbols.txt"));
    while(sc.hasNextLine()) {
             String line=sc.nextLine();
             String[]temp=line.split(" ");
             sym=temp[0];
             min=((int)Integer.parseInt(temp[1],10));
             max=((int)Integer.parseInt(temp[2],10));
             des=temp[3];
             int can,end=1;
                while(end==1){
                can=1;
                n1 = r.nextInt(21-h);
                n2 = r.nextInt(21-l);
               for(int c=n1;c<n1+h;c++){
                    for(int d=n2;d<n2+l;d++){
                       if(check[c][d]==1/*||check[c-1][d-1]==1*/){
                           can=0;
                       }
                    }
               }
                       if(can==1){
                           for(int c=n1;c<n1+h;c++){
                    for(int d=n2;d<n2+l;d++){
                        symbol[c][d]="  "+sym+"  |";                      
                        check[c][d]=1;  
                        end=0;
                        }
                    }
                  }
                                       
 }
       
    }//while
    sc.close();
   for(int i=0;i<20;i++){
         System.out.print("|");
    for(int j=0;j<20;j++){
         System.out.print(symbol[i][j]);
    }
         System.out.println("");
     }
             
    
   }catch(FileNotFoundException e){
       System.out.println("File not found.");
   }
    
}
}
