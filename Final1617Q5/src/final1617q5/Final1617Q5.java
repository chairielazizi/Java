/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final1617q5;

/**
 *
 * @author user
 */
public class Final1617Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PermanentStaff p1 = new PermanentStaff("Abdul Razak", "871001-14-1765", 
        "EM02" ); 
        PartTimeStaff p2 = new PartTimeStaff("Tengku Ali", "911223-08-3301", 35);
        System.out.println(p1.toString());
                System.out.println();
        System.out.println(p2.toString());
    }
    
}
