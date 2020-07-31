/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl2q2;

import java.util.ArrayList;

/**
 *
 * @author user
 */

interface SimpleLog{
    public boolean insert(String item);
    public boolean checkfull();
    public int size();
    public boolean contains(String item);
    public boolean delete(String item);
    public void display(); 
    public void clear();
}

 class TextFileLog implements SimpleLog{
     ArrayList<String> arr = new ArrayList<>();
     final int maxsize;
     
     public TextFileLog(int max){
          maxsize = max;
     }
     

    @Override
    public boolean insert(String item) {
        if(checkfull()){
            return false;
        }
        arr.add(item);
        return true;
        
    }

    @Override
    public boolean checkfull() {
        return arr.size() >= maxsize;
    }

    @Override
    public int size() {
        return arr.size();
    }

    @Override
    public boolean contains(String item) {
        return arr.contains(item);
    }

    @Override
    public boolean delete(String item) {
        return arr.remove(item);
    }

    @Override
    public void display() {
        for(String i : arr){
            System.out.println(i);
        }
    }

    @Override
    public void clear() {
        arr.clear();
    }
     
 }

public class DSL2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Create a text file log with maximum record equal to 5");
        SimpleLog log = new TextFileLog(5);
        log.insert("James");
        log.insert("Ahmad");
        log.insert("Siti");
        log.insert("Ramesh");
        log.insert("John");
        
        System.out.println("Text File Log Size "+log.size());
        log.display();
        
        System.out.println("\nAdding another record");
        if(!log.insert("Nani")){
            System.out.println("The log is full");
        }
        System.out.println("Searching for Siti in the file");
        if(log.contains("Siti")){
            System.out.println("Text file log contains Siti");
        }
        System.out.println("Clear the text file log");
        log.clear();
        System.out.println("Text File Log Size "+log.size());
    }
    
}
