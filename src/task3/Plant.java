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
public interface Plant {
    
    public void absorbWater();
    
    public void collectNutrients();
    
    public void photosynthesize();

    public double getWaterLevel();

    public void setWaterLevel(double waterLevel);

    public double getNutrientLevel();

    public void setNutrientLevel(double nutrientLevel);
}
