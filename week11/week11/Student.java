package week11;

public class Student extends Lecturer {
    private String matricNumber, fullName;

    public Student(String matricNumber, String fullName) {
        this.matricNumber = matricNumber;
        this.fullName = fullName;
    }

    public String getMatricNumber() {
        return matricNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setMatricNumber(String matricNumber) {
        this.matricNumber = matricNumber;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
    public String getExamTopic() {
        return examtopic;
    }
    
    public String toString() {
        return " Student Name : " + fullName + "\n" +
               " Matric Number : " + matricNumber + "\n" + 
               super.toString();
    }
}
