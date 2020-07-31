package final1819q5;

public class SpecialDelivery extends Delivery{
    private boolean weekend;
    private boolean night;

    public SpecialDelivery(String sendername, String recipientname, double weight,boolean weekend, boolean night) {
        super(sendername, recipientname, weight);
        this.weekend = weekend;
        this.night = night;
    }
    
    public double totalCost(){
        double cost=0;
        if(weekend==true && night==true){
            
            if(weight<=5){
                cost=(2.8*weight + 50)*1.2;
            }
            else if(weight>5 && weight<=20){
                cost=((2.8*5 + 5.2*(weight-5)+50))*1.2;
            }
            else if(weight>20 && weight<=50){
                cost=((2.8*5 + 5.2*15 + 7.0*(weight-20)+50))*1.2;
            }
            else if(weight>50){
                cost=((2.8*5 + 5.2*15 + 7.0*30 + 8.6*(weight-50)+50))*1.2;
            }
            //System.out.println("Weekend Delivery\nNight Time Delivery");
        }
        else if(weekend==true){
            if(weight<=5){
                cost=2.8*weight+50;
            }
            else if(weight>5 && weight<=20){
                cost=2.8*5 + 5.2*(weight-5)+50;
            }
            else if(weight>20 && weight<=50){
                cost=2.8*5 + 5.2*15 + 7.0*(weight-20)+50;
            }
            else if(weight>50){
                cost=2.8*5 + 5.2*15 + 7.0*30 + 8.6*(weight-50)+50;
            }
            //System.out.println("Weekend Delivery");
        }
        else if(night==true){
            if(weight<=5){
                cost=2.8*weight*1.2;
            }
            else if(weight>5 && weight<=20){
                cost=(2.8*5 + 5.2*(weight-5))*1.2;
            }
            else if(weight>20 && weight<=50){
                cost=(2.8*5 + 5.2*15 + 7.0*(weight-20))*1.2;
            }
            else if(weight>50){
                cost=(2.8*5 + 5.2*15 + 7.0*30 + 8.6*(weight-50))*1.2;
            }
            //System.out.println("Night Time Delivery");
        }
        else{
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
        }
        return cost;
    }
    
    public String toString() {
        //return super.toString();//+totalCost();
        if(weekend==true && night==true)
            return super.toString()+"\nWeekend Delivery\nNight Time Delivery";
        else if(weekend==true)
            return super.toString()+"\nWeekend Delivery";
        else if(night==true)
            return super.toString()+"\nNight Time Delivery";
        return toString();
    }
}
