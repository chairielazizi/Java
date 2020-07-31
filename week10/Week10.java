package week10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Week10 {

    public static void main(String[] args) {
        /*
        Student a = new Student();
        a.setFullName("Ali");
        a.setMatricNumber("WIF20001");
        a.setCity("Ipoh");
        a.setEmail("ali@yahoo.com");
        a.setHeight(1.76);
        a.setAge(19);
        System.out.println(a.toString());
        System.out.println("Student from " + a.getCity());
        
        Student b = new Student("Siti", "WIF20002", "siti@gmail.com",
        "Petaling Jaya", 1.57, 18);
        System.out.println(b.toString());
        */
        /*
        try {
           int numOfRecord=0;
           Scanner s = new Scanner(new FileInputStream("data.txt"));
           while(s.hasNextLine()) {
             for(int i=1; i<=6; i++) {
               s.nextLine();
             } 
             numOfRecord++;
           }
           s.close();
           
           Student[] c = new Student[numOfRecord];
           s = new Scanner(new FileInputStream("data.txt"));
           for(int i=0; i<c.length; i++) {
                c[i] = new Student(s.nextLine(), s.nextLine(),
                                   s.nextLine(), s.nextLine(),
                                Double.parseDouble(s.nextLine()),
                                Integer.parseInt(s.nextLine()));                               
           }           
           s.close();
           System.out.println("Number of record :" + numOfRecord);
           for(int i=0; i<c.length; i++) {
                System.out.println(c[i].toString());
           }
        } catch (FileNotFoundException e) {
            System.out.println("File was not found"); 
        }
       */
        /*
        Number a = new Number();
        System.out.println(a.toString());
        System.out.println("Even Number : " + a.even());

        Number b = new Number(5); 
        System.out.println(b.toString());
        System.out.println("Even Number : " + b.even());

        Number c = new Number(40, 50); 
        System.out.println(c.toString());
        System.out.println("Even Number : " + c.even());
        */
        Cat a = new Cat("Kitty");
        System.out.println(a.toString());
        System.out.println("The number is " + a.getNumber());                            
        Cat c = new Cat(a);
        System.out.println(c.toString());
        System.out.println("The number is " + c.getNumber());        
        
        /*
        Cat b = a;
        System.out.println(b.toString());
        */
    }
    
}
