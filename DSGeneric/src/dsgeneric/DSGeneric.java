/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsgeneric;

/**
 *
 * @author user
 */

//Generic class 1
class Test<T>{
    private T t;
    public Test(T t){
        this.t=t;
    }
    public void set(T t){
        this.t=t;
    }
    public T get(){
        return t;
    }
    public String toString(){
        return t + "";
    }
}
//Generic class 2
class Test2<T,U>{
    private T t;
    private U[] u;
    public Test2(T t,U[] u){
        this.t=t;
        this.u=u;
    }
    public void setT(T t){
        this.t=t;
    }
    public T getT(){
        return t;
    }
    public void setU(U[] u){
        this.u=u;
    }
    public U[] getU(){
        return u;
    }
    public String toString(){
        String a = "";
        a = "T is " + getT() + "\n";
        for(U value : u){
            a += value + " ";
        }
        return a;
    }
}
//Generic class 3
class Pair<K,V>{
    private K key;
    private V value;
    
    public Pair(){
        this.key=key;
        this.value=value;
    }
    
    public void setKey(K k){
        this.key=key;
    }
    public K getKey(){
        return key;
    }
    public void setValue(V v){
        this.value=value;
    }
    public V getValue(){
        return value;
    }
}
class util{
    public static<K,V> boolean compare(Pair<K,V>p1,Pair<K,V>p2){
        return p1.getKey().equals(p2.getKey()) &&
                p1.getValue().equals(p2.getValue());
    }
}

public class DSGeneric {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Test<Integer> a = new Test<>(555666);
        Test<Double> b = new Test<>(364.75);
        Test<String> c = new Test<>("Corona");
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        
        String[] str = {"one","two","three"};
        Test2<Integer,String> d = new Test2<>(100,str);
        System.out.println(d.toString());
        
//        Pair<Integer,String> e = new Pair<>(1,"saya");
//        Pair<Integer,String> f = new Pair<>(2,"kamu");
    }
    
}
