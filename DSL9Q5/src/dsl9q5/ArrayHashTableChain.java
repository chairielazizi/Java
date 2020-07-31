package dsl9q5;

import java.util.LinkedList;

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

public class ArrayHashTableChain<K,V> implements Array<K,V>{
    private final int max = 20;
    private LinkedList<HashNode<K,V>>[] hash;
    
    public ArrayHashTableChain(){
        hash = new LinkedList[max];
    }
    public int getHashkey(int value){
        return value % max;
    }
    public boolean isEmpty(){
        return getArraySize()==0;
    }
    public boolean isFull(){
        return getArraySize()==max;
    }
    public int getArraySize(){
        int count =0;
        for(int i=0;i<max;i++){
            if(hash[i] != null)
                count++;
        }
        return count;
    }
    public int getSize(){
        int count=0;
        for(int i=0;i<max;i++){
            LinkedList<HashNode<K,V>> hashLinkedList = hash[i];
            if(hashLinkedList != null){
                count += hashLinkedList.size();
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
            LinkedList<HashNode<K,V>> hashLinkedList = hash[i];
            if(hashLinkedList != null){
                for(int j=0;j<hashLinkedList.size();j++){
                    System.out.println(hashLinkedList.get(j).toString());
                }
            }
        }
    }
    public boolean containsKey(Comparable<K> k){
        int hashkey = getHashkey((Integer)k);
        LinkedList<HashNode<K,V>> hashLinkedList = hash[hashkey];
        if(hashLinkedList != null){
            for(int i=0;i<hashLinkedList.size();i++){
                HashNode<K,V> hashes = hashLinkedList.get(i);
                if(k.compareTo(hashes.getKey())==0){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean containsValue(Comparable<V> v){
        for(int i=0;i<max;i++){
            LinkedList<HashNode<K,V>> hashLinkedList = hash[i];
            if(hashLinkedList != null){
                for(int j=0;j<hashLinkedList.size();i++){
                    HashNode<K,V> hashes = hashLinkedList.get(j);
                    if(v.compareTo(hashes.getValue())==0){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public V get(Comparable<K> k){
        int hashkey = getHashkey((Integer)k);
        LinkedList<HashNode<K,V>> hashLinkedList = hash[hashkey];
        if(hashLinkedList != null){
            for(int i=0;i<hashLinkedList.size();i++){
               HashNode<K,V> hashes = hashLinkedList.get(i);
               if(k.compareTo(hashes.getKey())==0){
                   return hashes.getValue();
               }
            }
        }
        return null;
    }
    
    public V put(Comparable<K> k,V v){
        if(isFull()){
            System.out.println("Hash Table is full");
            return null;
        }
        else{
            int hashkey = getHashkey((Integer)k);
            if(hash[hashkey] == null){
                hash[hashkey] = new LinkedList<>();
                hash[hashkey].add(new HashNode(k,v));
            }
            else{
                LinkedList<HashNode<K,V>> list = hash[hashkey];
                for(int i=0;i<list.size();i++){
                    HashNode<K,V> hashes = list.get(i);
                    if(k.compareTo(hashes.getKey())==0){
                        V data = hashes.getValue();
                        hashes.setValue(v);
                        return data;
                    }
                }
                list.add(new HashNode(k,v));
            }
        }
        return null;
    }
    public V remove(Comparable<K> k){
        int hashkey = getHashkey((Integer)k);
        LinkedList<HashNode<K,V>> hashLinkedList = hash[hashkey];
        if(hashLinkedList != null){
            for(int i=0;i<hashLinkedList.size();i++){
                HashNode<K,V> hashes = hashLinkedList.get(i);
                if(k.compareTo(hashes.getKey())==0){
                    V value = hashes.getValue();
                    hashLinkedList.remove(i);
                    return value;
                }
            }
        }
        return null;
    }
    public void printlocation(Comparable<K> k){
        int hashkey = getHashkey((Integer)k);
        LinkedList<HashNode<K,V>> hashLinkedList = hash[hashkey];
        if(hashLinkedList != null){
            for(int i=0;i<hashLinkedList.size();i++){
                HashNode<K,V> hashes = hashLinkedList.get(i);
                System.out.print(hashes.toString()+" --> ");
            }
            System.out.println();
        }
    }
    
}


class HashNode<K,V>{
    private K key;
    private V value;
    
    public HashNode(){
        key = null;
        value = null;
    }
    public HashNode(K k,V v){
        key = k;
        value = v;
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
        return key+":"+value+" ";
    }
}