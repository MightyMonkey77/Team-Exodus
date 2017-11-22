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
 * @author mikeg
 */
public class Occupations implements Serializable{
   
    private int occupations;
    private String description;
    private String name;
    private double startingMoney;
    public Occupations() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStartingMoney() {
        return startingMoney;
    }

    public void setStartingMoney(double startingMoney) {
        this.startingMoney = startingMoney;
    }
    
    public int getOccupations() {
        return occupations;
    }

    public void setOccupations(int occupations) {
        this.occupations = occupations;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + this.occupations;
        hash = 11 * hash + Objects.hashCode(this.description);
        hash = 11 * hash + Objects.hashCode(this.name);
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.startingMoney) ^ (Double.doubleToLongBits(this.startingMoney) >>> 32));
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
        final Occupations other = (Occupations) obj;
        if (this.occupations != other.occupations) {
            return false;
        }
        if (Double.doubleToLongBits(this.startingMoney) != Double.doubleToLongBits(other.startingMoney)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Occupations{" + "occupations=" + occupations + ", description=" + description + ", name=" + name + ", startingMoney=" + startingMoney + '}';
    }

    
}
   
    
