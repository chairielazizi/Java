/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final1718sem2q5;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Final1718Sem2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        
        System.out.print("Enter the marks for Grammar(maximum 30 marks):");
        int a = s.nextInt();
        System.out.print("Enter the marks for Spelling(maximum 20 marks):");
        int b = s.nextInt();
        System.out.print("Enter the marks for Length(maximum 20 marks):");
        int c = s.nextInt();
        System.out.print("Enter the marks for Content(maximum 30 marks):");
        int d = s.nextInt();
        
        Essay essay = new Essay(a,b,c,d);
                
        GradedActivity activity = new GradedActivity();
        int score=a+b+c+d;
        System.out.println(score);
        activity.setScore(score);
        activity.getScore();
        
        System.out.println(essay.toString());
        System.out.println(activity.toString());
        
    }
    
}
