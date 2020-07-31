/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl5q1;

/**
 *
 * @author user
 */
public class DSL5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("The candies in the container:");
        Stack<String> s1 = new Stack<>();
        s1.push("Orange");
        s1.push("Red");
        s1.push("Blue");
        s1.push("Orange");
        s1.push("Yellow");
        s1.push("Yellow");
        s1.push("Blue");
        s1.showStack();
        System.out.println("Ali takes all the candies one by one from the container and eats the blue ones.");
        System.out.println("He puts back the rest of candies in the container.");
        System.out.println("The candies in the container:");
        
        Stack<String> newcandies = new Stack<>();
        while(!s1.isEmpty()){
            String leftcandies = s1.pop();
            if(!leftcandies.contains("Blue")){
                newcandies.push(leftcandies);
            }
        }
        newcandies.showStack();
        
        /*
        for(int i=0;i<5;i++){
            s1.pop();
        }
        s1.push("Orange");
        s1.push("Yellow");
        s1.push("Yellow");
        s1.showStack();
        */
        
        //Q2
        Stack<Integer> num = new Stack<>();
        Stack<String> operator = new Stack<>();
        
        System.out.print("Enter infix operation : ");
        
    }
    
    public static void processOperand(Stack<Integer> num,Stack<String> operator){
        String op = operator.pop();
        int num1 = num.pop();
        int num2 = num.pop();
        if("add".equals(op)){
            num.push(num1 + num2);
        }
        else if("sub".equals(op)){
            num.push(num1 - num2);
        }
        else if("mul".equals(op)){
            num.push(num1 * num2);
        }
        else if("div".equals(op)){
            num.push(num1 / num2);
        }else if("mod".equals(op)){
            num.push(num1 % num2);
        }
    }
    
    public static void infix(Stack<Integer> num,Stack<String> operand){
        
    }
    
    
    
    
}
