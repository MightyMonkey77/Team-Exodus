/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.view;

import byui.cit260.JamaicanExodus.JamaicanExodus;
import byui.cit260.JamaicanExodus.model.Location;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Office Payne
 */
public class Map extends View{
    
     public Map () {
    /*
         super(
                "\n The Jamaican Exodus "
               +"\n---------------------"
               +"\n xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
               +"\n xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"         
               +"\n xxMDxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
               +"\n xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
               +"\n xxRDxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
               +"\n xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"         
               +"\n xxxxxLAxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
               +"\n xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"         
               +"\n xxxxxxxxxEPxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
               +"\n xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"         
               +"\n xxxxxxxxxxxxxBRxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
               +"\n xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
               +"\n xxxxxxxxxxxxxxxxSPxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
               +"\n xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
               +"\n xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
               +"\n xxxxxxxKIxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
               +"\n xxxxxxxxxxxxxxxFRxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
               +"\n---------------------");   
     
     }
     private boolean message;
     
     @Override
    public boolean doAction(String choice) {
        Actor actor = null;
        
       
       
        try{
        choice = choice.toUpperCase(); //convert choice to upper case
        
        switch (choice){
            
            case "E"://what is the goal?
                System.out.println("\nReturning to the Game Menu");
                break;

 
            default:
                System.out.println("\nInvalid selection. Try again");
                break;
   
            }
        } catch
             (IllegalFormatException me){
                System.out.println(me.getMessage());
                }
        
        return false;
        
    } 

    String buildMap(int x, int y) {
       System.out.println("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         return null;
    }
 */
            super("\n"
                + "\nM - Move to new location"
                + "\nP - Print list of map locations"
                + "\nQ - Quit to previous menu"
                + "\n----------------------------------------------------"
                + "\n"
                + "\n Please enter your choice:");
    }
   
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();

        switch (value) {
            case "M":
                MoveLocationView moveLocationView = new MoveLocationView();
                moveLocationView.display();
                break;
            case "P":
                PrintMapView printMapView = new PrintMapView();
                printMapView.display();
                break;
            default:
                Error.display(this.getClass().getName(), "*** Error: invalid choice entered. Try again. ***");

        }
        return false;

    }

    private void printReport() {
        
        String filePath = this.getFilePath();
        String list = "\n"
               +"\n----------------------------------------------------"              
                +"\n List of map loctations                            |"
                +"\n----------------------------------------------------"
                +"\n   Name, Scene Type, Miles from Start"
                +"\n";
        Location[][] locations = JamaicanExodus.getCurrentGame().getMap().getLocations();
        for (Location[] location : locations) {
            for (Location stop : location) {
                list += "\n" + stop.getSymbol() + ", " + stop.getTowns().getDescription() 
                + ", " + stop.getTowns().getMilesFromStart();
                
            }
        }
        this.console.print(list);
        try {
            // save report to specified file.
        printMapReport(list, filePath);
        }
        catch (Exception ex) {
            Error.display(this.getClass().getName(), ex.getMessage());
        }
        display();
    }

    private String getFilePath() {
        String value = "";
        boolean valid = false;
        try {
            while (!valid) {
                value = keyboard.readLine();
                value = value.trim();
                
                if (value.length() < 1) {
                    Error.display(this.getClass().getName(), "\nInvalid value: value cannot be blank"
                            + "\n Enter game file path");
                    continue;
                }
                break;
            }
        } catch (IOException ex) {
            Error.display(this.getClass().getName(), "Error reading input: " + ex.getMessage());
            
        }
        return value;
}

    private void printMapReport(String list, String filePath) {
        
        // try with resources will auto close at end
        try (PrintWriter out = new PrintWriter(filePath)) {
            // print title and column headings
            out.println("\n\n       LIST OF MAP LOCATIONS       \n");
            out.printf("%n%-10s%20s%10s", "Symbol", "Description", "Scene Type");
            out.printf("%n%-10s%20s%10s", "------", "-----------", "----------");
            
            // print symbol, description, and scenetype of each item
        for (Location[] location : JamaicanExodus.getCurrentGame().getMap().getLocations()) {
            for (Location stop : location) {
                out.printf("%n%-10s%20s%10s", stop.getSymbol(), stop.getTowns().getDescription(),stop.getScenes().getDescription());
                
            }
        }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Map.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    String buildMap(int x, int y) {
        System.out.println("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         return null;
    }
   
}
