/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl1q3;

/**
 *
 * @author wif190007
 */
public class DSL1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimpleNetwork host1 = new SimpleNetwork("Host 1",new int[]{10,1,1,1},new int[]{255,255,255,224},true);
        SimpleNetwork host2 = new SimpleNetwork("Host 2",new int[]{10,1,1,2},new int[]{255,255,255,224},false);
        SimpleNetwork host3 = new SimpleNetwork("Host 3",new int[]{10,1,1,70},new int[]{255,255,255,224},true);
        SimpleNetwork host4 = new SimpleNetwork("Host 4",new int[]{10,1,1,15},new int[]{255,255,255,224},true);
        
        host1.ping(host2);
        host1.ping(host3);
        host1.ping(host4);
    }
    
}
