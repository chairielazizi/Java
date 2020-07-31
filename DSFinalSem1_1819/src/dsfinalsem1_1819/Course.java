
package dsfinalsem1_1819;

public class Course implements Comparable<Course> {
    private String subject;
    private int credit;
    
    public Course(String s,int c){
        subject = s;
        credit = c;
    }

    @Override
    public int compareTo(Course o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
