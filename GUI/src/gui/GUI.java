/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.table.TableColumn;
import javax.swing.JFrame;
import java.awt.Color;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class GUI extends JFrame{

    /**
     * @param args the command line arguments
     */
    
        //   int[][]check=new int[][];
    public GUI(){
    setTitle("Planning");
    setSize(10000,10000);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
     
    }
    public static void main(String[] args) {
        int h=0,l=0,n1=0,n2=0;
        try{
            Scanner s1=new Scanner((Readable) new FileOutputStream("border.txt")) ;
            h=s1.nextInt();
            l=s1.nextInt();
            s1.close();
        }catch(IOException e){
            System.out.println("Problem with file output");
        }
        int[][]got=new int[h][l];
        try{
            Scanner s=new Scanner((Readable) new FileOutputStream("check.txt")) ;
            for(int i=0;i<h;i++){
                for(int j=0;j<l;j++){
                    got[i][j]=s.nextInt();
                }
            }
            s.close();
        }catch(IOException e){
            System.out.println("Problem with file output");
        }

        for(int i=0;i<h;i++){
              for (int j=0;j<l;j++){
                  if(got[i][j]==1){
                      n1=i*30;
                      n2=20+j*30;
                      h=30+i*30;
                      l=50+j*30;

        GUI t= new GUI();
            t.paint(null);
                  }
              }
      }
      
    }
    /**
     *
     * @param g
   
     */

    public void paint(Graphics g){
        
          for(int i=30;i<630;i+=30){
            for (int j=50;j<650;j+=30){
        g.drawRect(i,j,30,30);
    }
            
    }   
   /*     for(int i=0;i<h;i++){
            for (int j=0;j<l;j++){
                if(got[i][j]==1){
                    n1=i*30;
                    n2=20+j*30;
                    g.setColor(Color.GREEN);
                     g.fillRect(n1, n2,30, 30);
                }
            }
        }
     */    
//        if(got[i][j]==1){
//               g.setColor(Color.GREEN);
//        g.fillRect(y, x,30, 30);
//        }

        
  /*      g.setColor(Color.BLUE);
        g.fillRect(60, 170,60, 210);
        g.fillRect(120, 320,30, 60);
        
        g.setColor(Color.RED);
        g.fillRect(360, 320,60, 60);

        g.setColor(Color.BLACK);
        g.fillRect(360, 530,150, 90);
*/
  

        }
    }
    


