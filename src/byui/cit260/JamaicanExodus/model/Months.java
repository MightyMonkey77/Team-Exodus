/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.model;

import java.util.Objects;

/**
 *
 * @author Office Payne
 */
public class Months {
    private String description;
    private String name;
    private int impact;
    
    public Months() {
    }

   public int getImpact() {
      return impact;
   }

   public void setImpact(int impact) {
      this.impact = impact;
   }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   @Override
   public int hashCode() {
      int hash = 3;
      hash = 89 * hash + Objects.hashCode(this.description);
      hash = 89 * hash + Objects.hashCode(this.name);
      hash = 89 * hash + this.impact;
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
      final Months other = (Months) obj;
      if (this.impact != other.impact) {
         return false;
      }
      if (!Objects.equals(this.description, other.description)) {
         return false;
      }
      if (!Objects.equals(this.name, other.name)) {
         return false;
      }
      return true;
   }

   @Override
   public String toString() {
      return "Months{" + "description=" + description + ", name=" + name + ", impact=" + impact + '}';
   }  
}
