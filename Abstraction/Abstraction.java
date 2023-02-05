/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstraction;

/**
 *
 * @author KEMBOI
 */
public class Abstraction {

    
    public static void main(String[] args) {
       GraphicObject circle = new Circle();
       circle.draw();
       circle.resize();
       
       GraphicObject rectangle = new Rectangle();
       rectangle.draw();
       rectangle.resize();
    }
    
}
//this is the abstact class => GraphicObject
//this is the concrete class => Circle()
