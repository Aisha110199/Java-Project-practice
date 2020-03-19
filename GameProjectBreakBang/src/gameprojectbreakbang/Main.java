
package gameprojectbreakbang;

import java.awt.*;
//import java.awt.event.ActionListener;
//import java.awt.event.KeyListener;
import javax.swing.*;
//import javax.swing.JPanel;



  



public class Main {

    final static int height =600;
    final static int weight =400;
    
    public static void main(String[] args) {
        
        JFrame MyFrame= new JFrame ("Break Bang");
       
        MyFrame.setSize(height, weight);
        MyFrame.setVisible(true);
        
         MyFrame.setResizable(false);
         MyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        
         MyFrame.getContentPane().setBackground(Color.blue);
     
       ImageIcon icon = new ImageIcon("D:\\ICON.png");
            MyFrame.setIconImage(icon.getImage());
            
          
           
           
           
            
    
    
    }
}
