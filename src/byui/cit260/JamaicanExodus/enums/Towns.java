/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.enums;

/**
 *
 * @author Office Payne
 */
public enum Towns {
    
     froome("You begin your journey, purchase supplies.",0,150,1, 0),
     kingston("Port town with shop", 150, 100, 2, 1),
     saintPetersburg("Florida town port", 250, 150, 3, 1),
     birmingham("Train stop", 400, 200, 4, 1),
     elPaso("Trian stop", 600, 150, 5, 1),
     losAngeles("Train Stop", 750, 250, 6, 1),
     redding("Train stop", 1000, 300, 7, 1 ),
     medford("Finish line", 1300, 0 ,8, 1);


    private String description;
    private int milesStart;
    private int milesNext;
    private int x;
    private int y;

    private Towns(String description, int milesStart, int milesNext, int x, int y) {
        this.description = description;
        this.milesStart = milesStart;
        this.milesNext = milesNext;
        this.x = x;
        this.y = y;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMilesStart() {
        return milesStart;
    }

    public void setMilesStart(int milesStart) {
        this.milesStart = milesStart;
    }

    public int getMilesNext() {
        return milesNext;
    }

    public void setMilesNext(int milesNext) {
        this.milesNext = milesNext;
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

    @Override
    public String toString() {
        return "Towns{" + "description=" + description + ", milesStart=" + milesStart + ", milesNext=" + milesNext + ", x=" + x + ", y=" + y + '}';
    }
    
    


}