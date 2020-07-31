/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class DrBadrul_Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        System.out.println("Enter the number of player[2-4]: ");
        
        int p1=0,p2=0,p3=0,p4=0;
        int score;
        int player = s.nextInt();
        switch(player){
            case 2:
                while(true){
                    score = -10 + r.nextInt(21);
                    p1+=score;
                    System.out.println("Player 1: "+score);
                    score = -10 + r.nextInt(21);
                    p2+=score;
                    System.out.println("Player 2: "+score);
                    
                    if(p1>50 || p2>50){
                        break;
                    }
                }
                if(p1>50)
                    System.out.println("\nPlayer 1 Wins!!!");
                else if(p2>50)
                    System.out.println("\nPlayer 2 Wins!!!");
                break;
            case 3:
                while(true){
                    score = -10 + r.nextInt(21);
                    p1+=score;
                    System.out.println("Player 1: "+score);
                    score = -10 + r.nextInt(21);
                    p2+=score;
                    System.out.println("Player 2: "+score);
                    score = -10 + r.nextInt(21);
                    p3+=score;
                    System.out.println("Player 3: "+score);
                    
                    if(p1>50 || p2>50 || p3>50){
                        break;
                    }
                }
                if(p1>50)
                    System.out.println("\nPlayer 1 Wins!!!");
                else if(p2>50)
                    System.out.println("\nPlayer 2 Wins!!!");
                else if(p3>50)
                    System.out.println("\nPlayer 3 Wins!!!");
                break;
            case 4:
                while(true){
                    score = -10 + r.nextInt(21);
                    p1+=score;
                    System.out.println("Player 1: "+score);
                    score = -10 + r.nextInt(21);
                    p2+=score;
                    System.out.println("Player 2: "+score);
                    score = -10 + r.nextInt(21);
                    p3+=score;
                    System.out.println("Player 3: "+score);
                    score = -10 + r.nextInt(21);
                    p4+=score;
                    System.out.println("Player 4: "+score);
                    
                    if(p1>50 || p2>50 || p3>50 || p4>50){
                        break;
                    }
                }
                if(p1>50)
                    System.out.println("\nPlayer 1 Wins!!!");
                else if(p2>50)
                    System.out.println("\nPlayer 2 Wins!!!");
                else if(p3>50)
                    System.out.println("\nPlayer 3 Wins!!!");
                else if(p4>50){
                    System.out.println("\nPlayer 4 Wins!!!");
                    System.out.println("Player 1:"+p1);
                    System.out.println("Player 2:"+p2);
                    System.out.println("Player 3:"+p3);
                    System.out.println("Player 4:"+p4);
                }   
                break;
            default:
                System.out.println("Invalid player");
        }
        
    }
    
}
