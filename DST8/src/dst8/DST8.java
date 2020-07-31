/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dst8;

/**
 *
 * @author user
 */
public class DST8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Q1
        SortTest<Character> selection = new SortTest(SortTest.DESCENDING,'A');
        System.out.print("The character data set : ");
        selection.showValue();
        System.out.println("Selection Sort - Descending Order");
        selection.selectionSort();
        selection.showValue();
//        SortTest<Integer> a = new SortTest(SortTest.DESCENDING,1);
//        a.showValue();
//        System.out.println("a Sort - Descending Order");
//        a.selectionSort();
//        a.showValue();
        SortTest<Character> bubble = new SortTest(SortTest.DESCENDING,'A');
        System.out.print("The character data set : ");
        bubble.showValue();
        System.out.println("Bubble Sort - Descending Order");
        bubble.bubbleSort();
        bubble.showValue();
        
        SortTest<Character> insert = new SortTest(SortTest.DESCENDING,'A');
        System.out.print("The character data set : ");
        insert.showValue();
        System.out.println("Insertion Sort - Descending Order");
        insert.insertionSort();
        insert.showValue();
        
        SortTest<Character> merge = new SortTest(SortTest.DESCENDING,'A');
        System.out.print("The character data set : ");
        merge.showValue();
        System.out.println("Merge Sort - Descending Order");
        merge.mergeSort();
        merge.showValue();
        
        SortTest<Character> quick = new SortTest(SortTest.DESCENDING,'A');
        System.out.print("The character data set : ");
        quick.showValue();
        System.out.println("Quick Sort - Descending Order");
        quick.quickSort();
        quick.showValue();
        
        //Q2
        SortTest<String> stringmerge = new SortTest(SortTest.ASCENDING,"aaaaaaaa");
        System.out.print("The random string are : ");
        stringmerge.showValue();
        System.out.println("Merge sort - Ascending Order");
        stringmerge.mergeSort();
        stringmerge.showValue();
    }
    
}
