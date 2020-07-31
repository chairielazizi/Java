/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsfinalsem1_1819;

/**
 *
 * @author user
 */
public class DSFinalSem1_1819 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Q1();
        System.out.println();
        Q2();
        System.out.println();
        Q3();
    }
    
    private static void Q1(){
        Stack<String> stack1 = new Stack<>();
        stack1.push("one");
        stack1.display();
        stack1.pushMany("two,three four,five,six seven");
        stack1.display();
        stack1.pop();
        stack1.pop();
        stack1.display();
        
        System.out.println("-----------------------------------------------");
        
        Stack<Integer> stack2 = new Stack<>();
        stack2.push(1);
        stack2.push(2);
        stack2.pushMany("3 4,5,6 7");
        stack2.display();
        stack2.popAll();
        stack2.display();
    }
    
    private static void Q2(){
        Queue<String> q = new Queue<>();
        q.enqueue("Hello");
        q.enqueueMany("all,who,wants,ice cream,or cookies");
        q.display();
        q.dequeue();
        q.display();
        q.dequeueAll();
        q.display();
        
        System.out.println("--------------------------------------------------");
        
        Queue<Integer> q1 = new Queue<>();
        q1.enqueue(1000);
        q1.enqueue(2000);
        q1.enqueueMany("3000,4000 5000,6000,7000,8000 9000");
        q1.display();
        q1.dequeue();
        q1.dequeue();
        q1.enqueue(8000);
        q1.dequeueAll();
        q1.display();
    }
    
    private static void Q3(){
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("Computing Mathematics",3);
        list.addFirst("Network Architecture",3);
        list.addFirst("Final Year Project",5);
        list.addFirst("Data Structure",5);
        list.display();
        list.addAfter("Software Modelling","Final Year Project", 4);
        list.display();
        list.deleteAfter("Data Structure",5);
        list.display();
    }
}
