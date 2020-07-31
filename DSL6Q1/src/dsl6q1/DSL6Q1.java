/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl6q1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class DSL6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter transactions : ");
        //String input = s.nextLine();
        String in = " D 400 | W 300 | W 700 | D 200 | D 450 | W 120";
        String[] arr = in.split("\\|", 0);
        Queue<String> q1 = new Queue<>();
        for(String i:arr){
            q1.enqueue(i);
        }
        q1.showQueue();
        int balance=500;
        System.out.println("\nInitial balance: "+balance);
        Trans(q1,balance);
        
        //System.out.println("\n"+q1.peek());
        
        
    }
    
    public static void Trans(Queue<String> a,int balance){
        while(!a.isEmpty()){
            if(a.peek().charAt(1)=='D'){
                int i = Integer.parseInt(a.peek().substring(3, 6));
                balance += i;
                a.dequeue();
                System.out.printf("Deposit "+i+"\t\tNew Balance "+balance+"\n");
            }
            else if(a.peek().charAt(1)=='W'){
                int i = Integer.parseInt(a.peek().substring(3, 6));
               
                if(balance<i){
                    System.out.printf("Withdraw "+i+" Rejected\tNew Balance "+balance+"\n");
                    a.dequeue();
                }
                else{
                    balance -= i;
                    System.out.printf("Withdraw "+i+"\t\tNew Balance "+balance+"\n");
                    a.dequeue();
                }
            }
        }
    }
    
}


