/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dst6;

//import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author user
 */
public class DST6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        
        //Q1
        Queue<Character> q1 = new Queue<>();
        q1.enqueue('B');
        q1.enqueue('M');
        q1.enqueue('W');
        q1.showQueue();
        
        System.out.println("\nDequeue one node");
        q1.dequeue();
        q1.showQueue();
        System.out.println("\nThe front node of the queue is "+q1.peek());
        System.out.println("The size of queue is "+q1.getSize());
        
        //Q2
        System.out.println("\nQueue implementation using Array");
        System.out.println("Enqueue three nodes");
        ArrayQueue<Character> q2 = new ArrayQueue<>();
        q2.enqueue('B');
        q2.enqueue('M');
        q2.enqueue('W');
        q2.showQueue();
        
        System.out.println("\nDequeue one node");
        q2.dequeue();
        q2.showQueue();
        System.out.println("\nThe front node of the queue is "+q2.peek());
        System.out.println("The size of the queue is "+q2.getSize());
        
        //Q3
        System.out.println("\nSimulating a Queue to purchase MY phone");
        Random r = new Random();
        Queue<Integer> q3 = new Queue<>();
        Q3();
        
        Scanner s = new Scanner(System.in);
        Q4();
        Q5();
        Q6();
        //Q4
        /*
        System.out.println("Enter a word");
        
        String input = s.nextLine();
        Queue<String> q4= new Queue<>();
        //Queue q44 = new LinkedList();
        for(int i=input.length();i>=0;i--){
            q4.enqueue((Character.toString(input.charAt(i))));
        }
        String reverse="";
        while(!q4.isEmpty()){
            reverse += q4.dequeue();
        }
        
        if(reverse.equals(input)){
            System.out.println(input+" is a palindrome");
        }
        else{
            System.out.println(input+" is not a palindrome");
        }
        */
        
        //Q6
//        System.out.println("Enter a sentence: ");
//        String in = s.nextLine();
//        Queue<String> q6 = new Queue<>();
//        String[] word = in.split(" ");
//        for(int i=0;i<word.length;i++){
//            q6.enqueue(word[i]);
//        }
//        q6.showQueue();
        
    }
    
    private static void Q3(){
        Random r = new Random();
        String text ;
        int max = 30;
        int n,i;
        Queue<String> queue = new Queue<>();
        for(i=1;max>=3;i++){
            n = r.nextInt(4)+1;
            text = "Customer "+i+" : "+n+" set(s)";
            queue.enqueue(text);
            max -= n;
        }
        if(max !=0){
            text = "Customer "+i+" : "+max+" set(s)";
            queue.enqueue(text);
        }
        
        queue.showQueueQ3();
        
        System.out.println("The total customer is : "+i);
    }
    
    private static void Q4(){
        String[] ins = {"kayak","Welcome","Was it a car or a cat I saw?","civic","race car"};
        for(int i=0;i<ins.length;i++){
            if(Q4Palindrome(ins[i])){
                System.out.println(ins[i]+" is a palindrome");
            }
            else{
                System.out.println(ins[i]+" is not a palindrome");
            }
        }
    }
    private static boolean Q4Palindrome(String input){
     Queue<Character> queue = new Queue<>();
     Stack<Character> stack = new Stack<>();
     for(int i=0;i<input.length();i++){
         queue.enqueue(input.charAt(i));
         stack.push(input.charAt(i));
     }
     while(!stack.isEmpty()){
         if(queue.dequeue() != stack.pop())
             return false;
     }
     return true;
    }
    
    private static void Q5(){
        String[] ins = {"Was it a car or a cat that I saw?","?civic#","race car","redrawer","put    "};
        for(int i =0;i<ins.length;i++){
            if(Q5PalindromeModify(ins[i]))
                System.out.println(ins[i]+ " is  a palindrome");
            else
                System.out.println(ins[i]+" is not a palindrome");
        }
    }
    private static boolean Q5PalindromeModify(String input){
        Queue<Character> queue = new Queue<>();
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<input.length();i++){
            if(Character.isLetterOrDigit(input.charAt(i))){
                queue.enqueue(Character.toLowerCase(input.charAt(i)));
                stack.push(Character.toLowerCase(input.charAt(i)));
            }
        }
        while(!stack.isEmpty()){
            if(!Objects.equals(queue.dequeue(), stack.pop())){
                return false;
            }
        }
        return true;
    }
    
    private static void Q6()throws Exception{
        //Scanner s = new Scanner(System.in);
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        String input;
        System.out.println("Enter a sentence");
        input = br.readLine();
        Queue<String> queue1 = new Queue<>();
        Queue<String> temp = new Queue<>();
        Queue<String> queue2 = new Queue<>();
        
        String[] word = input.split(" ");
        //String[] word = br.readLine().split(" ");
        for(int i=0;i<word.length;i++){
            queue1.enqueue(word[i]);
        }
        
        System.out.println("The original queue:");
        queue1.showQueue();
        
        System.out.println("\nReverse all the words in the queue: ");
        int counter = 1;
        while(true){
            if(counter %2 == 1){
                while(queue1.getSize() != 1){
                    temp.enqueue(queue1.dequeue());
                }
                queue2.enqueue(queue1.dequeue());
                counter++;
                if(temp.isEmpty())
                    break;
            }
            else{
                while(temp.getSize()!= 1){
                    queue1.enqueue(temp.dequeue());
                }
                queue2.enqueue(temp.dequeue());
                counter++;
                if(queue1.isEmpty())
                    break;
            }
        }
        queue2.showQueue();
    }
}
