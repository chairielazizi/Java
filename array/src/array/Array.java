/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author user
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int even = 0, odd = 0, prime = 0;
        Random rand = new Random();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter how many numbers to be generated:");
        int n = s.nextInt();
        int[] arr = new int[n];
        //int[] arr = {2,6,78,3,4,6,5,9,3};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(101);
            System.out.print(arr[i] + " ");
            if (prime(arr[i])) {
                prime++;
            }
            if (isEven(arr[i])) {  //call method
                even++;
            } else {
                odd++;
            }
        }
        System.out.println();
        System.out.println("Sum: " + sum(arr));
        float ave = (float) sum(arr) / (float) n;
        System.out.printf("Average: %.2f\n", ave);
        System.out.println("Even: " + even + "\nOdd: " + odd);
        System.out.println("Prime numbers: " + prime);
        mod(arr);
        median(arr);
        standard(arr, ave);
        roundoff(arr);
        
        System.out.println("Mode: "+findMode(arr));
        System.out.println(mode(arr));
    }

    public static int sum(int[] arr) {
        int sum = 0;  //add
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static boolean isEven(int arr) {
        if (arr % 2 == 0) {  //true for even
            return true;
        } else {
            return false;
        }
    }

    public static boolean prime(int arr) {
        //display and count
        int flag = 0;
        if (arr == 1 || arr == 0) {
            return false;
        } else {
            for (int i = 2; i < arr; i++) {
                if (arr % i == 0) {
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void mod(int[] arr) {
        int[] cluster = new int[101];
        for (int j = 0; j < cluster.length; j++) {
            cluster[j] = 0;
        }
        for (int i = 0; i < cluster.length; i++) {
            for (int k = 0; k < arr.length; k++) {
                if (arr[k] == i) {
                    cluster[i]++;
                }
            }
        }
        int max = 0;
        int num = 0;
        for (int i = 0; i < 101; i++) {
            if (cluster[i] >= num) {
                num = cluster[i];
                max = i;
            }
        }
        System.out.println("Mode is : " + max);
    }

    public static void median(int[] arr) {
        //sort then choose the middle
        float median;
        System.out.print("Descending order: ");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.print("\nAscending order: ");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }

        if (arr.length % 2 == 1) {
            int y = (arr.length / 2) + 1;
            median = arr[y - 1];
        } else {
            int x = arr.length / 2;
            median = (arr[x] + (arr[x - 1])) / (float) 2.0;
        }
        System.out.printf("\nMedian: %.2f", (float) median);
    }

    public static void standard(int[] arr, float ave) {
        //calculate standard deviation and variance
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += ((arr[i] - ave) * (arr[i] - ave));
        }
        float k = sum / (arr.length - 1);
        float deviation = (float) Math.sqrt(k);
        System.out.printf("\nStandard deviation: %.2f", deviation);
        float variance = (float) Math.pow(deviation, 2);
        System.out.printf("\nVariance: %.2f", variance);
    }

    public static void roundoff(int[] arr) {
        //round off all the number
        int a;
        System.out.print("\nRound off: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 10) {
                a = arr[i] % 10;
                if (a > 4) {
                    arr[i] = arr[i] + (10 - a);
                } else if (a <= 4) {
                    arr[i] = arr[i] - a;
                }
            }
            System.out.print(arr[i] + " ");
        }

    }
    
    public static int findMode(int[] a)
    {
        int index = 0  ;
        int soFar = 1 ; 
        int count = 1 ; 
        for(int k =1;   k < a.length; k++){
            if (a[k-1] == a[k]){
                count++ ; }
            if(count > soFar)
            { 
                soFar = count ; 
                index = k ; 
            }
            else {
                count = 1 ; 
            }
        }
        return a[index] ; 
    }
    
    public static Integer[] mode(int a[]){
        List<Integer> modes = new ArrayList<Integer>(  );
        int maxCount=0;   
        for (int i = 0; i < a.length; ++i){
            int count = 0;
            for (int j = 0; j < a.length; ++j){
              if (a[j] == a[i]) ++count;
            }
                if (count > maxCount){
                maxCount = count;
                modes.clear();
                modes.add( a[i] );
                }
                else if ( count == maxCount ){
                    modes.add( a[i] );
            }
          }
          return modes.toArray( new Integer[modes.size()] );
    }
    public static int[] convertIntegers(List<Integer> integers){
        int[] ret = new int[integers.size()];
        for (int i=0; i < ret.length; i++)
        {
            ret[i] = integers.get(i).intValue();
        }
        return ret;
    }

}

