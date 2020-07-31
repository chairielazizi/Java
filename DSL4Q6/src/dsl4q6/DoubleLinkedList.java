/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl4q6;

/**
 *
 * @author user
 */
public class DoubleLinkedList<T> {
    private DoubleListNode head;
    
    public DoubleLinkedList(){
        head = null;
    }
    public int length(){
        int count=0;
        DoubleListNode currentNode = head;
        while(currentNode != null){
            currentNode = currentNode.getNextLink();
            count++;
        }
        return count;
    }
    
    public void showList(){
        DoubleListNode currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.toString());
            currentNode = currentNode.getNextLink();
        }
    }
    
    public boolean isEmpty(){
        return head==null;
    }
    
    public void deleteLeftNode(){
        if(head != null){
            head = head.getNextLink();
            head.setPreviousLink(null);
        }
        else{
            System.out.println("List is empty");
        }
    }
    public void addLeftNode(T a){
        head = new DoubleListNode(a,null,head);
    }
    
    public void addRightNode(T a){
        DoubleListNode newNode = new DoubleListNode(a,null,null);
        DoubleListNode currentNode = head;
        if(head==null){
            head = newNode;
        }
        else{
            while(currentNode.getNextLink() != null){
                currentNode = currentNode.getNextLink();
            }
            currentNode.setNextLink(newNode);
            newNode.setPreviousLink(currentNode);
        }
    }
    public void deleteRightNode(){
        DoubleListNode currentNode = head;
        DoubleListNode previousNode = head;
        if(head != null){
            if(currentNode.getNextLink() == null){
                head = null;
            }
            else{
                while(currentNode.getNextLink() != null){
                    previousNode = currentNode;
                    currentNode = currentNode.getNextLink();
                }
                currentNode = null;
                previousNode.setNextLink(null);
            }
        }
        else{
            System.out.println("List is empty");
        }
    }
        
    public void addNodeByPosition(T a,int index){
        if(index==0){
            addLeftNode(a);
        }
        else if(index == length()){
            addRightNode(a);
        }
        else if(index>length()){
            System.out.println("Invalid index");
        }
        else{
            DoubleListNode newNode = new DoubleListNode(a,null,null);
            DoubleListNode currentNode = head;
            for(int i=1;i<index;i++){
                currentNode = currentNode.getNextLink();
            }
            DoubleListNode tempNode = currentNode.getNextLink();
            currentNode.setNextLink(newNode);
            newNode.setLink(currentNode, tempNode);
            if(tempNode != null){
                tempNode.setPreviousLink(newNode);
            }
        }
    }
    public void deleteNodeByPosition(int index){
        if(index==0){
            deleteLeftNode();
        }
        else if(index==length()-1){
            deleteRightNode();
        }
        else if(index>=length()){
            System.out.println("Invalid index");
        }
        else{
            DoubleListNode currentNode = head;
            for(int i=1;i<index;i++){
                currentNode = currentNode.getNextLink();
            }
            DoubleListNode tempNode = currentNode.getNextLink();
            currentNode.setNextLink(tempNode.getNextLink());
            if(tempNode.getNextLink() != null){
                tempNode.getNextLink().setPreviousLink(currentNode);
            }
            tempNode = null;
        }
    }
    
    public void removeEven(){
        DoubleListNode currentNode = head;
        DoubleListNode previousNode = head;
        
        if((int)currentNode.getData()%2 == 0){
            if(head != null){
                if(currentNode.getNextLink() == null){
                    head = null;
                }
                else{
                    while(currentNode.getNextLink() != null){
                        previousNode = currentNode;
                        currentNode = currentNode.getNextLink();
                    }
                    currentNode = null;
                    previousNode.setNextLink(null);
                }
            }
        }
        /*
        DoubleListNode currentNode = head;
        currentNode = currentNode.getNextLink();
        
        DoubleListNode tempNode = currentNode.getNextLink();
        do{
            if((int)currentNode.getData()%2 == 0){
                currentNode.setNextLink(tempNode.getNextLink());
                tempNode.getNextLink().setPreviousLink(currentNode);
                
                tempNode = null;
            }
        }while(tempNode.getNextLink() != null);
        */
//        if(head != null){
//            DoubleListNode currentNode = head;
//            do{
//                currentNode.getNextLink();
//                if((int)currentNode.getData()%2 == 0){
//                    deleteRightNode();
//                }
//            }while(currentNode.getNextLink() != null);
//        }
//        else{
//            System.out.println("not found");;
//        }
    }
}
