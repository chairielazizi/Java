package week11;

public class Week11 {

    public static void main(String[] args) {
        Student a = new Student("WIC222", "Ang");        
         // use parent method
        a.checkresult("WIC222");       
        System.out.println(a.toString());
        
        
        //use parent protected variable
        System.out.println("Exam Topic :" + a.getExamTopic());
        
        PermanentStaff p1 = new PermanentStaff("Abdul Razak", "871001-14-1765", "EM02" );
        PartTimeStaff p2 = new PartTimeStaff("Tengku Ali", "911223-08-3301", 35);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        
        Rectangle r = new Rectangle();
        r.input();
        r.compute();
        r.display();
    }
    
}
