/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.model;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
/**
 *
 * @author Office Payne
 */
public class Player implements Serializable {

private String name;  
private final ArrayList<Game> games = new ArrayList<>();
private int x;
private int y;
private double charHealth = 100;
   
    public Player() {
    }

    public double getCharHealth() {
        return charHealth;
    }
    
    public void setCharHealth(double charHealth) {
        this.charHealth = charHealth;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public ArrayList<Game> getGames() {
        return games;
    }
   
 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.name);
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
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", games=" + games + '}';
    }

    
    

   
    
}
