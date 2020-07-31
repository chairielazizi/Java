/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5q4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author wif190007
 */
public class Lab5Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int[][] matrix = new int[3][3];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]= r.nextInt(101);
            }
        }
        System.out.println("Original matrix:");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("After rotate 90 degrees clockwise:");
        for(int i=0;i<matrix.length;i++){
            for(int j=2;j>=0;j--){
                System.out.print(matrix[j][i]+"\t");
            }
            System.out.println();
        }
        
    }
    
}
