/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l8q1;

import java.util.Random;

/**
 *
 * @author wif190007
 */
public class Number {
    private int[] array;
    private Random r = new Random();
    
    public Number(){
        array = new int[10];
        for(int i=0;i<10;i++){
            array[i]=r.nextInt(101);
        }
    }
    public Number(int a){
        array = new int[a];
        for(int i=0;i<a;i++){
            array[i]=r.nextInt(101);
        }
    }
    public Number(int b,int c){
        array = new int[b];
        for(int i=0;i<b;i++){
            array[i]=r.nextInt(c);
        }
    }
    
    public String even() {
        String even="";
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                even = even + array[i] + " ";
            }
            
        }
        return even;
    }
    
    public String toString() {
        String arr="";
        for(int a:array) {
            arr += a + " ";
        }
        return arr;
    }
    
    
}
