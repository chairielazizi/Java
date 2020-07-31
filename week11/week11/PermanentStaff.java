
package week11;

public class PermanentStaff extends Staff{
    private String grade;

    public PermanentStaff(String name, String ic, String grade) {
        super(name, ic);
        this.grade = grade;
    }
    
    public int getSalary() {
        if (grade.equals("EM01")) {
            return 7000;
        }
        else if (grade.equals("EM02")) {
            return 5000;
        }
        else if (grade.equals("EM03")) {
            return 3000;
        }
        else if (grade.equals("EM04")) {
            return 1000;
        }
        else
            return 0;
    }    

    public String toString() {
        return super.toString() + "Grade: " +  grade + "\n" + "Salary: " + getSalary(); 
    }
    
}
