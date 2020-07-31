/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t7q3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author wif190007
 */
public class T7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //T7Q3
        String str = "Sample Sentence";
        byte[] a = str.getBytes();
        try{
            PrintWriter p = new PrintWriter(new FileOutputStream("data.txt"));
            for(int i=0;i<a.length;i++){
                /*
                int temp = a[i];
                for(int j=0;j<8;j++){
                    if((temp&128)==0){
                        p.print(0);
                    }
                    else {
                        p.print(1);
                    }
                    temp = temp<<1;
                }
                //p.print(" ");
                */
                p.printf("%08d",Integer.parseInt(Integer.toBinaryString(a[i])));
            }
            p.close();
        }catch(IOException e){
            System.out.println("Problem with file output");
        }
        try{
            Scanner s = new Scanner(new FileInputStream("data.txt"));
            String str1 = s.nextLine();
            for(int i =0;i<str1.length();i+=8){
                String temp1 = str1.substring(i,i+8);
                System.out.print((char) Integer.parseInt(temp1, 2));
            }
            System.out.println();
            s.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        String c = "123,56,38,789";
        String[] d = c.split(",");
        int sum = 0;
        for(int i=0;i<d.length;i++){
            int num = Integer.parseInt(d[i]);
            sum+=num;
        }
        System.out.println("Total is " + sum);
        
        
    }
    
}
