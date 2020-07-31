/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentgui;

/**
 *
 * @author user
 */
import javax.swing.*;
import java.awt.*;

public class AssignmentGUI extends JApplet {

    /**
     * @param args the command line arguments
     */
    private JFrame f;
    private JPanel p,q;
    private JButton b1;
    private JLabel lab;
    
    public AssignmentGUI(){
        gui();
        borderLayout();
    }
    
    public void gui(){
        f = new JFrame("Urban Planning");
        f.setVisible(true);
        f.setSize(600,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        p = new JPanel(new GridBagLayout());
        //p.setBackground(Color.DARK_GRAY);
        q = new JPanel(new GridBagLayout());
        
        b1 = new JButton("Test");
        JButton b2 = new JButton("Subway");
        //lab = new JLabel("This is test label");
        //lab.setBackground(Color.blue);
        GridBagConstraints c = new GridBagConstraints(); 
        
        c.gridx=-3;
        c.gridy=3;
        p.add(b1,c);
        //p.add(lab);
        p.add(b2);
        
        f.add(p);
    }
    
    public void borderLayout(){
        setLayout(new BorderLayout());
        add(new Button("Hello"),BorderLayout.NORTH);
        
    }
    public static void main(String[] args) {
        new AssignmentGUI();
    }
    
}
