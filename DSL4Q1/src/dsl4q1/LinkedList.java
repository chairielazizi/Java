/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl4q1;

/**
 *
 * @author user
 */
public class LinkedList<T extends Comparable<T>> {
    private ListNode head;
    
    public LinkedList(){
        head = null;
    }
    
    public int length(){
        int count=0;
        ListNode currentNode = head;
        while(currentNode != null){
            currentNode = currentNode.getLink();
            count++;
        }
        return count;
    }
    
    public void clear(){
        head = null;
    }
    
    public boolean isEmpty(){
        return (head==null);
    }
    
    public void showList(){
        ListNode currentNode = head;
        while(currentNode!=null){
            System.out.print(currentNode.toString());
            currentNode = currentNode.getLink();
        }
    }
    
    //insert at the back
    public void addNode(T a){
        ListNode newNode = new ListNode(a,null);
        ListNode currentNode = head;
        if(head==null){
            head = newNode;
        }
        else{
            while(currentNode.getLink()!=null){
                currentNode = currentNode.getLink();
            }
            currentNode.setLink(newNode);
        }
    }
    
    public void addFrontNode(T a){
        head = new ListNode(a,head);
    }
    
    public void setFront(T t){
        if(head!=null){
            head.setData(t);
        }
        else{
            System.out.println("Invalid list");
        }
    }
    
    public void setBack(T t){
        if(head!=null){
            ListNode currentNode = head;
            while(currentNode.getLink()!=null){
                currentNode = currentNode.getLink();
            }
            currentNode.setData(t);
        }
        else{
            System.out.println("Invalid list");
        }
    }
    
    public void set(T t,int index){
        if(index==0){
            setFront(t);
        }
        else if(index==length()-1){
            setBack(t);
        }
        else if(index>=length()){
            System.out.println("Invalid index");
        }
        else{
            ListNode currentNode = head;
            for(int i=1;i<=index;i++){
                currentNode = currentNode.getLink();
            }
            currentNode.setData(t);
        }
    }
    
    public T getFront(){
        if(head!=null){
            return (T) head.getData();
        }
        else{
            return null;
        }
    }
    
    public T getBack(){
        if(head!=null){
            ListNode currentNode = head;
            while(currentNode.getLink()!=null){
                currentNode = currentNode.getLink();
            }
            return (T) currentNode.getData();
        }
        else{
            return null;
        }
    }
    
    public T get(int index){
        if(index==0){
            return getFront();
        }
        else if(index==length()-1){
            return getBack();
        }
        else if(index>=length()){
            return null;
        }
        else{
            ListNode currentNode = head;
            for(int i=1;i<=index;i++){
                currentNode = currentNode.getLink();
            }
            return (T) currentNode.getData();
        }
    }
    
    public void addSort(T t){
        if(isEmpty()){
            addNode(t);
        }
        else{
            ListNode currentNodeBigger = head;
            if(t.compareTo((T)currentNodeBigger.getData())<0){
                addFrontNode(t);
            }
            else{
                ListNode currentNode = head;
                while(true){
                    if(currentNode.getLink()!=null){
                        if(t.compareTo((T)currentNode.getLink().getData())<0){
                            ListNode newNode = new ListNode(t,currentNode.getLink());
                            currentNode.setLink(newNode);
                            break;
                        }
                        else{
                            currentNode = currentNode.getLink();
                        }
                    }
                    else{// add last element
                        ListNode newNode = new ListNode(t,null);
                        currentNode.setLink(newNode);
                        break;
                    }
                }
            }
        }
    }
}
