/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl5q3;

/**
 *
 * @author chairiel
 */


public class DSL5Q3 {

    /**
     * @param args the command line arguments
     */
    static Stack<Integer> stack = new Stack<>();
    static int board[][];
    static int N;
    
    public static void main(String[] args) {
        nqueen(4);
    }
    
    public static boolean validPosition(int num){
        Stack<Integer> tempstack = new Stack<>();
        boolean valid=true;
        int rowDiff=1;
        while(!stack.isEmpty()){
            int previous = stack.pop();
            if(previous == num || isDiagonal(num,previous,rowDiff)){
                valid = false;
                stack.push(previous);
                break;
            }
            tempstack.push(previous);
            rowDiff++;
        }
        while(!tempstack.isEmpty()){
            stack.push(tempstack.pop());
        }
        return valid;
    }
    
    public static boolean isDiagonal(int n1,int n2,int rowDiff){
        return (rowDiff == Math.abs(n2 - n1));
    }
    
    public static void nqueen(int size){
        System.out.println("Solving the "+size+" queen problem");
        int solution = 0;
        int currentpos = 1;
        while(true){
            boolean point = false;
            for(;currentpos<=size;currentpos++){
                if(validPosition(currentpos)){
                    stack.push(currentpos);
                    point=true;
                    currentpos=1;
                    break;
                }
            }
            if(!point){
                if(stack.isEmpty()){
                    break;
                }
                else{
                    currentpos=stack.pop();
                    currentpos++;
                }
            }
            if(stack.getSize()==size){
                solution++;
                while(!stack.isEmpty()){
                    int current = stack.pop();
                    for(int i=1;i<=size;i++){
                        if(current == i){
                            System.out.print("Q");
                        }
                        else{
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                    if(stack.isEmpty()){
                        currentpos = current +1;
                    }
                }
                System.out.println();
            }
        }
        System.out.println("The number of solution is "+solution);
    }
    
    public boolean isSafe(int row,int column){
        int i,j;
        for(i=0;i<column;i++){
            if(board[row][i]==1)
                return false;
        }
        for(i=row,j=column;i>=0 && j>=0;i--,j--){
            if(board[i][j]==1)
                return false;
        }
        for(i=row,j=column;j>=0 && i<N;i++,j--){
            if(board[i][j]==1)
                return false;
        }
        return true;
    }
}
