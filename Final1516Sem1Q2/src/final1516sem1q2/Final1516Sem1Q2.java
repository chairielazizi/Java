/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final1516sem1q2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Final1516Sem1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int player=0,comp=0;
        //int sign1=0,sign2=0;
        int playercount=0,compcount=0;
        while(true){
            
            System.out.print("Enter 1.Paper 2.Scissor 3.Rock: ");
            player=s.nextInt();
            comp=r.nextInt(3)+1;
            if(player==1 && comp==1){
                System.out.println("Player: Paper ----- Computer : Paper");
                continue;
            }
            else if(player==1 && comp==2){
                System.out.println("Player: Paper ----- Computer : Scissor");
                compcount++;
                System.out.printf("Computer win %d time(s)\n",compcount);
            }
            else if(player==1 && comp==3){
                System.out.println("Player: Paper ----- Computer : Rock");
                playercount++;
                System.out.printf("Player win %d time(s)\n",playercount);
            }
            else if(player==2 && comp==2){
                System.out.println("Player: Scissor ----- Computer : Scissor");
                continue;
            }
            else if(player==2 && comp==1){
                System.out.println("Player: Scissor ----- Computer : Paper");
                playercount++;
                System.out.printf("Player win %d time(s)\n",playercount);
            }
            else if(player==2 && comp==3){
                System.out.println("Player: Scissor ----- Computer : Rock");
                compcount++;
                System.out.printf("Computer win %d time(s)\n",compcount);
            }
            else if(player==3 && comp==3){
                System.out.println("Player: Rock ----- Computer : Rock");
                continue;
            }
            else if(player==3 && comp==1){
                System.out.println("Player: Rock ----- Computer : Paper");
                compcount++;
                System.out.printf("Computer win %d time(s)\n",compcount);
            }
            else if(player==3 && comp==2){
                System.out.println("Player: Rock ----- Computer : Scissor");
                playercount++;
                System.out.printf("Player win %d time(s)\n",playercount);
            }
            
            if(playercount==3 || compcount==3){
                if(playercount==3){
                    System.out.println("Player wins the game.");
                }
                else{
                    System.out.println("Computer wins the game.");
                }
                break;
            }
        }
    }
    
}
