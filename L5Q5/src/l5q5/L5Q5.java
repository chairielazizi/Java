/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l5q5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class L5Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        
        Integer[] array = new Integer[20];
        System.out.println("A list of 20 random integer within 0 to 100");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
            System.out.print(array[i] + ", ");
        }
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("\nArray in descending order");
        for (int i: array) System.out.print(i + ", ");
        System.out.print("\nEnter a number to search: ");
        int n = new Scanner(System.in).nextInt();
        
        // Linear Search
        boolean found = false;
        int count;
        for (count = 0; count < array.length; count++) {
            if (array[count] == n) {
                found = true;
                break;
            }
        }
        System.out.printf("%d %sfound\n", n, (found) ? "" : "not ");
        System.out.printf("Linear Search - %d\n", count);
        
        // Binary Search
        int mid; int lo = 0, hi = array.length - 1;
        found = false; count = 0;
        while (lo <= hi) {
            count++;
            mid = (lo + hi) / 2;
            if (array[mid] == n) {
                found = true;
                break;
            }
            else if (array[mid] > n)
                lo = mid + 1;
            else
                hi = mid - 1;
        }
        System.out.printf("%d %sfound\n", n, (found) ? "" : "not ");
        System.out.printf("Binary Search - %d\n", count);
    }
    
}
