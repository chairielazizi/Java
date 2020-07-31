/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl1q4;

/**
 *
 * @author wif190007
 */
abstract class BigCharacter{
    public abstract char[][] getBigCharacter();
}

abstract class BigChar extends BigCharacter{
    char[][] bigChar;
    
    public BigChar(char character){
        bigChar = new char[5][5];
        if(character == 'F'){
            bigChar = new char[][]{
                {'*','*','*',' ',' '},
                {'*',' ',' ',' ',' '},
                {'*','*',' ',' ',' '},
                {'*',' ',' ',' ',' '},
                {'*',' ',' ',' ',' '},
            };
        }
    }
}

public char[][] getBigCharacter(){
    return bigChar;
} 

public class DSL1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BigCharacter[] arr = new BigCharacter[] {new BigChar('F')};
        for(int i=0;i<5;i++){
            for(BigCharacter b : arr){
                char[] tmp = b.getBigCharacter()[i];
                for(char t : tmp){
                    System.out.println(t);
                }
                System.out.println(" ");
            }
            System.out.println();
        }
    }
    
}
