/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

/**
 *
 * @author smcgovern2
 */
public abstract class Flower {
    public String color;
    public double heightInInches;
    
    
    public void absorbWater(){
        System.out.println("Absorbs water like a flower does");
    }
     
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHeightInInches() {
        return heightInInches;
    }

    public void setHeightInInches(double heightInInches) {
        this.heightInInches = heightInInches;
    }
}
