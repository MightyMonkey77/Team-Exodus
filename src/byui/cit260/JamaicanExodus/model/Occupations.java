/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.model;

import java.io.Serializable;

/**
 *
 * @author mikeg
 */
public class Occupations implements Serializable{
   
    private int occupations;

    public Occupations() {
    }

    public int getOccupations() {
        return occupations;
    }

    public void setOccupations(int occupations) {
        this.occupations = occupations;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.occupations;
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
        return true;
    }

    @Override
    public String toString() {
        return "Occupations{" + "occupations=" + occupations + '}';
    }
    
    
}
   
    
