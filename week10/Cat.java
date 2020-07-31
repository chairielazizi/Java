
package week10;

public class Cat {
    private String name;
    private static int number;
    
    public Cat(String name) {
        this.name = name;
        number++;                
    }
    
    public Cat(Cat kucing) {
        this.name = kucing.getName();
        number++; 
    }
        
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public String toString() {
        return "Name of the Cat : " + name;
    }

    public int getNumber() {
        return number;
    }
    
}
