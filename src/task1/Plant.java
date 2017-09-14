/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

/**
 *
 * @author smcgovern2
 */
public class Plant {
    
    private double waterLevel;
    private double nutrientLevel;
    
    public void absorbWater(){
        System.out.println("Absorbing Water");
    }
    
    public void collectNutrients(){
        System.out.println("Collecting Nutrients");
    }
    
    public void photosynthesize(){
        System.out.println("Photosynthesizing");
    }

    public double getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(double waterLevel) {
        this.waterLevel = waterLevel;
    }

    public double getNutrientLevel() {
        return nutrientLevel;
    }

    public void setNutrientLevel(double nutrientLevel) {
        this.nutrientLevel = nutrientLevel;
    }
    
    
}
