package week11;

import java.util.Scanner;

public class Rectangle extends Shape {
    private double width, length;
    public Rectangle() {
        super("Rectangle");
    }
    public void input() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Width: ");
        width=s.nextDouble();
        System.out.print("Enter Length: ");
        length=s.nextDouble();
    }
    public void compute() {
        perimeter = 2 * (width+length);
        area = width*length;
    }     
 }
