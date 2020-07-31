/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final1819q4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Final1819Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String sentence[]=new String[100];
        String word[]=new String[100];
        int countsentence=0;
        int countword=0;
        //int countchar=0;
        int countchar[]=new int[256];
        try{
            Scanner s = new Scanner(new FileInputStream("myAmbition.txt"));
            String input ="";
            while(s.hasNextLine()){
                input=s.nextLine();
                //System.out.println(input+" ");
                //sentence=input.split(" ");
                
                sentence=input.split("(?<=\\.\\s)|(?<=[?!]\\s)");
                //System.out.println(input+" ");
                for(String a : sentence){
                    System.out.println(a+" ");
                }
                
                String sentencelist[]=input.split("[.]+");
                countsentence=sentencelist.length;
                System.out.println("Number of sentence : "+countsentence);
                
                String wordlist[]=input.split(" ");
                countword=wordlist.length;
                System.out.println("Number of words : "+countword);
                
                for(int i=0;i<countchar.length;i++){
                    countchar[input.charAt(i)]++;
                }
                char ch[]=new char[input.length()];
                for(int i=0;i<countchar.length;i++){
                    ch[i]=input.charAt(i);
                    int find=0;
                    for(int j=0;j<=i;j++){
                        if(input.charAt(i)==ch[j]){
                            find++;
                        }
                    }
                    if(find==1){
                        System.out.println(input.charAt(i)+":"+countchar[input.charAt(i)]);
                    }
                }   
            
            }
        }catch(FileNotFoundException e){
            System.out.println("File was not found");
        }
        
        String a ="My name is Chairiel";
        String[]b=new String[10];
        b=a.split(" ");
        for(String c:b){
            System.out.println(c);
        }
    }
    
}
