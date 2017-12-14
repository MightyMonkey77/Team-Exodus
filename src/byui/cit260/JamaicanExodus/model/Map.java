/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Office Payne
 */
public class Map implements Serializable {
    
    private String description;
    private int x;
    private int y;
    private int location;
    private double traveled;
    private Location [][] locations;
    private String map;
    private Towns[] towns;

    public Map(int x, int y) {
    }

    public Map() {
        
    }

    public Towns[] getTowns() {
        return towns;
    }

    public void setTowns(Towns[] towns) {
        this.towns = towns;
    }
    
    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }
    
    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }
     
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
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
        hash = 97 * hash + Objects.hashCode(this.description);
        hash = 97 * hash + this.x;
        hash = 97 * hash + this.y;
        hash = 97 * hash + this.location;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.traveled) ^ (Double.doubleToLongBits(this.traveled) >>> 32));
        hash = 97 * hash + Arrays.deepHashCode(this.locations);
        hash = 97 * hash + Objects.hashCode(this.map);
        hash = 97 * hash + Arrays.deepHashCode(this.towns);
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
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        if (this.location != other.location) {
            return false;
        }
        if (Double.doubleToLongBits(this.traveled) != Double.doubleToLongBits(other.traveled)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        if (!Arrays.deepEquals(this.locations, other.locations)) {
            return false;
        }
        if (!Arrays.deepEquals(this.towns, other.towns)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "description=" + description + ", x=" + x + ", y=" + y + ", location=" + location + ", traveled=" + traveled + ", locations=" + locations + ", map=" + map + ", towns=" + towns + '}';
    }

    public void setLocation(Location[][] locations) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    

    
    
    
    
    
}
