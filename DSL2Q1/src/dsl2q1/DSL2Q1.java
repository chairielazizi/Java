/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl2q1;

import java.util.*;
/**
 *
 * @author user
 */

class GenerateNumber<T> {
    private Class<T> type;
    
    
    public GenerateNumber(Class<T> t){
        type = t;
    }
    
    public T generate(int n){
        LinkedList<Integer> list = new LinkedList<>();
        Random r = new Random();
        Integer[] array = new Integer[n];
        
        for(int i=0;i<101;i++){
            list.add(i);
        }
        Collections.shuffle(list);
        list = new LinkedList<>(list.subList(0, n));
//        for(int i=0;i<n;i++){
//            int num = r.nextInt(101);
//            if(list.contains(num)){
//                i--;
//                continue;
//            }
//        list.add(num);
//        }
        
        Collections.sort(list);
        list.toArray(array);
        if(type == array.getClass()){
            return (T) array;
        }
        else if(type == list.getClass()){
            return (T) list;
        }
        throw new UnsupportedOperationException(); 
//        if(type == list.getClass()){
//            return (T) list;
//        }
//        Integer[] arr = new Integer[n];
//        list.toArray();
//        return (T) arr;
    }
}

public class DSL2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GenerateNumber<Integer[]> gn1 = new GenerateNumber<>((Class<Integer[]>)new Integer[]{}.getClass());
        Integer[] arr = gn1.generate(10);
        System.out.println(Arrays.toString(arr));
        GenerateNumber<LinkedList<Integer>> gn2 = new GenerateNumber<>((Class<LinkedList<Integer>>) (new LinkedList<Integer>()).getClass());
        LinkedList<Integer> arr2 = gn2.generate(10);
        System.out.println(arr2);
    }
    
}
