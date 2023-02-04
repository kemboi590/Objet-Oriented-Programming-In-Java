/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritamce;

/**
 *
 * @author KEMBOI
 */
class Bicycle {
   
    protected int gear;
    protected int speed;
    
    public Bicycle(int startSpeed, int startGear) {
        gear = startGear;
        speed = startSpeed;
    }
    
    public void setGear(int newValue) {
        gear = newValue;
    }
    
    public void applyBrake(int decrement) {
        speed -=decrement;
    }
    
    public void speedUp(int increment) {
        speed +=increment;
    }
}
