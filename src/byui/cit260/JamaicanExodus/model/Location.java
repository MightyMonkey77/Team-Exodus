/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.model;

import java.io.Serializable;

/**
 *
 * @author Chris
 */
public class Location implements Serializable  {
    
    private int xCord;
    private int yCord;
    private boolean visited;
    private int next;

    public Location() {
    }

    public int getxCord() {
        return xCord;
    }

    public void setxCord(int xCord) {
        this.xCord = xCord;
    }

    public int getyCord() {
        return yCord;
    }

    public void setyCord(int yCord) {
        this.yCord = yCord;
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
        hash = 59 * hash + this.xCord;
        hash = 59 * hash + this.yCord;
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
        if (this.xCord != other.xCord) {
            return false;
        }
        if (this.yCord != other.yCord) {
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
        return "Location{" + "xCord=" + xCord + ", yCord=" + yCord + ", visited=" + visited + ", next=" + next + '}';
    }
    
    
}

