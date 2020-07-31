/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final1617q2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Final1617Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of teams: ");
        int n = s.nextInt();
        String num[][]= new String[n][2];
        
        for(int i=0;i<num.length;i++){
            System.out.printf("Enter team %d name: ",i+1);
            num[i][0]=s.next();
            System.out.printf("Enter team %d score: ",i+1);
            num[i][1]=s.next();
        }
        System.out.println("List of team with the highest team score first");
        
        int score[] = new int[n];
        for(int i=0;i<num.length;i++){
            score[i]=Integer.parseInt(num[i][1]);
        }
        
        for(int pass=1;pass<num.length;pass++){
            for(int i=0;i<num.length-1;i++){
                if(score[i+1] > score[i]){
                    int temp = score[i+1];
                    score[i+1]=score[i];
                    score[i]=temp;
                }
            }
        }
        for(int i=0;i<num.length;i++){
            System.out.print(num[i][0]+" ("+score[i]+") | ");
        }
    }
    
}
