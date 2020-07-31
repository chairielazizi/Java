/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l7q1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author wif190007
 */
public class L7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("course.dat"));
            String[] s = {"WXES116 Programming I","WXES115 Data Structure","WXES1110 Operating System","Computing Mathematics I"};
            

        }catch(IOException e){
            System.out.println("Problem with file output");
        }
    }
    
}
