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
 * @author Office Payne
 */
public class Farmer implements Serializable {
    
    private double startMoney;
    private String description;

    public Farmer() {
    }

    public double getStartMoney() {
        return startMoney;
    }

    public void setStartMoney(double startMoney) {
        this.startMoney = startMoney;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.startMoney) ^ (Double.doubleToLongBits(this.startMoney) >>> 32));
        hash = 71 * hash + Objects.hashCode(this.description);
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
        final Farmer other = (Farmer) obj;
        if (Double.doubleToLongBits(this.startMoney) != Double.doubleToLongBits(other.startMoney)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Farmer{" + "startMoney=" + startMoney + ", description=" + description + '}';
    }
    
    
    
    
    
}
