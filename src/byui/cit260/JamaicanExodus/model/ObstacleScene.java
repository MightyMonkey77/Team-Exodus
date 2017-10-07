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
 * @author Kim
 */
public class ObstacleScene implements Serializable {
    
    private boolean isAnswered;

    public ObstacleScene() {
    }

    public boolean isIsAnswered() {
        return isAnswered;
    }

    public void setIsAnswered(boolean isAnswered) {
        this.isAnswered = isAnswered;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (this.isAnswered ? 1 : 0);
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
        final ObstacleScene other = (ObstacleScene) obj;
        if (this.isAnswered != other.isAnswered) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ObstacleScene{" + "isAnswered=" + isAnswered + '}';
    }
}
