/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritamce;

/**
 *
 * @author KEMBOI
 */
public class InheritanceClass {
    
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(20, 10, 1);
        System.out.println("Gear is:" + mountainBike.gear);
        System.out.println("seat height is:" + mountainBike.seatHeight);
        System.out.println("Bike speed is:" + mountainBike.speed);
        mountainBike.applyBrake(5);
        System.out.println("Bike speed after applying break is: " + mountainBike.speed);
    }
}
