/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final1819q2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Final1819Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
       
        System.out.print("Enter N: ");
        int n=s.nextInt();
        
        int matrixone[][] = new int[n][n];
        int matrixtwo[][] = new int[n][n];
        int sum[][] = new int[n][n];
        int multi[][] = new int[n][n];
        
        
        /*
        for(int i=0;i<n;i++){
            generate(matrix);
            if(i==0){
                System.out.println("Matrix A");
                display(matrix);
            }
            else if(i==1){
                System.out.println("Matrix B");
                display(matrix);
            }
        }
        System.out.println("Matrix A+B");
        add(matrix);
        */
        
        generate(matrixone);
        generate(matrixtwo);
        
        System.out.println("Matrix A");
        display(matrixone);
        
        System.out.println("Matrix B");
        display(matrixtwo);
        
        System.out.println("Matrix A + B");
        sum=add(matrixone,matrixtwo);
        display(sum);
        
        System.out.println("Matrix A X B");
        multi=multi(matrixone,matrixtwo);
        display(multi);
    }
    
    public static int[][] generate(int a[][]){
        Random r = new Random();
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]=r.nextInt(10);
                //System.out.print(a[i][j]+"\t");
            }
            //System.out.println();
        }
        return a;
    }
    public static void display(int a[][]){
        Random r = new Random();
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                //a[i][j]=r.nextInt(10);
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static int[][] add(int a[][],int b[][]){
        int sum[][]=new int[a.length][a.length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                //a[i][j]=r.nextInt(10);
                sum[i][j]= a[i][j]+b[i][j];
                //System.out.print(sum[i][j]+"\t");
            }
            //System.out.println();
        }
        return sum;
    }
    public static int[][] multi(int a[][],int b[][]){
        int multi[][]=new int[a.length][a.length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                //a[i][j]=r.nextInt(10);
                //multi[i][j]= a[i][j]*b[i][j] + a[i][j+1]*b[i];
                //System.out.print(sum[i][j]+"\t");
                multi[i][j]=0;
                //int sum = 0;
                for(int k=0;k<b.length;k++){
                    multi[i][j]+=a[i][k]+b[k][j];
                    //multi[i][j]=sum;
                }
                
            }
           
        }
        return multi;
    }
    
    
    
}
