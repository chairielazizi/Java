/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl5q2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author chai
 */
public class DSL5Q2 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Stack<Integer> num = new Stack<>();
        Stack<String> operator = new Stack<>();
        
        FileReader fr = new FileReader("input.txt");
        BufferedReader bf = new BufferedReader(fr);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter infix operation : ");
        String infix = inputToInfix(bf.readLine());
        //String infi = br.readLine();
        System.out.println("Infix expression: "+infix);
        String postfix = infixtoPostfix(infix);
        System.out.println("Postfix expression: "+postfix);
        System.out.println("The result is: "+postfixEvaluate(postfix));
    }
    
    public static void processOperand(Stack<Integer> num,Stack<String> operator){
        String ope=operator.pop();
        int n1 = num.pop();
        int n2 = num.pop();
        if("add".equals(ope)){
            num.push(n1+n2);
        }
        else if("sub".equals(ope)){
            num.push(n1-n2);
        }
        else if("mul".equals(ope)){
            num.push(n1*n2);
        }
        else if("div".equals(ope)){
            num.push(n1/n2);
        }
        else if("mod".equals(ope)){
            num.push(n1%n2);
        }
    }
    
    public static String inputToInfix(String input){
        String output="";
        StringTokenizer st = new StringTokenizer(input);
        while(st.hasMoreTokens()){
            String in = st.nextToken();
            if(in.equals("add")){
                output += "+ ";
            }
            else if(in.equals("sub")){
                output += "- ";
            }
            else if(in.equals("mul")){
                output += "* ";
            }
            else if(in.equals("div")){
                output += "/ ";
            }
            else if(in.equals("mod")){
                output += "% ";
            }
            else if(in.equals("ob")){
                output += "( ";
            }
            else if(in.equals("cb")){
                output += ") ";
            }
            else{
                output += in + " ";
            }
        }
        return output;
    }
    
    public static int priority(String operator){
        if(operator.equals("+") || operator.equals("-")){
            return 1;
        }
        else if(operator.equals("*") || operator.equals("/")){
            return 2;
        }
        return 0;
    }
    public static boolean isOperand(String num){
        try{
            Integer.parseInt(num);
        }catch(NumberFormatException e){
            return false;
        }
        return true;
    }
    
    public static String infixtoPostfix(String infix){
        String[] list = infix.split(" ");
        Stack<String> stack = new Stack<>();
        String output="";
        for(int i=0;i<list.length;i++){
            // if is number
            if(isOperand(list[i])){
                output += list[i]+" ";
            }
            else if(list[i].equals("(")){
                stack.push("(");
            }
            else if(list[i].equals(")")){
                while(stack.getSize()>0 && stack.peek() != "("){
                    output += stack.pop()+" ";
                }
                if(stack.getSize()>0 && stack.peek() != "("){
                    return "invalid";
                }
                else if(stack.getSize()>0){
                    stack.pop();
                }
            }
            else{
                // if is operator
                while(stack.getSize()>0 && (priority(list[i]) < priority(stack.peek())) && !stack.peek().equals("(")){
                    output += stack.pop()+" ";
                }
                stack.push(list[i]);
            }
        }
        while(!stack.isEmpty()){
            output+=stack.pop()+" ";
        }
        //output=stack.peek();
        return output;
    }
    
    //geekforGeeks
    public static String infixtopostfix(String infix){
        String result="";
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<infix.length();i++){
            char c = infix.charAt(i);
            
            if(Character.isLetterOrDigit(c)){
                result+=c;
            }
            else if(c == '('){
                stack.push(c);
            }
            else if(c == ')'){
                while(!stack.isEmpty() && stack.peek()!= '('){
                    result += stack.pop();
                }
                if(!stack.isEmpty() && stack.peek()!= '('){
                    System.out.println("Invalid expression");
                }
                else{
                    stack.pop();
                }
            }
            else{//operator
                while(!stack.isEmpty() && priority(String.valueOf(c))<priority(String.valueOf(stack.peek()))){
                    if(stack.peek() == '(')
                        return "Invalid expression";
                    result += stack.pop();
                }
                stack.push(c);
            }
            
        }
        while(!stack.isEmpty()){
            if(stack.peek() == '(')
                return "Invalid expression";
            result += stack.pop();
        }
        return result;
    }
    
    public static int operation(int a,int b,String c){
        if(c.equals("+")){
            return a+b;
        }
        else if(c.equals("-")){
            return a-b;
        }
        else if(c.equals("*")){
            return a*b;
        }
        else if(c.equals("/")){
            return a/b;
        }
        else if(c.equals("%")){
            return a%b;
        }
        return 0;
    }
    
    public static String postfixEvaluate(String infix){
        StringTokenizer st = new StringTokenizer(infix);
        Stack<Integer> stack = new Stack<>();
        while(st.hasMoreTokens()){
            String in=st.nextToken();
            if(isOperand(in)){
                //if is number
                stack.push(Integer.parseInt(in));
            }
            else{
                //if is operator
                if(stack.getSize()<2){
                    return "Invalid postfix";
                }
                stack.push(operation(stack.pop(),stack.pop(),in));
            }
        }
        if(stack.getSize() != 1){
            return "No integer error";
        }
        return Integer.toString(stack.pop());
    }
    
    
    
    
    
    static int Prec(char ch) 
    { 
        switch (ch) 
        { 
        case '+': 
        case '-': 
            return 1; 
       
        case '*': 
        case '/': 
            return 2; 
       
        case '^': 
            return 3; 
        } 
        return -1; 
    } 
       
    // The main method that converts given infix expression 
    // to postfix expression.  
    private static String InfixToPostfix(String exp) 
    { 
        // initializing empty String for result 
        String result = new String(""); 
          
        // initializing empty stack 
        Stack<Character> stack = new Stack<>(); 
          
        for (int i = 0; i<exp.length(); ++i) 
        { 
            char c = exp.charAt(i); 
              
             // If the scanned character is an operand, add it to output. 
            if (Character.isLetterOrDigit(c)) 
                result += c; 
               
            // If the scanned character is an '(', push it to the stack. 
            else if (c == '(') 
                stack.push(c); 
              
            //  If the scanned character is an ')', pop and output from the stack  
            // until an '(' is encountered. 
            else if (c == ')') 
            { 
                while (!stack.isEmpty() && stack.peek() != '(') 
                    result += stack.pop(); 
                  
                if (!stack.isEmpty() && stack.peek() != '(') 
                    return "Invalid Expression"; // invalid expression                 
                else
                    stack.pop(); 
            } 
            else // an operator is encountered 
            { 
                while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())){ 
                    if(stack.peek() == '(') 
                        return "Invalid Expression"; 
                    result += stack.pop(); 
             } 
                stack.push(c); 
            } 
       
        } 
       
        // pop all the operators from the stack 
        while (!stack.isEmpty()){ 
            if(stack.peek() == '(') 
                return "Invalid Expression"; 
            result += stack.pop(); 
         } 
        return result; 
    }
    /*
    public static boolean isOperator(String c)
{
	if(c=="(")
		return true;
	if(c==")")
		return true;
	if(c=="+")
		return true;
	if(c=="-")
		return true;
	if(c=="*")
		return true;
	if(c=="/")
		return true;
	if(c=="%")
		return true;
	return false;
}
*/
    public static String ItoP(String infix){
        //String[] list = infix.split(" ");
        String result="";
        char c =' ';
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<infix.length();i++){
            if(Character.isLetterOrDigit(infix.charAt(i))){
                result += infix.charAt(i);
            }
            else if(infix.charAt(i)=='(')
                stack.push(infix.charAt(i));
            else if(infix.charAt(i)==')'){
                c = stack.pop();
                while(c != '('){
                    result += c;
                    c = stack.pop();
                }
            }
            else{
                if(!stack.isEmpty()){
                    if(stack.peek()=='('){
                        stack.push(infix.charAt(i));
                    }
                    else{
                        c = stack.peek();
                        while(Prec(infix.charAt(i)) <= Prec(c)){
                            result += stack.pop();
                            if(!stack.isEmpty()){
                                c = stack.peek();
                                if(c == '(')
                                    break;
                            }
                            else
                                break;
                        }
                        stack.push(infix.charAt(i));
                    }
                }
                else
                    stack.push(infix.charAt(i));
            }
        }
        while(!stack.isEmpty()){
            result += stack.pop();
        }
        return result;
    }
    
}
