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
 * @author Office Payne
 */
public class Game implements Serializable {
    
   
    private  Player player = null;
    private  Actor[] actor = null;
    private  Inventory[] inventory = null;
    private  Map map =null;
    private  Obstacles[] obstacles = null;
    private  Months[] months = null;
    private  Occupations[] occupations = null;

    public Game() {
    }  

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Actor[] getActor() {
        return actor;
    }

    public void setActor(Actor[] actor) {
        this.actor = actor;
    }

    public Inventory[] getInventory() {
        return inventory;
    }

    public void setInventory(Inventory[] inventory) {
        this.inventory = inventory;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Obstacles[] getObstacles() {
        return obstacles;
    }

    public void setObstacles(Obstacles[] obstacles) {
        this.obstacles = obstacles;
    }

    public Months[] getMonths() {
        return months;
    }

    public void setMonths(Months[] months) {
        this.months = months;
    }

    public Occupations[] getOccupations() {
        return occupations;
    }

    public void setOccupations(Occupations[] occupations) {
        this.occupations = occupations;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.player);
        hash = 43 * hash + Arrays.deepHashCode(this.actor);
        hash = 43 * hash + Arrays.deepHashCode(this.inventory);
        hash = 43 * hash + Objects.hashCode(this.map);
        hash = 43 * hash + Arrays.deepHashCode(this.obstacles);
        hash = 43 * hash + Arrays.deepHashCode(this.months);
        hash = 43 * hash + Arrays.deepHashCode(this.occupations);
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
        final Game other = (Game) obj;
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        if (!Arrays.deepEquals(this.actor, other.actor)) {
            return false;
        }
        if (!Arrays.deepEquals(this.inventory, other.inventory)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        if (!Arrays.deepEquals(this.obstacles, other.obstacles)) {
            return false;
        }
        if (!Arrays.deepEquals(this.months, other.months)) {
            return false;
        }
        if (!Arrays.deepEquals(this.occupations, other.occupations)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "player=" + player + ", actor=" + actor + ", inventory=" + inventory + ", map=" + map + ", obstacles=" + obstacles + ", months=" + months + ", occupations=" + occupations + '}';
    }

    
    
    
    

    
  
    

    
    
    
}
