package final1617q5;

public class PermanentStaff extends Staff{
    private String grade;
    private int salary;
    
    public int getSalary(){
        
        if(grade.equals("EM01")){
            salary=7000;
        }
        else if(grade.equals("EM02")){
            salary=5000;
        }
        else if(grade.equals("EM03")){
            salary=3000;
        }
        else if(grade.equals("EM04")){
            salary=1000;
        }
        
        return salary;
    }

    public PermanentStaff(String name, String ic,String grade) {
        super(name, ic);
        this.grade = grade;
        this.salary = salary;
    }
    
    public String toString() {
        return super.toString()+ "Grade: " + grade + "\nSalary: RM " + getSalary();
    }
    
}
