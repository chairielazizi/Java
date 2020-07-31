/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsfinalsem1_1617;

/**
 *
 * @author chairiel
 */
public class DSFinalSem1_1617 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Q2();
        System.out.println();
        Q3();
        Q4();
    }
    
    private static void Q2(){
        Queue<Integer> queue = new Queue<>();
        int[] arr = {10,20,30,40,50,60,70,80,90};
        for(int i:arr){
            queue.enqueue(i);
        }
        System.out.println(queue.size());
        queue.tostring();
        
        System.out.println();
        queue.ChangeOrder(4);
        queue.tostring();
    }
    
    private static void Q3(){
        Stack<Character> stack = new Stack<>();
        String sen = "MALAYSIA";
        char[] arr = sen.toCharArray();
//        for(char c:arr){
//            System.out.println(c);
//            stack.push(c);
//        }
        for(int i=0;i<arr.length;i++){
            stack.push(arr[i]);
        }
        System.out.println(stack.getSize());
//        for(int i=0;i<stack.getSize()+7;i++){
//            System.out.print(stack.pop().toString());
//        }
        while(!stack.isStackEmpty())
            System.out.print(stack.pop());
        
        System.out.println();
    }
    
    private static void Q4(){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.addAfter(11, 10);
        list.addAfter(21, 20);
        list.addAfter(31, 30);
        list.addAfter(41, 40);
        list.addAfter(51, 50);
        
        list.traverse();
        
        list.deleteFront();
        list.deleteFront();
        System.out.println();
        list.traverse();
        
        list.deleteAfter(40);
        list.deleteAfter(40);
        list.deleteAfter(31);
        list.deleteAfter(40);
        
        list.traverse();
    }
}
