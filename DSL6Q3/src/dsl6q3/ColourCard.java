package dsl6q3;

public class ColourCard implements Comparable<ColourCard> {
    private int number;
    private int colour;
    
    public ColourCard(int number,int colour){
        this.number = number;
        this.colour = colour;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getColour() {
        return colour;
    }

    public void setColour(int colour) {
        this.colour = colour;
    }
    
    public String card(){
        String card ="";
        switch(number){
            case 1:
                card="One";
                break;
            case 2:
                card="Two";
                break;
            case 3:
                card="Three";
                break;
            case 4:
                card="Four";
                break;
            case 5:
                card="Five";
                break;
            case 6:
                card="Six";
                break;
            case 7:
                card="Seven";
                break;
            case 8:
                card="Eight";
                break;
            case 9:
                card="Nine";
                break;
            case 10:
                card="Ten";
                break;
        }
        switch(colour){
            case 1: card += " Blue"; break;
            case 2: card += " Green"; break;
            case 3: card += " Red"; break;
            case 4: card += " Yellow"; break;
        }
        return card;
    }
    
    @Override
    public int compareTo(ColourCard card){
        if(number > card.getNumber())
            return 1;
        else if(number < card.getNumber())
            return -1;
        else {
            if(colour < card.getColour())
                return 1;
            else
                return -1;
        }
    }

    @Override
    public String toString() {
        return card();
    }
    
}
