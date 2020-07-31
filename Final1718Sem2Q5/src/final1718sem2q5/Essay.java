package final1718sem2q5;

public class Essay extends GradedActivity{
    private int grammar;
    private int spell;
    private int length;
    private int content;

    public Essay(int grammar, int spell, int length, int content) {
        this.grammar = grammar;
        this.spell = spell;
        this.length = length;
        this.content = content;
    }
    
    public String toString() {
        return "\nEssay score:"+"\nGrammar:" + grammar + "\nSpelling:" + spell + 
                "\nLength:" + length + "\nContent:" + content+super.toString();
    }
    
    
}
