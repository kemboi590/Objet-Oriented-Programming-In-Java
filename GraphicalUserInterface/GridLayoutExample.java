/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphicaluserinteface;

import javax.swing.*;
//import java.awt.FlowLayout;
import java.awt.GridLayout;
public class GridLayoutExample extends JFrame{
      public GridLayoutExample() {
        setLayout(new GridLayout(3, 2, 5, 5));
        add(new JLabel("First name"));
        add(new JTextField(10));
         add(new JLabel("Last name"));
         add(new JTextField(10));
         
    }
      
          public static void main(String[] args) {
        GridLayoutExample fr = new GridLayoutExample();
        fr.setTitle("Show GridLayout");
        fr.setLocationRelativeTo(null);
        fr.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        fr.setSize(300,400);
        fr.setVisible(true);
    }
    
    
}
