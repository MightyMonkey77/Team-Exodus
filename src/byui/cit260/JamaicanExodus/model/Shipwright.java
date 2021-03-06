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
public class Shipwright implements Serializable {
private double startingMoney;
private String descriptionsW;

    public Shipwright() {
    }

    public double getStartingMoney() {
        return startingMoney;
    }

    public void setStartingMoney(double startingMoney) {
        this.startingMoney = startingMoney;
    }

    public String getDescriptionsW() {
        return descriptionsW;
    }

    public void setDescriptionsW(String descriptionsW) {
        this.descriptionsW = descriptionsW;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.startingMoney) ^ (Double.doubleToLongBits(this.startingMoney) >>> 32));
        hash = 83 * hash + Objects.hashCode(this.descriptionsW);
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
        final Shipwright other = (Shipwright) obj;
        if (Double.doubleToLongBits(this.startingMoney) != Double.doubleToLongBits(other.startingMoney)) {
            return false;
        }
        if (!Objects.equals(this.descriptionsW, other.descriptionsW)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Shipwright{" + "startingMoney=" + startingMoney + ", descriptionsW=" + descriptionsW + '}';
    }


}
