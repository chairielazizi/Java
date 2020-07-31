package dsl6q4;

import java.util.LinkedList;


public class Share {
    private Queue<ShareOrder> queuestock;
    
    public Share(){
        //queuestock = new LinkedList<>();
    }
    public String getStock(){
        return queuestock.toString();
    }
}

class ShareOrder{
    private int quantity;
    private double price;
    
    public ShareOrder(int quantity,double price){
        this.quantity = quantity;
        this.price = price;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public double getPrice(){
        return this.price;
    }
    public String toString(){
        return quantity+" "+price;
    }
}