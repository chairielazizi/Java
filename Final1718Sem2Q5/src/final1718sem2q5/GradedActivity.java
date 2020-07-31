package final1718sem2q5;

public class GradedActivity {
    protected int score;

    public GradedActivity() {
        score=0;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
    public String getGrade(){
        String grade="";
        if(score>=90){
            grade="A";
        }
        else if(score>=80 && score<90){
            grade="B";
        }
        else if(score>=70 && score<80){
            grade="C";
        }
        else if(score>=60 && score<70){
            grade="D";
        }
        else if(score<60){
            grade="F";
        }
        
        return grade;
    }
    
    public String toString() {
        return "\nScore: " + getScore() + "\nGrade: "+getGrade();
    }
    
    
    
}
