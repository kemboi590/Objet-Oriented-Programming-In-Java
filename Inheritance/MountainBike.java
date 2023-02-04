/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritamce;

/**
 *
 * @author KEMBOI
 */
class MountainBike extends Bicycle {
    public int seatHeight;

public MountainBike(int starHeight,
                      int startSpeed,
                      int startGear){
    super(startSpeed, startGear);
    seatHeight= starHeight;
}
public void setHeight(int newValue) {
    seatHeight = newValue;
}
}
