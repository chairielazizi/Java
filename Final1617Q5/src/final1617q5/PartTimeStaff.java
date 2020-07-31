package final1617q5;

public class PartTimeStaff extends Staff {
    private int workinghour;
    private int salary;

    public PartTimeStaff(String name, String ic,int workinghour) {
        super(name, ic);
        this.workinghour = workinghour;
    }
    
    public int getSalary(){
        salary = 40 * workinghour;
        return salary;
    }
    
    public String toString() {
        return super.toString()+"Working hours: " + workinghour + "\nSalary: RM " + getSalary();
    }
    
    
}
