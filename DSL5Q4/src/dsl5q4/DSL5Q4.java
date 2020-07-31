/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl5q4;

import java.util.Scanner;

/**
 *
 * @author chairiel
 */
public class DSL5Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.print("Enter a expression : ");
            String line = s.nextLine();
            if(line.equalsIgnoreCase("quit")){
                break;
            }
            checkExpression(line);
        }
    }
    public static void checkExpression(String line){
        Stack<Character> stack = new Stack<>();
        boolean escape = false;
        boolean balance = true;
        boolean extra = false;
        int i=0;
        
        for(;i<line.length();i++){
            char current = line.charAt(i);
            if(current == '\\'){
                escape=true;
                continue;
            }
            else if(escape != true &&(current=='{' || current=='[') || current=='('){
                stack.push(current);
            }
            else if(escape != true &&(current=='}' || current==']') || current==')'){
                switch(current){
                    case '}':
                        if(stack.isEmpty()){
                            extra =true;
                            balance =false;
                        }
                        else{
                            balance = stack.peek() == '{';
                        }
                        break;
                    case ']':
                        if(stack.isEmpty()){
                            extra = true;
                            balance = false;
                        }
                        else{
                            balance = stack.peek() == '[';
                        }
                        break;
                    case ')':
                        if(stack.isEmpty()){
                            extra = true;
                            balance = false;
                        }
                        else{
                            balance = stack.peek() == '(';
                        }
                        break;
                    default:
                        balance = false;
                }
                if(balance){
                    stack.pop();
                }
                else{
                    break;
                }
            }
            escape = false;
        }
        
        if(!stack.isEmpty() && balance==true){
            balance =false;
            i = line.length();
        }
        if(balance==true){
            System.out.println("The expression is balanced");
        }
        else{
            System.out.println(line);
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            if(extra==true){
                System.out.println("^ Extra "+line.charAt(i));
            }
            else{
                char missing= ' ';
                switch(stack.peek()){
                    case '{':
                        missing= '}';
                        break;
                    case '[':
                        missing= ']';
                        break;
                    case '(':
                        missing= ')';
                        break;
                    default:
                        missing= ' ';
                }
                System.out.println("^ Missing "+missing);
            }
        }
    }
}
