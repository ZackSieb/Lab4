/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Siebu
 */
public class Car {
    
    private int yearModel;
    private String make;
    private int speed;
    
    public int getYearNodel() {
        return yearModel;
    }
    
    public String getMake() {
        return make;
    }
    
    public int getSpeed() {
        return speed;
    }
    
    public void accelerate() {
        speed += 5;
    }
    
    public void brake() {
        speed -= 5;
    }
    
    public Car( int yearModelGiven, String makeGiven ) {
        yearModel = yearModelGiven;
        make = makeGiven;
        speed = 0;
    }

    String getYearModel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


