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
public class Map implements Serializable {
    
    private String description;
    private int xCount;
    private int yCount;
    private int location;
    private double traveled;

    public Map(int x, int y) {
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getxCount() {
        return xCount;
    }

    public void setxCount(int xCount) {
        this.xCount = xCount;
    }

    public int getyCount() {
        return yCount;
    }

    public void setyCount(int yCount) {
        this.yCount = yCount;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public double getTraveled() {
        return traveled;
    }

    public void setTraveled(double traveled) {
        this.traveled = traveled;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.description);
        hash = 83 * hash + this.xCount;
        hash = 83 * hash + this.yCount;
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.location) ^ (Double.doubleToLongBits(this.location) >>> 32));
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.traveled) ^ (Double.doubleToLongBits(this.traveled) >>> 32));
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
        final Map other = (Map) obj;
        if (this.xCount != other.xCount) {
            return false;
        }
        if (this.yCount != other.yCount) {
            return false;
        }
        if (Double.doubleToLongBits(this.location) != Double.doubleToLongBits(other.location)) {
            return false;
        }
        if (Double.doubleToLongBits(this.traveled) != Double.doubleToLongBits(other.traveled)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "description=" + description + ", xCount=" + xCount + ", yCount=" + yCount + ", location=" + location + ", traveled=" + traveled + '}';
    }
    
    
    
    
}
