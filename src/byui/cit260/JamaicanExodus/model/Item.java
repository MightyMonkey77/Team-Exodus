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
public enum Item {
    
    FOOD("EatMe!"), TICKETS("Your Ride is here."), CLOTHES("Clothing");
    
    private final String name;

    private Item(String name) {
        this.name = name;
    }
    
    public String toString(){
       return this.name;
    }

    
    
   
       
}
