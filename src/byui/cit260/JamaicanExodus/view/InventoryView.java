/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.view;

/**
 *
 * @author Office Payne
 */
public enum InventoryView {
     
    CLOTHING ("Clothing", "Full set of traveling clothes", 20.00, 7.25),
     RATIONS ("Rations", "Sustinace needed", 5.00, 1.11),
        FUEL ("Gasoline", "For first viehicle", 3.25, 21.23),
       TOOLS ("Tools", "Tools used by carpenter, Shipwrieght", 40.00, 30.56),
    COMPUTER ("Laptop","Used by Software Engineer", 1000.00, 8.03 ),
        CALC ("Calculater", "Bankers Calculater", 80.00, 1 ),
    FARMTOOLS("Farming Tools", "Tools used by a farmer", 60.00, 26.38);
    
    private final String name;
    private final String description;
    private final double cost;
    private final double weight;
    
    private InventoryView(String name, String description, double cost, double weight ) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.weight = weight; 
        
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "InventoryView{" + "name=" + name + ", description=" + description + ", cost=" + cost + ", weight=" + weight + '}';
    }
    
    
}

    
    
    
    
    
