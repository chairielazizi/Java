package dsl9q3;

interface Array<K,V>{
    public boolean isEmpty();
    public boolean isFull();
    public int getSize();
    public void clear();
    public void showHashTable();
    public boolean containsKey(Comparable<K> k);
    public boolean containsValue(Comparable<V> v);
    public V get(Comparable<K> k);
    public V put(Comparable<K> k,V v);
    public V remove(Comparable<K> k);
}

public class ArrayHashTable<K,V> implements Array<K,V> {
    private K[] karr;
    private V[] varr;
    private int index;
    private final int max = 20;
    private HashNode<K,V> [] hash;
    
    public ArrayHashTable(){
        index = -1;
        hash = new HashNode[max];
    }
    public boolean isEmpty(){
        return (getSize()==0);
    }
    public boolean isFull(){
        return (getSize()==max);
    }
    public int getSize(){
        int count=0;
        for(int i=0;i<max;i++){
            if(hash[i] != null){
                count++;
            }
        }
        return count;
    }
    public void clear(){
        for(int i=0;i<max;i++){
            hash[i]=null;
        }
    }
    public void showHashTable(){
        for(int i=0;i<max;i++){
            if(hash[i]!=null){
                System.out.print(hash[i].toString()+" ");
            }
        }
    }
    public boolean containsKey(Comparable<K> k){
        for(int i=0;i<hash.length;i++){
            if(hash[i] != null && k.compareTo(hash[i].getKey())==0){
                return true;
            }
        }
        return false;
    }
    public boolean containsValue(Comparable<V> v){
        for(int i=0;i<hash.length;i++){
            if(hash[i] != null && v.compareTo(hash[i].getValue())==0){
                return true;
            }
        }
        return false;
    }
    public V get(Comparable<K> k) {
        for(int i=0;i<max;i++){
            if(hash[i] != null && k.compareTo(hash[i].getKey())==0){
                return hash[i].getValue();
            }
        }
        return null;
    }
    public V put(Comparable<K> k, V v) {
        if(isFull()){
            System.out.println("Hash Table is full");
            return null;
        }
        if(containsKey(k)){
            for(int i=0;i<max;i++){
                if(hash[i]!=null && k.compareTo(hash[i].getKey())==0){
                    V temp =hash[i].getValue();
                    hash[i].setValue(v);
                    return temp;
                }
            }
        }
        else{
            for(int i=0;i<max;i++){
                if(hash[i] == null){
                    hash[i] = new HashNode(k,v);
                    break;
                }
            }
        }
        return null;
    }
    public V remove(Comparable<K> k) {
        if(isEmpty()){
            System.out.println("Hash Table is empty");
            return null;
        }
        else{
            for(int i=0;i<max;i++){
                if(hash[i]!=null && k.compareTo(hash[i].getKey())==0){
                    V v = hash[i].getValue();
                    hash[i]=null;
                    return v;
                }
            }
        }
        return null;
    }
}

class HashNode<K,V>{
    private K key;
    private V value;
    
    public HashNode(){
        key = null;
        value = null;
    }
    public HashNode(K key,V value){
        this.key = key;
        this.value = value;
    }
    public void setKey(K k){
        key = k;
    }
    public K getKey(){
        return key;
    }
    public void setValue(V v){
        value = v;
    }
    public V getValue(){
        return value;
    }
    public String toString(){
        return key+":"+value+" | ";
    }
}