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
public class SoftwareEngineer implements Serializable {
private double startingMoney;
private String descriptionS;

    public SoftwareEngineer() {
    }

    public double getStartingMoney() {
        return startingMoney;
    }

    public void setStartingMoney(double startingMoney) {
        this.startingMoney = startingMoney;
    }

    public String getDescriptionS() {
        return descriptionS;
    }

    public void setDescriptionS(String descriptionS) {
        this.descriptionS = descriptionS;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.startingMoney) ^ (Double.doubleToLongBits(this.startingMoney) >>> 32));
        hash = 97 * hash + Objects.hashCode(this.descriptionS);
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
        final SoftwareEngineer other = (SoftwareEngineer) obj;
        if (Double.doubleToLongBits(this.startingMoney) != Double.doubleToLongBits(other.startingMoney)) {
            return false;
        }
        if (!Objects.equals(this.descriptionS, other.descriptionS)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SoftwareEngineer{" + "startingMoney=" + startingMoney + ", descriptionS=" + descriptionS + '}';
    }



}
