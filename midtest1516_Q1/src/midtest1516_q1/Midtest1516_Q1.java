/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtest1516_q1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Midtest1516_Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x,y;
        String move;
        System.out.println("Enter the coordinates for X and Y: ");
        x = s.nextInt();
        y = s.nextInt();
        System.out.println("Enter the move: ");
        move = s.next();
        System.out.println("Initial coordinate: ("+ x + "," + y + ")");
        String[] moves = move.split("");
        for(int i=0;i<moves.length;i++){
            switch(moves[i]){
                case "R":
                case "r":
                    x++;
                    break;
                case "L":
                case "l":
                    x--;
                    break;
                case "U":
                case "u":
                    y++;
                    break;
                case "D":
                case "d":
                    y--;
                    break;
            }
    }
        System.out.println("Initial coordinate: ("+ x + "," + y + ")");
        
    }
    
}
