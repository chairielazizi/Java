package dst1;

import java.util.Scanner;

public class Sentence {
    Scanner s = new Scanner(System.in);
    private int length;
    private int vowel;
    private int word;

    public Sentence(String ayat) {
        this.length = ayat.length();
        this.vowel = 0;
        this.word = 0;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setVowel(int vowel) {
        this.vowel = vowel;
    }

    public void setWord(int word) {
        this.word = word;
    }

    public int getLength() {
        return length;
    }

    public int getVowel() {
        return vowel;
    }

    public int getWord() {
        return word;
    }
    
    public int vowell(String ayat){
       for(int i=0;i<ayat.length();i++){
           char ch = ayat.charAt(i);
           if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
               vowel++;
           }
       }
       return vowel;
    }
    
    public int wordd(String ayat){
        for(int i=0;i<ayat.length()-1;i++){
            //char ch = ayat.charAt(i);
            if(ayat.charAt(i)==' ' && ayat.charAt(i+1)!=' '){
                word++;
            }
        }
        return word;
    }
    
    public String toString() {
        return "The length of the sentence : "+length+
                "\nThe number of vowels : "+vowel+
                "\nThe number of words : "+(word+1)+"\n";
    }
    
    
    
    
    
}
