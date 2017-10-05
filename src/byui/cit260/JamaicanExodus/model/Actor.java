/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.model;

import java.awt.Point;

/**
 *
 * @author Office Payne
 */
public enum Actor {
    
    
    Father("Gerain","He is the head of the houshold in whom all trust.",new Point (1,1),5),
    Mother("Aigay","Mother and Patron of the family, she is the strength.",new Point (0,1),5),
    Son("Shamar","16 years old, definatly a mommas boy.",new Point (2,2), 5),
    Daughter("Zhade","14 years old, loves her family.",new Point (2,3), 5),
    Friend1("Libano","Male, worked with Gerain before the occupation.",new Point (3,1), 5),
    Friend2("Kenise","Female, mothers best friend, single, age 25.",new Point (2,3), 5),
    Female("Ini","Female, work associate, was the head of reliefe projects.", new Point (1,3), 5);
    
    private final String name;
    private final String description;
    private final Point coordinates;
    private int startingHealth = 5;

    Actor(String name, String description, Point coordinates, int startingHealth) {
          this.name = name;
          this.description = description;
          this.coordinates = coordinates;
          this.startingHealth = startingHealth;
}
    
    public String getName() {
       return name;
}
    public String getDescription() {
       return description;
}
    public Point getCoordinates(){
       return coordinates;
}
    public int getStartingHealth() {
       return startingHealth;
} 

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", description=" + description + ", coordinates=" + coordinates + ", startingHealth=" + startingHealth + '}';
    }
    
}
