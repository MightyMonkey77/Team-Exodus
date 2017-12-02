/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.model;
/**
 *
 * @author Office Payne
 */
public enum Towns {
    
    Town1("Froome", 0 , 0, "FR", 1, 1, "Starting town."),
    Town2("Kingston", 0, 0, "KI", 2, 1, "Second town"),
    Town3("Saint Petersburg", 0, 0, "SP", 3, 1, "Third town");
    

    private String Name;
    private int milesFromStart;
    private int milesToNext;
    private String symbol;
    private int x;
    private int y;
    private String description;

    private Towns(String Name, int milesFromStart, int milesToNext, String symbol, int x, int y, String description) {
        this.Name = Name;
        this.milesFromStart = milesFromStart;
        this.milesToNext = milesToNext;
        this.symbol = symbol;
        this.x = x;
        this.y = y;
        this.description = description;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getMilesFromStart() {
        return milesFromStart;
    }

    public void setMilesFromStart(int milesFromStart) {
        this.milesFromStart = milesFromStart;
    }

    public int getMilesToNext() {
        return milesToNext;
    }

    public void setMilesToNext(int milesToNext) {
        this.milesToNext = milesToNext;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Towns{" + "Name=" + Name + ", milesFromStart=" + milesFromStart + ", milesToNext=" + milesToNext + ", symbol=" + symbol + ", x=" + x + ", y=" + y + ", description=" + description + '}';
    }

   

    

}

    

