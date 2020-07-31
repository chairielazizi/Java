/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dst4;

/**
 *
 * @author user
 */
public class DST4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Double> a = new LinkedList<>();
        a.addNode(23.1);
        a.addNode(36.5);
        a.addNode(12.8);
        a.addNode(42.6);
        a.addNode(32.8);
        System.out.println("The linked list has "+a.length()+" nodes");
        a.showList();
    }
    
}
