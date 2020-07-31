/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l4q5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class L4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int p1=0,p2=0;
        int turn = r.nextInt(2);
        int score;
        
        while(true){
            score = 1 + r.nextInt(6);
            if(turn%2==0){
                p1+=score;
                System.out.println("Player 1: "+score +" Total: "+ p1);
                while(score==6){
                    score = 1 +r.nextInt(6);
                    p1+=score;
                    System.out.println("Player 1: "+score +" Total: "+ p1);
                }
            }
            else{
                p2+=score;
                System.out.println("Player 2: "+score + " Total: "+ p2);
                while(score==6){
                    score = 1 +r.nextInt(6);
                    p2+=score;
                    System.out.println("Player 2: "+score +" Total: "+ p2);
                }
            }
            if(p1>100 || p2>100){
                break;
            }
            turn++;
        }
        if(p1>100){
            System.out.println("");
            System.out.println("Player 1 wins");
        }
        else if(p2>100){
            System.out.println("");
            System.out.println("Player 2 wins");
        }
    }
    
}
