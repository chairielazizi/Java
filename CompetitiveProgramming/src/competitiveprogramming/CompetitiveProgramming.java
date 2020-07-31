/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitiveprogramming;

/**
 *
 * @author user
 */
import java.io.*;
import java.io.BufferedReader;
import java.util.*;

public class CompetitiveProgramming {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        //System.out.println("Hello World!");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        /*
        int n = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        */
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        
        for(int i=1;i<n;i++){
            if(n%x==0 && n%y==0){
                System.out.println("FizzBuzz");
            }
            else if(n%x==0)
                System.out.println("Fizz");
            else if(n%y==0)
                System.out.println("Buzz");
        }
        
    }
    
}
