package dst1;

public class SmartPhone implements Model{
    private String model;
    private int price;

    public SmartPhone(String model, int price) {
        this.model = model;
        this.price = price;
    }
    
    public String toString() {
        return model+" (RM"+price+") ";
    }
    
    
}
