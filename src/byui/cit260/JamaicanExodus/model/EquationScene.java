/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.model;

import java.io.Serializable;

/**
 *
 * @author Kim
 */
public class EquationScene implements Serializable {
    
    private boolean isAnswered;
    private int equationLocation;

    public EquationScene() {
    }

    public int getEquationLocation() {
        return equationLocation;
    }

    public void setEquationLocation(int equationLocation) {
        this.equationLocation = equationLocation;
    }
    
    public boolean isIsAnswered() {
        return isAnswered;
    }

    public void setIsAnswered(boolean isAnswered) {
        this.isAnswered = isAnswered;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.isAnswered ? 1 : 0);
        hash = 97 * hash + this.equationLocation;
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
        final EquationScene other = (EquationScene) obj;
        if (this.isAnswered != other.isAnswered) {
            return false;
        }
        if (this.equationLocation != other.equationLocation) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EquationScene{" + "isAnswered=" + isAnswered + ", equationLocation=" + equationLocation + '}';
    }

   
    }
    
    

