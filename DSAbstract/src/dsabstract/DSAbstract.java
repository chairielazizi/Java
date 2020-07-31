/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsabstract;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author user
 */
interface SimpleLog<T>{
    public void insert(T t);
    //public T isFull();
    public boolean isFull();
    //public void size();
    public int size();
    //public T contain();
    public boolean contain(T t);
    public void clear();
    public String toString();
}

//ArrayList Implementation
class ArrayListLog<T extends Comparable<T>> implements SimpleLog<T>{
    private ArrayList<T> log;
    private int maxsize;
    
    public ArrayListLog(int a){
        maxsize = a;
        log = new ArrayList<>();
    }
    
    public void insert(T t){
        if(!isFull()){
            log.add(t);
        }
        else{
            System.out.println("The log is full");
        }
    }
    public boolean isFull(){
        return (maxsize==log.size());
    }
    public int size(){
        return log.size();
    }
    public boolean contain(T t){
        for(int i=0;i<size();i++){
            if(log.get(i).compareTo(t)==0){
                return true;
            }
        }
        return false;   
    }
    public void clear(){
        for(int i=size()-1;i>=0;i--){
            log.remove(i);
        }
    }
    public String toString(){
        String str="";
        for(int i=0;i<size();i++){
            str += log.get(i) + " ";
        }
        return str;
    }
}
////////////////////////////////////////////////////////////////////
//LinkedList implementation
class LinkedListLog<T extends Comparable<T>> implements SimpleLog<T>{
    private LinkedList<T> link;
    private int maxsize;
    
    public LinkedListLog(int a){
        maxsize = a;
        link = new LinkedList<>();
    }
    public void insert(T t){
        if(!isFull()){
            link.add(t);
        }
        else{
            System.out.println("The log is already full");
        }
    }
    public boolean isFull(){
        return (maxsize==link.size());
    }
    public int size(){
        return link.size();
    }
    public boolean contain(T t){
        for(int i=0;i<size();i++){
            if(link.get(i).compareTo(t)==0){
                return true;
            }
        }
        return false;
    }
    public void clear(){
        for(int i=size()-1;i>=0;i--){
            link.remove(i);
        }
    }
    public String toString(){
        String str = "";
        for(int i=0;i<size();i++){
            str += link.get(i) + " ";
        }
        return str;
    }
}
///////////////////////////////////////////////////////////////////
//Array Implementation
class ArrayLog<T extends Comparable<T>> implements SimpleLog<T>{
    private T[] log;
    private int index,max;
    
    public ArrayLog(int a){
        index = -1;
        max = a;
        log = (T[]) new Comparable[10];
    }
    public void insert(T t){
        if(!isFull()){
            index++;
            log[index] = t;
        }
        else{
            System.out.println("The log is full");
        }
    }
    public boolean isFull(){
        return max==(index+1);
    }
    public int size(){
        return index+1;
    }
    public boolean contain(T t){
        for(int i=0;i<index;i++){
            if(log[i].compareTo(t)==0){
                return true;
            }
        }
        return false;
    }
    public void clear(){
        for(int i=0;i<=index;i++){
            log[i] = (T) null;
        }
        index =-1;
    }
    public String toString(){
        String str = "";
        for(int i=0;i<=index;i++){
            str += log[i] + " ";
        }
        return str;
    }
}
public class DSAbstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("ArrayList implementation");
        ArrayListLog<Integer> a = new ArrayListLog<>(10);
        a.insert(5);
        a.insert(50);
        a.insert(532);
        a.insert(5675);
        System.out.println("Log Size: " + a.size());
        System.out.println(a.toString());
        
        int n=55;
        if(a.contain(n)){
            System.out.println("The log contains "+n);
        }
        else{
            System.out.println("The log does not contain "+n);
        }
        System.out.println();
        ArrayListLog<String> b = new ArrayListLog<>(5);
        b.insert("Abu");
        b.insert("Ali");
        b.insert("Amin");
        b.insert("Jemah");
        b.insert("Aminah");
        b.insert("Razak");
        System.out.println(b.toString());
        
        String name = "Aminah";
        if(b.contain(name)){
            System.out.println("The log contains "+name);
        }
        else{
            System.out.println("The log does not cointans "+name);
        }
        b.clear();
        System.out.println("Log size is "+b.size());
        System.out.println();
        
        ////////////////////////////////////////////////////////////
        
        System.out.println("LinkedList implementation");
        LinkedListLog<Integer> c = new LinkedListLog<>(10);
        c.insert(5);
        c.insert(50);
        c.insert(532);
        c.insert(5675);
        System.out.println("Log Size: " + a.size());
        System.out.println(c.toString());
        
        int num=50;
        if(a.contain(n)){
            System.out.println("The log contains "+n);
        }
        else{
            System.out.println("The log does not contain "+n);
        }
        System.out.println();
        LinkedListLog<String> d = new LinkedListLog<>(5);
        d.insert("Adu");
        d.insert("Ali");
        d.insert("Amin");
        d.insert("Jemah");
        d.insert("Aminah");
        d.insert("Razak");
        System.out.println(d.toString());
        
        String nama = "Aminah";
        if(d.contain(nama)){
            System.out.println("The log contains "+nama);
        }
        else{
            System.out.println("The log does not contains "+nama);
        }
        d.clear();
        System.out.println("Log size is "+d.size());
    }
    
}
