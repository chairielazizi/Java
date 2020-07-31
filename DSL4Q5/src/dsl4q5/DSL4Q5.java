/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl4q5;

/**
 *
 * @author user
 */
public class DSL4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addNode(5);
        list.addNode(3);
        list.addNode(1);
        list.addNode(2);
        list.addNode(4);
        list.showList();
        System.out.println("");
        LinkedList.LinkedListIteratorInteger iter = list.new LinkedListIteratorInteger();
        System.out.println(iter.hasNext());
        for(int i=0;i<list.length();i++){
            System.out.println(iter.next());
        }
        System.out.println(iter.next());
//        System.out.println(iter.next());
//        System.out.println(iter.next());
//        System.out.println(iter.next());
//        System.out.println(iter.next());
//        System.out.println(iter.next());
        LinkedList<String> list2 = new LinkedList<>();
        list2.addNode("ARS");
        list2.addNode("AST");
        list2.addNode("CHE");
        list2.addNode("LEI");
        list2.addNode("MAN");
        list2.addNode("LIV");
        list2.addNode("TOT");
        list2.showList();
        System.out.println("");
        //LinkedList.LinkedListIterator<String> team = list2.new LinkedListIterator<>();
        
        for(int i=0;i<list2.length();i++){
            //System.out.println(team.next());
            //team.remove(list2.contains("A"));
        }
    }
    
}
