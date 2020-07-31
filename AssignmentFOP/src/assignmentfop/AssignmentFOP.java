/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentfop;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class AssignmentFOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        /*
        int [][] map = new int[20][20];
        int n1 = s.nextInt();
        int [][]airport=new int[n1][n1];
        
        for(int i=0;i<airport.length;i++){
            for(int j=0;j<airport.length;j++){
                System.out.print('A');
            }
            System.out.println();
        }
        */
        int [][] map = new int[20][20];
        String [][] symbol = new String[20][20];
        
        int n1 = r.nextInt(16);
        int n2 = r.nextInt(16);
        int n3 = r.nextInt(20);
        int n4 = r.nextInt(20);
        
        //int min1 = s.nextInt();
        //int max1 = s.nextInt();
        /*
        for(int i=0;i<20;i++){
            for(int j=0;j<20;j++){
                
                for(int a=n1;a<n1+5;a++){
                    for(int b=n2;b<n2+5;b++){
                        symbol[a][b]="A";
                    }
                }
                System.out.print(" " + symbol[i][j]);
                
                for(int c=n3;c<n3+5;c++){
                    for(int d=n4;d<n4+5;d++){
                        symbol[c][d]="H";
                    }
                }
                System.out.print(" " + symbol[i][j]);
                
                /*
                for(int e=n5;e<n5+5;e++){
                    for(int f=n6;f<n6+5;f++){
                        if(e<20 && f<20){
                            symbol[e][f]='S';
                        }
                        else
                            continue;
                    }
                }
                System.out.print(" " + symbol[i][j]);
                
            }
            System.out.println();
        }*/
        int[][]check=new int[20][20];
        //String [][] symbol = new String[20][20];
        int l=5; 
        for(int i=0;i<20;i++){
            for(int j=0;j<20;j++){
                symbol[i][j]="     |";    
            }
        }
        //int n1 = r.nextInt(21-l);
        //int n2 = r.nextInt(21-l);
        
        for(int c=n1;c<n1+l;c++){
            for(int d=n2;d<n2+l;d++){
                symbol[c][d]="  H  |";
                check[c][d]=1;                       
            }
        }//H
        int can=1,end=1;
        while(end==1){
            can=1;
            n1 = r.nextInt(21-l);
            n2 = r.nextInt(21-l);
           for(int c=n1;c<n1+l;c++){
                for(int d=n2;d<n2+l;d++){
                   if(check[c][d]==1){
                       can=0;
                    }
                }
            }
            if(can==1){
                for(int c=n1;c<n1+l;c++){
                    for(int d=n2;d<n2+l;d++){
                    symbol[c][d]="  C  |";                      
                    check[c][d]=1;  
                    end=0;
                    }
                }
            }
        }                            
        for(int i=0;i<20;i++){
            System.out.print("|");
                for(int j=0;j<20;j++){
                     System.out.print(symbol[i][j]);
                }
                System.out.println("");
        }
    }
    
}
