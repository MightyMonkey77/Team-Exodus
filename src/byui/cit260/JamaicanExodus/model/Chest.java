/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.model;

import java.io.Serializable;

/**
 *
 * @author Office Payne
 */
public class Chest implements Serializable {
    
    private double maxWieght;
    private double amountLoaded;
    private double loadedWieght;

    public Chest() {
    }

    public double getMaxWieght() {
        return maxWieght;
    }

    public void setMaxWieght(double maxWieght) {
        this.maxWieght = maxWieght;
    }

    public double getAmountLoaded() {
        return amountLoaded;
    }

    public void setAmountLoaded(double amountLoaded) {
        this.amountLoaded = amountLoaded;
    }

    public double getLoadedWieght() {
        return loadedWieght;
    }

    public void setLoadedWieght(double loadedWieght) {
        this.loadedWieght = loadedWieght;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.maxWieght) ^ (Double.doubleToLongBits(this.maxWieght) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.amountLoaded) ^ (Double.doubleToLongBits(this.amountLoaded) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.loadedWieght) ^ (Double.doubleToLongBits(this.loadedWieght) >>> 32));
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
        final Chest other = (Chest) obj;
        if (Double.doubleToLongBits(this.maxWieght) != Double.doubleToLongBits(other.maxWieght)) {
            return false;
        }
        if (Double.doubleToLongBits(this.amountLoaded) != Double.doubleToLongBits(other.amountLoaded)) {
            return false;
        }
        if (Double.doubleToLongBits(this.loadedWieght) != Double.doubleToLongBits(other.loadedWieght)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Chest{" + "maxWieght=" + maxWieght + ", amountLoaded=" + amountLoaded + ", loadedWieght=" + loadedWieght + '}';
    }
    
    
}
