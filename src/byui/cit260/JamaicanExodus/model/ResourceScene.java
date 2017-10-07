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
public class ResourceScene implements Serializable {
    
    private double food;
    private double money;
    private double amount;

    public double getFood() {
        return food;
    }

    public double getMoney() {
        return money;
    }

    public double getAmount() {
        return amount;
    }

    public ResourceScene() {
    }

    public double isFood() {
        return food;
    }

    public void setFood(double food) {
        this.food = food;
    }

    public double isMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double isAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.food) ^ (Double.doubleToLongBits(this.food) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.money) ^ (Double.doubleToLongBits(this.money) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.amount) ^ (Double.doubleToLongBits(this.amount) >>> 32));
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
        final ResourceScene other = (ResourceScene) obj;
        if (this.food != other.food) {
            return false;
        }
        if (this.money != other.money) {
            return false;
        }
        if (this.amount != other.amount) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ResourecScene{" + "food=" + food + ", money=" + money + ", amount=" + amount + '}';
    }
    
}
