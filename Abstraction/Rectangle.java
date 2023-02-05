/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstraction;

/**
 *
 * @author KEMBOI
 */
public class Rectangle extends GraphicObject   {
    @Override
    void draw() {
        System.out.println("Drawing a triangle");
    }
     @Override
    void resize() {
        System.out.println("Resize a triangle");
    }
}
