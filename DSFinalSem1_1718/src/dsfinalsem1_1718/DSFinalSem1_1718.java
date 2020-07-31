/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsfinalsem1_1718;

/**
 *
 * @author chairiel
 */
public class DSFinalSem1_1718 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Q3();
    }
    
    private static void Q3(){
        Stack<String> stack = new Stack<>();
        stack.push("one");
        stack.push("two");
        stack.push("three");
        stack.push("four");
        stack.display();
        stack.displayReverse();
    }
}
