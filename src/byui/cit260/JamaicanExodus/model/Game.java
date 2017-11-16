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
public class Game implements Serializable {
    
    private Player player;
    private Map map;
    private Shop shop;
    private String description;
    private double totalTimePlayed;
    private double timePace;
    private double mapCoordinates;
    private double days;
  

    public Game() {
    }
    
    public Player getPlayer() {
     return player;
    }
    public void setPlayer(Player player) {
    this.player = player;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTotalTimePlayed() {
        return totalTimePlayed;
    }

    public void setTotalTimePlayed(double totalTimePlayed) {
        this.totalTimePlayed = totalTimePlayed;
    }

    public double getTimePace() {
        return timePace;
    }

    public void setTimePace(double timePace) {
        this.timePace = timePace;
    }

    public double getMapCoordinates() {
        return mapCoordinates;
    }

    public void setMapCoordinates(double mapCoordinates) {
        this.mapCoordinates = mapCoordinates;
    }

    public double getDays() {
        return days;
    }

    public void setDays(double days) {
        this.days = days;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.description);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.totalTimePlayed) ^ (Double.doubleToLongBits(this.totalTimePlayed) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.timePace) ^ (Double.doubleToLongBits(this.timePace) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.mapCoordinates) ^ (Double.doubleToLongBits(this.mapCoordinates) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.days) ^ (Double.doubleToLongBits(this.days) >>> 32));
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
        if (Double.doubleToLongBits(this.totalTimePlayed) != Double.doubleToLongBits(other.totalTimePlayed)) {
            return false;
        }
        if (Double.doubleToLongBits(this.timePace) != Double.doubleToLongBits(other.timePace)) {
            return false;
        }
        if (Double.doubleToLongBits(this.mapCoordinates) != Double.doubleToLongBits(other.mapCoordinates)) {
            return false;
        }
        if (Double.doubleToLongBits(this.days) != Double.doubleToLongBits(other.days)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "description=" + description + ", totalTimePlayed=" + totalTimePlayed + ", timePace=" + timePace + ", mapCoordinates=" + mapCoordinates + ", days=" + days + '}';
    }
    
    
}
