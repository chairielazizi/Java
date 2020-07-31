/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl4q2;

import java.util.Scanner;

/**
 *
 * @author user
 */

class TwoLists{
    LinkedList list1;
    LinkedList list2;
    
    public TwoLists(LinkedList l1,LinkedList l2){
        list1 = l1;
        list2 = l2;
    }
}

class Node{
    int value;
    Node next;
}

public class DSL4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Integer> arr = new LinkedList<>();
        arr.addNode(5);
        arr.addNode(2);
        arr.addNode(3);
        arr.addNode(1);
        arr.addNode(4);
        arr.showList();
        System.out.println("");
        arr.addSort(5);
        arr.addSort(2);
        arr.addSort(3);
        arr.addSort(1);
        arr.addSort(4);
        arr.showList();
        
        LinkedList<Character> ayat = new LinkedList<>();
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter a word: ");
        String word = s.nextLine();
        for(int i=0;i<word.length();i++){
            ayat.addNode(word.charAt(i));
        }
        ayat.showList();
        System.out.println("\nSplit the list into two");
        TwoLists t1 = arr.splitList();
        System.out.println(t1.list1);
        System.out.println(t1.list2);
    }
    
}
