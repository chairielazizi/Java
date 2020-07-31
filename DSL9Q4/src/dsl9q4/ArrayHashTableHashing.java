package dsl9q4;

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

public class ArrayHashTableHashing<K,V> implements Array<K,V>{
    private final int max = 20;
    private HashNode<K,V>[] hash;

    public ArrayHashTableHashing() {
        hash = new HashNode[max];
    }
    public int getHashkey(int value){
        return value % max;
    }
    public int probing(int count){
        return 1 * count;
    }
    public boolean isEmpty(){
        return getSize()==0;
    }
    public boolean isFull(){
        return getSize()==max;
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
            if(hash[i] != null)
                System.out.println(hash[i].toString());
        }
    }
    public boolean containsKey(Comparable<K> k){
        int hashkey = getHashkey((Integer) k);
        int index = hashkey;
        int probe = 1;
        if(hash[hashkey] != null && k.compareTo((K) hash[hashkey].getKey())==0){
            return true;
        }
        while(hash[index]!=null){
            index = hashkey + probing(probe);
            probe++;
            if(hash[index]!=null && k.compareTo((K)hash[index].getKey())==0){
                return true;
            }
        }
        return false;
    }
    public boolean containsValue(Comparable<V> v){
        for(int i=0;i<max;i++){
            if(hash[i] != null && v.compareTo((V) hash[i].getValue())==0)
                return true;
        }
        return false;
    }
    public V get(Comparable<K> k){
        int hashkey = getHashkey((Integer) k);
        int index = hashkey;
        int probe =1;
        if(hash[hashkey]!=null && k.compareTo(hash[hashkey].getKey())==0){
            return hash[hashkey].getValue();
        }
        while(hash[index]!=null){
            index = hashkey+probing(probe);
            probe++;
            if(hash[index]!=null && k.compareTo(hash[index].getKey())==0){
                return hash[index].getValue();
            }
        }
        return null;
    }
    public int location(Comparable<K> k){
        int hashkey = getHashkey((Integer)k);
        int index = hashkey;
        int probe=1;
        if(hash[hashkey]!=null && k.compareTo((K)hash[hashkey].getKey())==0){
            return hashkey;
        }
        while(hash[index]!=null){
            index = hashkey+probing(probe);
            probe++;
            if(hash[index]!=null && k.compareTo((K)hash[index].getKey())==0){
                return index;
            }
        }
        return -1;
    } 
    public V put(Comparable<K> k,V v){
        if(isFull()){
            System.out.println("HashTable is full");
            return null;
        }
        else{
            int hashkey = getHashkey((Integer)k);
            int index = hashkey;
            int probe =1;
            if(hash[hashkey]!=null && k.compareTo(hash[hashkey].getKey())==0){
                V temp = hash[hashkey].getValue();
                hash[hashkey].setValue(v);
                return temp;
            }
            while(hash[index]!=null){
                index = hashkey + probing(probe);
                probe++;
                if(hash[index]!=null && k.compareTo(hash[index].getKey())==0){
                    V temp = hash[index].getValue();
                    hash[index].setValue(v);
                    return temp;
                }
            }
            hash[index] = new HashNode(k,v);   
        }
        return null;
    }
    public V remove(Comparable<K> k){
        if(isEmpty()){
            System.out.println("HashTable is empty");
            return null;
        }
        else{
            int hashkey = getHashkey((Integer)k);
            int index = hashkey;
            int probe=1;
            if(hash[hashkey]!=null && k.compareTo((K)hash[hashkey].getKey())==0){
                V v = (V) hash[hashkey].getValue();
                hash[hashkey] = null;
                return v;
            }
            while(hash[index]!=null){
                index = hashkey + probing(probe);
                probe++;
                if(hash[index]!=null && k.compareTo((K)hash[index].getKey())==0){
                    V v = (V) hash[index].getValue();
                    hash[index] = null;
                    return v;
                }
            }
        return null;
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