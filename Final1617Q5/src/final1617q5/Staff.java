package final1617q5;


public class Staff {
    protected String name;
    protected String ic;

    public Staff(String name, String ic) {
        this.name = name;
        this.ic = ic;
    }

    public String getName() {
        return name;
    }

    public String getIc() {
        return ic;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }
    
    public String toString() {
        return "Name:" + name + "\nIC: " + ic + "\n";
    }
    
    
    
}
