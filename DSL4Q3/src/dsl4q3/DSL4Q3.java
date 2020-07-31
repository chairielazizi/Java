/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl4q3;

/**
 *
 * @author user
 */
public class DSL4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Course> list = new LinkedList<>();
        list.addNode(new Course("WXX101","Programming",5,'B'));
        list.addNode(new Course("WXX201","Networking",4,'C'));
        list.addNode(new Course("WXX301","Operating System",3,'A'));
        list.showList();
        getgrade(list);
    }
    
    public static void getgrade(LinkedList<Course> list){
        int totalpoint=0;
        int totalcredit=0;
        for(int i=0;i<list.length();i++){
            Course subject = list.get(i);
            int coursepoint=0;
            switch(subject.getGrade()){
                case 'A':coursepoint=4;
                break;
                case 'B':coursepoint=3;
                break;
                case 'C':coursepoint=2;
                break;
                case 'D':coursepoint=1;
                break;
                default:coursepoint=0;
            }
            totalpoint += coursepoint * subject.getCredit();
            totalcredit += subject.getCredit();
        }
        System.out.println("Total point is "+totalpoint);
        System.out.println("Total credit is "+totalcredit);
        double averagepoint = totalpoint/1.00/totalcredit;
        System.out.printf("Grade point average is %.2f\n",averagepoint);
    }
    
    
    
}
