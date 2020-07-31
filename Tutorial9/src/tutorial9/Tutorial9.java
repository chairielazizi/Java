/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial9;

/**
 *
 * @author user
 */
public class Tutorial9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Q1
        
        
        //Q2
        Organism a = new Organism(3,2.1);
        System.out.println(a.toString());
        
        Animal b = new Animal(6,5,3.89);
        System.out.println(b.toString());
        
        if(a.getClass()==b.getClass()){
            System.out.println("Yeay");
        }
        else
            System.out.println("Boo");
        
        check(a,b);
        isClass(a);
        
        //Q3
        PaySystem p = new PaySystem(8.50,12);
        System.out.println(p.toString());
    
    }
    public static boolean check(Organism s,Animal k){
        if(s.getClass()==k.getClass()){
            System.out.println("Yeay");
            return true;
        }
        else
            System.out.println("Boo");
            return false;
        }
    
    public static boolean isClass(Organism a){
        if(a instanceof Organism){
            System.out.println("Yes");
            return true;
        }
        else
            return false;
        
    }
    
    

}
