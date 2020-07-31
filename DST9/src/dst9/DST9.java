/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dst9;

import java.util.Scanner;

/**
 *
 * @author chairiel
 */
public class DST9 {

    /**
     * @param args the command line arguments
     */
    
    static Scanner s = new Scanner(System.in);
    //Q1
    static char value;
    static SearchTest<Character> search = new SearchTest<>('A',10);
    //Q2
    static SearchTest<Integer> searchInt = new SearchTest<>(1,10);
    static int num;
    //Q3
    static HashTable<String,String> cisco = new HashTable<>();
    String key;
    
    public static void main(String[] args) {
        //Q1();
        //Q2();
        Q3();
    }
    
    public static void containValue(char value){
        boolean data = search.contain(value);
        if(data==true){
            System.out.println(value+" is found");
        }
        else{
            System.out.println(value+" is not found");
        }
    }
    
    private static void Q1(){
        System.out.println("The data set is: ");
        search.showValue();
        Scanner s = new Scanner(System.in);
        System.out.println("Linear search");
        System.out.print("Enter value to search: ");
        value = s.next().charAt(0);
        containValue(value);
        search.listIndex();
//        boolean data = search.contain(value);
//        if(data==true){
//            System.out.println(value+" is found");
//        }
//        else{
//            System.out.println(value+" is not found");
//        }
    }
    
    private static void Q2(){
        System.out.println("The character data set is: ");
        searchInt.selectionSort(searchInt.ascending);
        searchInt.showValue();
        System.out.println("Binary Search");
        System.out.print("Enter a number to search: ");
        num = s.nextInt();
        containValue(num);
        //searchInt.listIndex();
        System.out.println("The number of "+num+"in the data set is "+searchInt.binarySearchCount(num));
    }
    
    public static void containValue(int value){
        boolean data = searchInt.contain(value);
        if(data==true){
            System.out.println(value+" is found");
        }
        else{
            System.out.println(value+" is not found");
        }
    }
    
    private static void Q3(){
        System.out.println("Hash Table");
        
        cisco.put("100-101","ICND 1");
        cisco.put("200-101","ICND 2");
        cisco.put("200-120","CCNA Routing and Switching");
        cisco.put("210-260","CCNA Security");
        System.out.println("The number of elements in the Hash Table is: "+cisco.getSize());
        cisco.showHashTable();
        System.out.println("\nEnter a code to search: ");
        String value = s.nextLine();
        containKey(value);
        
    }
    public static void containKey(String key){
        boolean data = cisco.containKey(key);
        if(data==false){
            System.out.println("The course "+key+" cannot be found");
        }
        else{
            System.out.println("Course "+key+":"+cisco.get(key));
        }
    }
}
