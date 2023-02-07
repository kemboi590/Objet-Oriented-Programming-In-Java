/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package graphicaluserinteface;

/**
 *
 * @author KEMBOI
 */
import javax.swing.*;
import java.awt.FlowLayout;

public class Sample extends JFrame{

    public Sample() {
        setLayout(new FlowLayout(FlowLayout.LEFT,10,50));
        add(new JLabel("First name"));
        add(new JTextField(8));
         add(new JLabel("Last name"));
         add(new JTextField(8));
         
    }
    public static void main(String[] args) {
        Sample fr = new Sample();
        fr.setTitle("Show FlowLayout");
        fr.setLocationRelativeTo(null);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(300,400);
        fr.setVisible(true);
    }
    
}
