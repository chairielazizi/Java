package final1819q5;

public class Delivery {
    protected String sendername;
    protected String recipientname;
    protected double weight;

    public Delivery(String sendername, String recipientname, double weight) {
        this.sendername = sendername;
        this.recipientname = recipientname;
        this.weight = weight;
    }
    
    public double totalCost(){
        double cost=0;
        if(weight<=5){
            cost=2.8*weight;
        }
        else if(weight>5 && weight<=20){
            cost=2.8*5 + 5.2*(weight-5);
        }
        else if(weight>20 && weight<=50){
            cost=2.8*5 + 5.2*15 + 7.0*(weight-20);
        }
        else if(weight>50){
            cost=2.8*5 + 5.2*15 + 7.0*30 + 8.6*(weight-50);
        }
        return cost;
    }
    
    public String toString() {
        return "From : "+sendername + " To: "+recipientname+ "\nWeight of package : " + weight + "\nShipping Cost : RM"+totalCost();
    }
    
    
    
}
