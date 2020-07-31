/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l6q2;

/**
 *
 * @author user
 */
public class L6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 5;
        char c = '*';
        multiPrint(n,c);
        System.out.println();
        System.out.println();
        
        for(int i=0;i<n;i++){
        multiPrint(n - i - 1,' ');
        multiPrint(i * 2 + 1,c);
        System.out.println();
        }
        System.out.println();
        
        for(int i=0;i<n;i++){
        multiPrint(n - i - 1,' ');
        multiPrint(i * 2 + 1,c);
        System.out.println();
        }
        for(int j=0;j<n;j++){
        multiPrint(j+1 ,' ');
        multiPrint(n*2 - (j+1)*2 - 1,c);
        System.out.println();
        }
    }
    public static void multiPrint(int n,char c){
        for(int i=0;i<n;i++){
            System.out.print(c);
            
        }
    }
}
