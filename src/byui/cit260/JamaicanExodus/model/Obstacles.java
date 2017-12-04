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
public class Obstacles implements Serializable {
private String obstacleDescription;
private String answer;

    public Obstacles() {
    }

    public String getObstacleDescription() {
        return obstacleDescription;
    }

    public void setObstacleDescription(String obstacleDescription) {
        this.obstacleDescription = obstacleDescription;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.obstacleDescription);
        hash = 97 * hash + Objects.hashCode(this.answer);
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
        final Obstacles other = (Obstacles) obj;
        if (!Objects.equals(this.obstacleDescription, other.obstacleDescription)) {
            return false;
        }
        if (!Objects.equals(this.answer, other.answer)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Obstacles{" + "obstacleDescription=" + obstacleDescription + ", answer=" + answer + '}';
    }
    
}


