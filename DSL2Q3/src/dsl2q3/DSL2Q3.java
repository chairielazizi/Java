/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl2q3;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author user
 */ 
class card{
    String color,num;
    
    public card(String c,String n){
        color = c;
        num = n;
    }

    @Override
    public String toString() {
        return color + " " + num;
    }
}
interface unointerface{
    public void draw(int n);
}

class UNO implements unointerface{
    LinkedList<card> cardDeck;
    LinkedList<card> myCard;
    
    public UNO(LinkedList<card> cd){
        cardDeck = cd;
        myCard = new LinkedList<>();
    }

    @Override
    public void draw(int n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

public class DSL2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyUnoLinkedList uno1 = new MyUnoLinkedList();
        uno1.draw(4);
        System.out.println("Draw 4 cards");
        System.out.println(uno1.toString());
        
        uno1.draw(5);
        System.out.println("Draw 5 cards");
        System.out.println(uno1.toString());
    }
    
}

/*
interface uno{
    public void draw(int times);
    @Override
    public String toString();
}

class MyUnoLinkedList implements uno{
    private LinkedList<String> cards;
    private LinkedList<String> allCards=new LinkedList<String>(Arrays.asList(new String[]{
            "Yellow draw 4",
            "Red 9",
            "Red 5",
            "Red 1",
            "Green Stop",
            "Blue 6",
            "Red 7",
            "Draw 4"
            }));
    
    public MyUnoLinkedList(){
        this.cards= new LinkedList<String>();
        Collections.shuffle(allCards);
    }

    @Override
    public void draw(int times) {
        for(int i=0;i<times;i++){
            if(allCards.size()==0){
                break;
            }
            String draw = allCards.removeFirst();
            cards.add(draw);
        }
    }
    
    public String toString(){
        String result = "";
        for(String card:cards){
            result+= card;
            result += " :: ";
        }
        return result;
    }
}
*/