
package dsl4q3;

public class Course {
    private String coursecode;
    private String coursename;
    private int credit;
    private char grade;

    public Course(String coursecode, String coursename, int credit, char grade) {
        this.coursecode = coursecode;
        this.coursename = coursename;
        this.credit = credit;
        this.grade = grade;
    }

    public String getCoursecode() {
        return coursecode;
    }

    public String getCoursename() {
        return coursename;
    }

    public int getCredit() {
        return credit;
    }

    public char getGrade() {
        return grade;
    }

    public void setCoursecode(String coursecode) {
        this.coursecode = coursecode;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String toString() {
        return "Course Code:" + coursecode + " Course Name:" + coursename + " Credit:" + credit + " Grade:" + grade;
    }
    
    
}
