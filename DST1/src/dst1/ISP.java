package dst1;

public class ISP {
    protected int name;
    protected int gb;

    public ISP(int name, int gb) {
        this.name = name;
        this.gb = gb;
    }

    
    
    public String toString() {
        return name+"Mbps Subscription and "+gb+" GB";
    }
    
    
}
