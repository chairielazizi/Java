/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final1819sem2q1;

/**
 *
 * @author user
 */
public class Final1819Sem2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[]num={66,15,20,27,74,33};
        int cnt=0;
        for(int k=0;k<num.length;k++){
            if(isEven(k)){
                cnt++;
            }
        }
        System.out.println("The number of even integers is " + cnt);
        System.out.println("The biggest number is "+findMax(num));
        
    }
    public static boolean isEven(int a){
        if(a%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static int findMax(int[]a){
        int max=a[0];
        for(int n=0;n<a.length;n++){
            if(a[n]>max){
                max=a[n];
            }
        }
        return max;
    }
    
}
