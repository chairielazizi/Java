/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl3q1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class DSL3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Mesh Topology");
        System.out.println("Enter number of switches:");
        Scanner s = new Scanner(System.in);
        //int sw = s.nextInt();
        do{
        int sw = s.nextInt();
            System.out.println("There are "+sw+" switches in the network");
            System.out.println("The total number of connection is "+connect(sw));
            if(sw==0){
                break;
            }
        }while(true);
    }
    /**
     * mesh topology
     * formula
     * N * (N -1)/2
     */
    public static int connect(int n){
        if(n>0){
            return(n-1) + connect(n-1);
        }
        else{
            return 0;
        }
    }
    
}
