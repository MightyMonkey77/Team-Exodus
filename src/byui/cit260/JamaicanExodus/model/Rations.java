/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Chris
 */
public class Rations implements Serializable {
        
    private int foodRations;
    private String foodName;

    public Rations() {
    }

    public int getFoodRations() {
        return foodRations;
    }

    public void setFoodRations(int foodRations) {
        this.foodRations = foodRations;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.foodRations;
        hash = 31 * hash + Objects.hashCode(this.foodName);
        return hash;
    }

   

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Rations other = (Rations) obj;
        if (this.foodRations != other.foodRations) {
            return false;
        }
        if (this.foodName != other.foodName) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Rations{" + "foodRations=" + foodRations + ", foodName=" + foodName + '}';
    }
    
    
}


