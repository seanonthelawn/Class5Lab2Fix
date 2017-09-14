/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

/**
 *
 * @author Sean
 */
public class Daisy implements Flower, Plant {
    
    
    
    public String color;
    public double heightInInches;
    
    private double waterLevel;
    private double nutrientLevel;
    
    @Override
    public void absorbWater(){
        System.out.println("Absorbing Water");
    }
    @Override
    public void collectNutrients(){
        System.out.println("Collecting Nutrients");
    }
    @Override
    public void photosynthesize(){
        System.out.println("Photosynthesizing");
    }
    @Override
    public double getWaterLevel() {
        return waterLevel;
    }
    @Override
    public void setWaterLevel(double waterLevel) {
        this.waterLevel = waterLevel;
    }
    @Override
    public double getNutrientLevel() {
        return nutrientLevel;
    }
    @Override
    public void setNutrientLevel(double nutrientLevel) {
        this.nutrientLevel = nutrientLevel;
    }
    @Override
    public String getColor() {
        return color;
    }
    @Override
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public double getHeightInInches() {
        return heightInInches;
    }
    @Override
    public void setHeightInInches(double heightInInches) {
        this.heightInInches = heightInInches;
    }
    
    public void beADaisy(){
        System.out.println("Being a daisy");
    }
    
}
