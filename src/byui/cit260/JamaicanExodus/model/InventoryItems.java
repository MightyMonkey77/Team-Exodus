/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.model;

// This is a possible new class but not entirely sure.
/**
 *
 * @author Office Payne
 */
public enum InventoryItems {
    
    clothing ("Clothing", 20.00, 2.15),
    rations ("Rations", 5.50, 2.03),
    fuel ("Fuel", 3.50, 10.00),
    tools ("TradeTools", 35.00, 6.53),
    computer ("Computer", 800.00, 8.50),
    calc ("Calculator", 15.50, 1.01),
    farmtools ("Farm Tools", 16.20, 8.36),
    medicine ("Medicine", 10.50, 2.03),
    money ("Money to spend", 1, .01), // New addition 12/7/2017 Seems we have to have it.
    chest ("Chest", 25.00, 10.00);     

  
    private String name;
    private final double cost;
    private double weight;

    private InventoryItems(String name, double cost, double weight) {
        this.cost = cost;
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public double getCost() {
        return cost;
    }

    
    
}
