/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl6q2;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class DSL6Q2 {

    /**
     * @param args the command line arguments
     */
    //static String input;
    
    public static void main(String[] args) {
        LinkedList<String> category = new LinkedList<>();
        LinkedList<Queue<String>> queuelist = new LinkedList<>();
        try{
        Scanner scanner = new Scanner(new FileInputStream(new File("lab6Q2.txt")));
        /*
// Use ArrayList
            ArrayList<String> products = new ArrayList<>();
            ArrayList<Queue<String>> queueArrayList = new ArrayList<>();

            String line;
            String[] elements;
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                elements = line.split(" ");
                int index = 0;
                for (String element : elements) {
                    if (element.contains("P0")) {
                        if (!products.contains(element)) {
                            products.add(element);
                            Queue<String> queue = new Queue<>();
                            queueArrayList.add(queue);
                        }
                        index = products.indexOf(element);
                    } else {
                        Queue<String> queue = queueArrayList.get(index);
                        queue.enqueue(element);
                    }
                }
            }
            System.out.print("Product Code in Queue : ");
            for (int i  = 0; i < products.size(); i++) System.out.print(products.get(i) + " --> ");
            System.out.println();

            System.out.println("List of product by categories");
            for (int i = 0; i < products.size(); i++) {
                System.out.println("Product : " + products.get(i));
                queueArrayList.get(i).showQueue();
            }
            */
            
            Scanner s = new Scanner(new FileInputStream("lab6q2.txt"));
        String input;
        String[] products;
        while(s.hasNextLine()){
            int index=0;
            input = s.nextLine();
            products = input.split(" ");
            for (String product : products) {
                if (product.contains("P0")) {
                    if (!category.contains(product)) {
                        category.add(product);
                        Queue<String> queue = new Queue<>();
                        queuelist.add(queue);
                    }
                    index = category.indexOf(product);
                } else {
                    Queue<String> queue = queuelist.get(index);
                    queue.enqueue(product);
                }
            }
        }
        System.out.println("Product code in Queue");
        for(int i=0;i<category.size();i++){
            System.out.print(category.get(i)+" --> ");
        }
        System.out.println("\nList of product by categories:");
        for(int i=0;i<category.size();i++){
            System.out.println(category.get(i));
            queuelist.get(i).showQueue();
        }
           
            
        
        /*
        while(s.hasNextLine()){
            input = s.nextLine();
            System.out.println(input);
            String[] list=input.split(" ");
            String[] list2 = new String[list.length];
            for(int i=0;i<list2.length;i+=2){
                list2[i]=list[i]+list[i+1];
            }
        for(String i:list2){
            if(i==null){
                continue;
            }
            System.out.println(i);
        }
            
            System.out.println("Product code in queue:");
            for(int i=0;i<list.length;i+=2){
                if(list[i]==null)
                    continue;
                queue.enqueue(list[i]);
            }
        }
        queue.showQueue();
        */
        
        s.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
