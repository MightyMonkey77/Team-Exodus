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
 * @author Chris
 */
public class Shop implements Serializable {
    
    private double price;
    private String name;
    private int position;
    private String items;
    private Inventory[] inventoryList;
    private double totalMoneyUsed;
    

    public Shop() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public Inventory[] getInventoryList() {
        return inventoryList;
    }

    public void setInventoryList(Inventory[] inventoryList) {
        this.inventoryList = inventoryList;
    }

    public double getTotalMoneyUsed() {
        return totalMoneyUsed;
    }

    public void setTotalMoneyUsed(double totalMoneyUsed) {
        this.totalMoneyUsed = totalMoneyUsed;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
        hash = 11 * hash + Objects.hashCode(this.name);
        hash = 11 * hash + this.position;
        hash = 11 * hash + Objects.hashCode(this.items);
        hash = 11 * hash + Arrays.deepHashCode(this.inventoryList);
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.totalMoneyUsed) ^ (Double.doubleToLongBits(this.totalMoneyUsed) >>> 32));
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
        final Shop other = (Shop) obj;
        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        if (this.position != other.position) {
            return false;
        }
        if (Double.doubleToLongBits(this.totalMoneyUsed) != Double.doubleToLongBits(other.totalMoneyUsed)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.items, other.items)) {
            return false;
        }
        if (!Arrays.deepEquals(this.inventoryList, other.inventoryList)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Shop{" + "price=" + price + ", name=" + name + ", position=" + position + ", items=" + items + ", inventoryList=" + inventoryList + ", totalMoneyUsed=" + totalMoneyUsed + '}';
    }
    
    

    
}
