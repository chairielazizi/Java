/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsfinalsem2_1617;

import java.util.Scanner;

/**
 *
 * @author chairiel
 */
public class DSFinalSem2_1617 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Q1();
        Q2();
    }
    
    private static void Q1(){
        LinkedList<String> list = new LinkedList<>();
        list.insertFirstLink("Louis Vuitton", 10000000);
        list.insertFirstLink("Chanel", 100000000);
        list.insertFirstLink("Prada", 1000000);
        list.insertFirstLink("Tods", 500000000);
        
        list.addAfter("Coach", "Chanel", 100000000);
    }
    
    private static void Q2(){
        GenericStack<String> stack = new GenericStack<>();
        System.out.println(stack.isEmpty());
        System.out.println("Push 3 books to the pile:");
        Scanner s = new Scanner(System.in);
        
//        String[]books =new String[3];
//        for(int i=0;i<books.length;i++){
//            books[i]=s.nextLine();
//        }
        String[] books = {"The Hobbit","The Lord of the Rings","The Da Vinci Code"};
        for(String b:books){
            stack.push(b);
        }
        System.out.println(stack.toString());
        
        System.out.println("The pile has "+stack.getSize()+" books");
        System.out.println("The "+stack.peek()+" is at the top of the pile");
        System.out.println("The "+stack.pop()+" is removed from the pile");
        System.out.println("The "+stack.peek()+" is at the top of the pile");
        System.out.println("The "+stack.pop()+" is removed from the pile");
        System.out.println("The "+stack.peek()+" is at the top of the pile");
        System.out.println("The "+stack.pop()+" is removed from the pile");
        
        System.out.println("The pile is empty: "+stack.isEmpty());
    }
}
