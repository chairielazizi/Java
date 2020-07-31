/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addNode(258);
        list.addNode(312);
        list.addNode(675);
        list.addNode(806);
        list.addNode(910);
        System.out.println("The number in original linked list");
        list.showList();
//        list.deleteNode();
//        list.showList();
//        System.out.println(list.get(1));
        
        System.out.println("The number in special linked list");
        list.addSpecialNode(123);
        list.showList();
        
    }
    
}
