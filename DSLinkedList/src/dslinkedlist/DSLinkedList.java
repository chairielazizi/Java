/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dslinkedlist;

/**
 *
 * @author user
 */
public class DSLinkedList{
    private ListNode head;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        System.out.println("Linked List : Insert nodes at the back");
        list.addNode("Epal");
        list.addNode("Oren");
        list.addNode("Durian");
        System.out.println("LinkedList has "+list.length()+" nodes.");
        list.showList();
    }
    
}
