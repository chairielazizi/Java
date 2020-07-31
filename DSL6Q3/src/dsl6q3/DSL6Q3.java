/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl6q3;

import java.util.Random;

/**
 *
 * @author chairiel
 */
public class DSL6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<ColourCard> player1 = new Queue<>();
        Queue<ColourCard> player2 = new Queue<>();
        ColourCard[] array = new ColourCard[40];
        for(int i=0;i<array.length;i++){
            array[i]=new ColourCard(i % 10 + 1,i / 10 +1);
        }
        
        shuffleCard(array);
        
        for(int i=0;i<10;i+=2){
            player1.enqueue(array[i]);
            player2.enqueue(array[i+1]);
        }
        System.out.println("Player 1");
        player1.showQueue();
        System.out.println("\nPlayer 2");
        player2.showQueue();
        int count=0;
        for(int i=0;i<5;i++){
            ColourCard p1queue = player1.dequeue();
            ColourCard p2queue = player2.dequeue();
            if(p1queue.compareTo(p2queue)==1){
                count++;
            }
        }
        System.out.println("\nPlayer 1 score: "+count);
        System.out.println("Player 2 score: "+(5-count));
        if(count>=3){
            System.out.println("Player 1 WINS!");
        }
        else{
            System.out.println("Player 2 WINS!");
        }
    }
    
    public static <T> void shuffleCard(T[] array){
        Random r = new Random();
        for(int i=0;i<40;i++){
            int first = r.nextInt(40);
            int second = r.nextInt(40);
            T temp = array[first];
            array[first] = array[second];
            array[second] = array[first];
        }
    }
}
