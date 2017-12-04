/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.model;

import byui.cit260.JamaicanExodus.control.Actors;
import byui.cit260.JamaicanExodus.view.ScenesView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Chris
 */
public class Location implements Serializable  {
    
    private int x;
    private int y;
    private boolean visited;
    private int next;
    private int symbol;
    private Obstacles obstacles;
    private ArrayList<Actors> actors = new ArrayList<>();
    private Towns towns;
    private Scene scenes;
     

    public Location() {
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

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public int getNext() {
        return next;
    }

    public void setNext(int next) {
        this.next = next;
    }

    public int getSymbol() {
        return symbol;
    }

    public void setSymbol(int symbol) {
        this.symbol = symbol;
    }

    public Obstacles getObstacles() {
        return obstacles;
    }

    public void setObstacles(Obstacles obstacles) {
        this.obstacles = obstacles;
    }

    public ArrayList<Actors> getActors() {
        return actors;
    }

    public void setActors(ArrayList<Actors> actors) {
        this.actors = actors;
    }

    public Towns getTowns() {
        return towns;
    }

    public void setTowns(Towns towns) {
        this.towns = towns;
    }

    public Scene getScenes() {
        return scenes;
    }

    public void setScenes(Scene scenes) {
        this.scenes = scenes;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + this.x;
        hash = 43 * hash + this.y;
        hash = 43 * hash + (this.visited ? 1 : 0);
        hash = 43 * hash + this.next;
        hash = 43 * hash + this.symbol;
        hash = 43 * hash + Objects.hashCode(this.obstacles);
        hash = 43 * hash + Objects.hashCode(this.actors);
        hash = 43 * hash + Objects.hashCode(this.towns);
        hash = 43 * hash + Objects.hashCode(this.scenes);
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
        final Location other = (Location) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        if (this.next != other.next) {
            return false;
        }
        if (this.symbol != other.symbol) {
            return false;
        }
        if (!Objects.equals(this.obstacles, other.obstacles)) {
            return false;
        }
        if (!Objects.equals(this.actors, other.actors)) {
            return false;
        }
        if (this.towns != other.towns) {
            return false;
        }
        if (!Objects.equals(this.scenes, other.scenes)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "x=" + x + ", y=" + y + ", visited=" + visited + ", next=" + next + ", symbol=" + symbol + ", obstacles=" + obstacles + ", actors=" + actors + ", towns=" + towns + ", scene=" + scenes + '}';
    }

    

   
   
    
    
}

