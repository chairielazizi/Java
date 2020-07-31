package week11;

public class Lecturer {
    protected String examtopic;
    private String grade;
    
    public Lecturer() {
        examtopic="Question 5 OOP";
        grade= "";
    }

    public Lecturer(String examtopic, String grade) {
        this.examtopic = examtopic;
        this.grade = grade;
    }

    public String getExamtopic() {
        return examtopic;
    }

    public String getGrade() {
        
        return grade;
    }

    public void setExamtopic(String examtopic) {
        this.examtopic = examtopic;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String toString() {
        return " Exam Topic from Lecturer " + examtopic + "\n" +
               " Student grade= " + grade + "\n";
    }
        
    public void checkresult(String matric) {
        if (matric.equals("WIC111")) {
            grade = "A";
        }
        else if (matric.equals("WIC222")) {
            grade = "B";
        }
        else {
            grade = "";
        }
    }
    
}
