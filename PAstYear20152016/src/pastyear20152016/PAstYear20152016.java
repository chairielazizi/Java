/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pastyear20152016;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class PAstYear20152016 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x,y;
        String move;
        System.out.println("Enter the coordinate X and Y: ");
        x = s.nextInt();
        y = s.nextInt();
        s.nextLine();
        System.out.println("Enter the move: ");
        move = s.nextLine();
        System.out.println("Initial Coordinate: (" + x +"," + y + ")");
        
        for(int i=0;i<move.length();i++){
            if(move.charAt(i)=='R'){
                x++;
            }
            else if(move.charAt(i)=='L'){
                x--;
            }
            else if(move.charAt(i)=='U'){
                y++;
            }
            else if(move.charAt(i)=='D'){
                y--;
            }
        
        
        /*
        int x=0,y=0;
        int newx=0,newy=0;
        String move;
        System.out.println("Enter the coordinate X and Y: ");
        x = s.nextInt();
        y = s.nextInt();
        s.nextLine();
        System.out.println("Enter the move: ");
        move = s.nextLine();
        
        for(int i=0;i<move.length();i++){
            if(move.charAt(i)=='R'){
                //x++;
                newx = x + 1;
            }
            else if(move.charAt(i)=='L'){
                newx = x - 1;
            }
            else if(move.charAt(i)=='U'){
                newy = y + 1;
            }
            else if(move.charAt(i)=='D'){
                newy = y - 1;
            }
        }
        */
        /*
        for(int i=0;i<10;i++){
            //move = s.next();
            switch(move){
                case "R":
                case "r":
                    newx = x + 1;
                    break;
                case "L":
                case "l":
                    newx = x - 1;
                    break;
                case "U":
                case "u":
                    newy = y + 1;
                    break;
                case "D":
                case "d":
                    newy = y - 1;
                    break;
            }
        }
        */
        System.out.println("Final Coordinate: (" + x +"," + y + ")");
        //System.out.println("Final Coordinate: (" + newx +"," + newy + ")");
        
        
        //Question 2
        String type = "";
        double sales = 0,kg=0;
        /*do{
            System.out.println("Enter the type of durian [Quit] to terminate: ");
            type = s.nextLine();
            
        }while(!type.equals("Quit"));*/
        System.out.println("Enter the type of durian [Quit] to terminate: ");
        type = s.next();
        
        while(!type.equalsIgnoreCase("quit")){
            if(!type.equalsIgnoreCase("MK")&&!type.equalsIgnoreCase("HL")&&
                    !type.equalsIgnoreCase("D24")&&!type.equalsIgnoreCase("UM")){
                System.out.println("Enter the type of durian [Quit] to terminate: ");
                type = s.next();
                continue;
            }
                
            System.out.println("Enter the sales: ");
            kg = s.nextDouble();
            
            switch(type){
                case "MK":
                case "mk":
                    sales  = sales + (kg * 25.0);
                    break;
                case "HL":
                case "hl":
                    sales  = sales + (kg * 22.0);
                    break;
                case "D24":
                case "d24":
                    sales  = sales + (kg * 20.0);
                    break;
                case "UM":
                case "um":
                    sales  = sales + (kg * 18.0);
                    break;
                
            }
            System.out.println("Enter the type of durian [Quit] to terminate: ");
            type = s.next();
            
        }
        System.out.printf("The total sales: %.2f\n",sales);
        
    }
    
}}
