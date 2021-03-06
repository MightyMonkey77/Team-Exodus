/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Office Payne
 */
public class Actor implements Serializable {

   private String name;
   private String description;
   private int coordinates;
   private int startingHealth = 100;

   public Actor() {
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public int getCoordinates() {
      return coordinates;
   }

   public void setCoordinates(int coordinates) {
      this.coordinates = coordinates;
   }

   public int getStartingHealth() {
      return startingHealth;
   }

   public void setStartingHealth(int startingHealth) {
      this.startingHealth = startingHealth;
   }

   @Override
   public int hashCode() {
      int hash = 5;
      hash = 19 * hash + Objects.hashCode(this.name);
      hash = 19 * hash + Objects.hashCode(this.description);
      hash = 19 * hash + Objects.hashCode(this.coordinates);
      hash = 19 * hash + this.startingHealth;
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
      final Actor other = (Actor) obj;
      if (this.startingHealth != other.startingHealth) {
         return false;
      }
      if (!Objects.equals(this.name, other.name)) {
         return false;
      }
      if (!Objects.equals(this.description, other.description)) {
         return false;
      }
      if (!Objects.equals(this.coordinates, other.coordinates)) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {

      return "Actor: " + name + "\n\tDescription:" + description + "\n\tCoordinates:" + coordinates + "\tStarting Health:" + startingHealth;
   }

   //  public void setCoordinates(int i, int i0) 
   public void setCoordinates(int i, int i0) {
      System.out.println("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

}
