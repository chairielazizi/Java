/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dst2;

/**
 *
 * @author user
 */
public class DST2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        generic("Hello","World");
    }
    
    /*
    public static <T> void test(T a,T b){
        double sum=0;
        System.out.println("The parameters value are : ");
        System.out.println(a.equals(b));a.getClass().equals(b)
                ;
    }
    */
    //Question 1
    public static<T,U> void generic (T t,U u){
	if (t instanceof Integer){
		System.out.println("The sum of integer is" +((Integer)t + 	(Integer)u));}
    else if(t instanceof Double){
        System.out.println("The sum of the double is"+((Double)t)+(Double)u);
    }
    else if(t instanceof String){
        if(((String)t).equals((String)u))
           System.out.println("is equal");
        else{
           System.out.println("Not equal");
        }
    }
    }
    
    //Question 2
    
}
