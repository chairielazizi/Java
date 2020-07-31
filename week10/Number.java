package week10;

import java.util.Random;


public class Number {
    private int[] num;
    private Random r=new Random();
    
    public Number() {
        num = new int[10];
        for(int i=0; i<num.length; i++) {
            num[i]=r.nextInt(101);
        }
    }
    public Number(int size) {
        num = new int[size];
        for(int i=0; i<num.length; i++) {
            num[i]=r.nextInt(101);
        }
    }
    public Number(int size, int max) {
        num = new int[size];
        for(int i=0; i<num.length; i++) {
            num[i]=r.nextInt(max+1);
        }
    }
    
    
    public String even() {
        String str = "";
        for(int i=0; i<num.length; i++) {
            if (num[i]%2==0) {
                str = str + num[i] + " ";
            }
        }        
        return str;    
    }
    
    public String toString() {
        String str = "";
        for(int i=0; i<num.length; i++) {
            str = str + num[i] + " ";
        }        
        return str;
    }
    
    
    
}
