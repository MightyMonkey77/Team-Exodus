/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.model;

import byui.cit260.JamaicanExodus.control.Actors;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Chris
 */
public class Location implements Serializable  {
    
    private int x;
    private int y;
    private boolean visited;
    private int next;
    private Scene scenes;
    private Obstacles obstacles;
    private ArrayList<Actors> actors = new ArrayList<Actors>();

    public ArrayList<Actors> getActors() {
        return actors;
    }

    public void setActors(ArrayList<Actors> actors) {
        this.actors = actors;
    }
    

    public Scene getScenes() {
        return scenes;
    }

    public void setScenes(Scene scenes) {
        this.scenes = scenes;
    }

    public Obstacles getObstacles() {
        return obstacles;
    }

    public void setObstacles(Obstacles obstacles) {
        this.obstacles = obstacles;
    }

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

    public boolean getVisited() {
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.x;
        hash = 59 * hash + this.y;
        hash = 59 * hash + (this.visited ? 1 : 0);
        hash = 59 * hash + this.next;
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
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "xCord=" + x + ", yCord=" + y + ", visited=" + visited + ", next=" + next + '}';
    }
    
    
}

