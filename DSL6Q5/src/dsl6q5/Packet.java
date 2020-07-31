package dsl6q5;

public class Packet implements Comparable<Packet> {
    private String type;
    private int priority;

    public Packet(String type, int priority) {
        this.type = type;
        this.priority = priority;
    }

    public String getType() {
        return type;
    }

    public int getPriority() {
        return priority;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Type= " + type + ",(Priority=" + priority + ')';
    }
    
    public int compareTo(Packet a){
        return priority - a.priority;
    }
}
