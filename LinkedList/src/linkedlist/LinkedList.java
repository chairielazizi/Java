/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author 17110481
 */
public class LinkedList<T extends Comparable<T>> {
    private ListNode head;
    
    public LinkedList(){
        head = null;
    }
    
    public void clear(){
        head = null;
    }
    
    public boolean isEmpty(){
        return (head == null);
    }
    public int length(){
        int count = 0;
        ListNode currentNode = head;
        while(currentNode!=null){
            currentNode = currentNode.getLink();
            count++;
        }
        return count;
    }
    public void showList(){
        ListNode currentNode = head;
        while(currentNode!=null){
            System.out.print(currentNode.toString());
            currentNode = currentNode.getLink();
        }
        System.out.println();
    }
    
    public T get(int index){
        if(index==0){
            if(head!=null){
                return (T)head.getData();
            }
            else{
                return null;
            }
        }
        else if(index==length()-1){
            if(head!=null){
                ListNode currentNode = head;
            while(currentNode.getLink()!= null){
                currentNode = currentNode.getLink();
            }
            return (T) currentNode.getData();
            }
            else{
                return null;
            }
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
    
    public void deleteNode(){
        ListNode currentNode = head;
        ListNode previousNode = head;
        if(head != null){
            if(currentNode.getLink() == null){
                head = null;
            }
            else{
                while(currentNode.getLink() != null){
                    previousNode = currentNode;
                    currentNode = currentNode.getLink();
                }
            }
            previousNode.setLink(null);
        }
        else{
            System.out.println("The list is empty");
        }
    }
    
    public boolean addSpecialNode(T a){
        ListNode currentNode = head;
        ListNode newNode = new ListNode(a,null);
        
        String node;
        String data = String.valueOf(a);
        
//        Integer firstDigit = Integer.parseInt(Integer.toString(a).substring(0, 1));
//        while(currentNode.getLink()!=null){
//            Integer b = (int) currentNode.getData()%100;
//            if(firstDigit.compareTo((Integer) a)==0){
//                
//            }
//        }
        
        if(isEmpty()){
            head = newNode;
            return true;
        }
        else{
            while(currentNode.getLink()!=null){
                currentNode = currentNode.getLink();
            }
            node = String.valueOf(currentNode.getData());
            
            if(node.charAt(node.length()-1)==data.charAt(0)){
                currentNode.setLink(newNode);
                return true;
            }
            else{
                return false;
            }
        }
    }
    
}




class ListNode<T>{
    private T data;
    private ListNode link;
    
    public ListNode(){
        data = null;
        link = null;
    }
    public ListNode(T a,ListNode b){
        data = a;
        link = b;
    }
    
    public void setData(T a){
        data = a;
    }
    public T getData(){
        return data;
    }
    
    public void setLink(ListNode a){
        link = a;
    }
    public ListNode getLink(){
        return link;
    }
    
    public String toString(){
        return data+" --> ";
    }
}