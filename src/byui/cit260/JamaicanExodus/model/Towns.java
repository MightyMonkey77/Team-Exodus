/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.model;

import java.awt.Point;
/**
 *
 * @author Office Payne
 */
public enum Towns {
    
    Town1("Midas", new Point(1,1)),
    Town2("Minustria", new Point(2,2)),
    Town3("Leadest", new Point(3,3));
    
    private String Name;
    private Point townPosistion;

    Towns(String Name, Point townPosistion) {
        this.Name = Name;
        this.townPosistion = townPosistion;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Point getTownPosistion() {
        return townPosistion;
    }

    public void setTownPosistion(Point townPosistion) {
        this.townPosistion = townPosistion;
    }

    @Override
    public String toString() {
        return "Towns{" + "Name=" + Name + ", townPosistion=" + townPosistion + '}';
    }
    
    


}

    

