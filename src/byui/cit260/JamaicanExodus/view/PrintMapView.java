/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.view;

import byui.cit260.JamaicanExodus.JamaicanExodus;
import byui.cit260.JamaicanExodus.model.Location;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Office Payne
 */
public class PrintMapView extends View{
    
    public PrintMapView() {
        
        super("\nEnter the file path where you want the report to be saved.");
    }

    

    @Override
    public boolean doAction(String filePath) {
        boolean done = false;
     // try with resources will auto close at end
        try (PrintWriter out = new PrintWriter(filePath)) {
            // print title and column headings
            out.println("\n\n               LIST OF MAP LOCATIONS       \n");
            out.printf("%n%-10s%-30s%-20s", "Symbol", "Description", "Scene Type");
            out.printf("%n%-10s%-30s%-20s", "------", "-----------", "----------");
            
            // print symbol, description, and scenetype of each item
            Location[][] locations = JamaicanExodus.getCurrentGame().getMap().getLocations();
                for (Location[] location : locations) {
                    for (Location stop : location) {
                      String name = stop.getTowns().name();
                         String description = stop.getTowns().getDescription();
                         String scene = stop.getScenes().getDescription();
                         System.out.printf("%n%-10s%-30s%-10s", name,  description, scene);
                
            }
        }
        this.console.println("\n File printed successfully to " + filePath);
        
        } catch (IOException ex) {
            Error.display(this.getClass().getName(), "Error saving Locations to file");
            
        }
        GameMenu gameMenu = new GameMenu();
        gameMenu.displayMap();
        return true;
    }
    
}
    

