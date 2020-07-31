/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl6q5;

import java.util.Random;

/**
 *
 * @author chairiel
 */
public class DSL6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PriorityQueue<Packet> pq = new PriorityQueue<>();
        Random r = new Random();
        String[] type = {"Voice","Video","Data"};
        
        int prior=0;
        System.out.println("10 packets arrived");
        for(int i=0;i<=10;i++){
            String ran = type[r.nextInt(3)];
            if(ran.equalsIgnoreCase("Voice")){
                prior = 2;
            }
            else if(ran.equalsIgnoreCase("Video")){
                prior = 1;
            }
            else if(ran.equalsIgnoreCase("Data")){
                prior = 0;
            }
            Packet packet = new Packet(ran +" "+ i,prior);
            pq.enqueue(packet);
            System.out.println(packet.toString());
        }
        
        System.out.println("\nProcessing 10 network packets");
//        while(!pq.isEmpty()){
//            pq.dequeue();
//        }
    }
    
}
