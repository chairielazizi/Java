/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsfinalsem2_1819;

/**
 *
 * @author user
 */
public class DSFinalSem2_1819 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Q1();
        Q4();
    }
    
    private static void Q1(){
        MyLinkedList<Integer> list1 = new MyLinkedList<>();
        list1.addFirst(51);
        list1.addFirst(41);
        list1.addFirst(38);
        list1.addFirst(10);
        list1.addFirst(2);
        System.out.println(list1.toString());
        
        MyLinkedList<Integer> list2 = new MyLinkedList<>();
        list2.addLast(5);
        list2.addLast(12);
        list2.addLast(18);
        list2.addLast(21);
        list2.addLast(35);
        list2.addLast(41);
        list2.addLast(56);
        
        System.out.println(list2.toString());
        
        MyLinkedList<Integer> newList = new MyLinkedList<>();
        newList = combine(list1,list2);
        System.out.println(newList);
    }
    public static MyLinkedList combine(MyLinkedList<Integer> list1,MyLinkedList<Integer> list2){
        MyLinkedList<Integer> newList = new MyLinkedList<>();
        while(list1.getSize()!=0 || list2.getSize()!=0){
            Integer p = list1.removeFirst();
            Integer q = list2.removeFirst();
            if(p == null){
                newList.addLast(q);
            }
            else if(q == null){
                newList.addLast(p);
            }
            else if(p<q){
                newList.addLast(p);
                list2.addFirst(q);
            }
            else{
                newList.addLast(q);
                list1.addFirst(p);
            }
        }
        return newList;
    }
    
    private static void Q4(){
        //        int i;
        if(System.out.printf("Hello-World")==null){}
//        for(i = 1; i < 2; System.out.println("Hello World.")){
//            i++;
//     	}
    }
    
    
}
