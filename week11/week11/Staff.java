
package week11;

public class Staff {
    private String name, ic;

    public Staff(String name, String ic) {
        this.name = name;
        this.ic = ic;
    }

    public String toString() {
        return "Full Name: " + name + "\n" + "IC:" + ic + "\n";                  
    }
    
}
