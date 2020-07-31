/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dst1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class DST1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Q1
        Tarikh a = new Tarikh(5,11,2016);
        System.out.print("Day : "+a.getDay());
        System.out.print(" Month : "+a.getMonth());
        System.out.println(" Year : "+a.getYear());
        System.out.println(a.toString());
        
        //Q2
        Scanner s = new Scanner(System.in);
        System.out.println("The sentence is : ");
        String ayat = s.nextLine();
        Sentence b = new Sentence(ayat);
        b.vowell(ayat);
        b.wordd(ayat);
        System.out.println(b.toString());
        
        //Q3
        DPlan c = new DPlan(5,50);
        System.out.println(c.toString());
        MPlan d = new MPlan(5,50);
        System.out.println(d.toString());
        if(c.plan()<d.plan()){
            System.out.println("DPlan is cheaper as compared to MPlan");
        }
        else{
            System.out.println("MPLan is cheaper as compared to DPlan");
        }
        
        //Q4
        SmartPhone p1 = new SmartPhone("iPhone",2400);
        SmartPhone p2 = new SmartPhone("Samsung",2200);
        SmartPhone p3 = new SmartPhone("Nokia",1400);
        SmartPhone p4 = new SmartPhone("LG",1800);
        
        SmartPhone[] phone = new SmartPhone[4];
        phone[0]=p1;
        phone[1]=p2;
        phone[2]=p3;
        phone[3]=p4;
        System.out.println("\nList of Smart Phone");
        for(SmartPhone p : phone){
            System.out.print(p);
        }
        int temp=0;
        System.out.println("\nList of Smart Phone in ascending order of the price:");
        for(int i=0;i<phone.length-1;i++){
//            for(int j=1;j<phone.length;j++){
//                if
//                    
//                }
//            }
        }
        //System.out.println(e.toString());
    }
    
}
