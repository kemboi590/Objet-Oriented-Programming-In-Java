/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstraction;

/**
 *
 * @author KEMBOI
 */
public class Circle extends GraphicObject   {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
     @Override
    void resize() {
        System.out.println("Resize a circle");
    }
}
//in this class we must provide the implementation for both draw and resize methods
