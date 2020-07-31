package dsl1q3;

public class SimpleNetwork {
    private String name;
    private int[]ip;
    private int[] subnet;
    private boolean status;

    public SimpleNetwork(String name, int[] ip, int[] subnet, boolean status) {
        this.name = name;
        this.ip = ip; 
        this.subnet = subnet;
        this.status = status;
    }
    
    public void ping(SimpleNetwork dest){
        if(!dest.status){
            System.out.printf("%s cannot ping %s because %s is down.\n",name,dest.name,dest.name);
            return;
        }
        else{
            for(int i=0;i<4;i++){
                if((ip[i] & subnet[i]) != (dest.ip[i] & subnet[i])){
                    System.out.printf("%s cannot ping %s because not in the same network.\n",name,dest.name);
                    return;
                }
                
            }
            System.out.printf("%s can ping %s\n",name,dest.name);
        }
    }
}
