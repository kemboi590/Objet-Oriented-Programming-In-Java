/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstraction;

/**
 *
 * @author KEMBOI
 */
public abstract class GraphicObject {
    int x,y;
    void moveTo(int newX, int newY) {
        System.out.println("move to x: " +x+ " and y:" + y);
    }
    
    //the following are abstract class declaration
    abstract void draw(); 
    abstract void resize();
    
    
}

//abstract is a key word
//an abstract class cannot be instanciated but can be subclassed
// an abstract class must have atleast 1 abstract method ie abstract void draw(); 
