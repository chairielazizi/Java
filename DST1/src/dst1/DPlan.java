package dst1;

public class DPlan extends ISP {
    private double price;

    public DPlan(int name, int gb) {
        super(name, gb);
        //this.price = price;
    }

    
    
    public double plan(){
       price = 10*super.name + 0.2*super.gb;
       
       return price;
    }
    
    public String toString() {
        return super.toString()+"\nPlan: DPlanwith price RM: " + plan();
    }
    
    
}
