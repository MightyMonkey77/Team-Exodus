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
public class Inventory implements Serializable {
    
    private static Inventory inventoryReport = null;

  /* private String name;
    private String description;
    private double cost;
    
 */
    private int quantity;
    private InventoryItems inventoryItems;
    private double weight;
    

       
/*
    public Inventory(InventoryItems inventoryItems, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public InventoryItems getInventoryItems() {
        return inventoryItems;
    }

    public void setInventoryItems(InventoryItems inventoryItems) {
        this.inventoryItems = inventoryItems;
    }
    
    public static Inventory getInventoryReport() {
        return inventoryReport;
    }

    public static void setInventoryReport(Inventory inventoryReport) {
        Inventory.inventoryReport = inventoryReport;
    }
          
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
   
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + Objects.hashCode(this.description);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.cost) ^ (Double.doubleToLongBits(this.cost) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.weight) ^ (Double.doubleToLongBits(this.weight) >>> 32));
        hash = 67 * hash + this.quantity;
        hash = 67 * hash + Objects.hashCode(this.inventoryItems);
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
        final Inventory other = (Inventory) obj;
        if (Double.doubleToLongBits(this.cost) != Double.doubleToLongBits(other.cost)) {
            return false;
        }
        if (Double.doubleToLongBits(this.weight) != Double.doubleToLongBits(other.weight)) {
            return false;
        }
        if (this.quantity != other.quantity) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (this.inventoryItems != other.inventoryItems) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Inventory{" + "name=" + name + ", description=" + description + ", cost=" + cost + ", weight=" + weight + ", quantity=" + quantity + ", inventoryItems=" + inventoryItems + '}';
    }

    */

    public Inventory(InventoryItems inventoryItems, int quantity, double weight ) {
        this.quantity = quantity;
        this.inventoryItems = inventoryItems;
    }
     public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static Inventory getInventoryReport() {
        return inventoryReport;
    }

    public static void setInventoryReport(Inventory inventoryReport) {
        Inventory.inventoryReport = inventoryReport;
    }
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public InventoryItems getInventoryItems() {
        return inventoryItems;
    }

    public void setInventoryItems(InventoryItems inventoryItems) {
        this.inventoryItems = inventoryItems;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + this.quantity;
        hash = 61 * hash + Objects.hashCode(this.inventoryItems);
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.weight) ^ (Double.doubleToLongBits(this.weight) >>> 32));
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
        final Inventory other = (Inventory) obj;
        if (this.quantity != other.quantity) {
            return false;
        }
        if (Double.doubleToLongBits(this.weight) != Double.doubleToLongBits(other.weight)) {
            return false;
        }
        if (this.inventoryItems != other.inventoryItems) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Inventory{" + "quantity=" + quantity + ", inventoryItems=" + inventoryItems + ", weight=" + weight + '}';
    }

   
    
}
