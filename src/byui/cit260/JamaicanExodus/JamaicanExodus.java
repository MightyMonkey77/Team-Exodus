/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus;


import byui.cit260.JamaicanExodus.model.Actor;
import byui.cit260.JamaicanExodus.model.Game;
import byui.cit260.JamaicanExodus.model.Inventory;
import byui.cit260.JamaicanExodus.model.Months;
import byui.cit260.JamaicanExodus.model.Obstacles;
import byui.cit260.JamaicanExodus.model.Occupations;
import byui.cit260.JamaicanExodus.model.Player;
import byui.cit260.JamaicanExodus.view.Map;
import byui.cit260.JamaicanExodus.view.StartProgram;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Office Payne
 */
public class JamaicanExodus {

    private static Game currentGame = null;
    private static Player player = null;
    private static Actor[] actor = null;
    private static Inventory[] inventory = null;
    private static Map[][] map =null;
    private static Obstacles[] obstacles = null;
    private static Months[] months = null;
    private static Occupations[] occupations = null;
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    private static PrintWriter logFile = null;

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        JamaicanExodus.logFile = logFile;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        JamaicanExodus.outFile = outFile;
    }

    public static BufferedReader getInfile() {
        return inFile;
    }

    public static void setInfile(BufferedReader infile) {
        JamaicanExodus.inFile = infile;
    }

    public static Months[] getMonths() {
        return months;
    }

    public static void setMonths(Months[] months) {
        JamaicanExodus.months = months;
    }

    public static Occupations[] getOccupations() {
        return occupations;
    }

    public static void setOccupations(Occupations[] occupation) {
        JamaicanExodus.occupations = occupations;
    }

    public static Obstacles[] getObstacles() {
        return obstacles;
    }

    public static void setObstacles(Obstacles[] obstacles) {
        JamaicanExodus.obstacles = obstacles;
    }

    public static Actor[] getActor() {
        return actor;
    }

    public static void setActor(Actor[] actor) {
        JamaicanExodus.actor = actor;
    }

    public static Inventory[] getInventory() {
        return inventory;
    }

    public static void setInventory(Inventory[] inventory) {
        JamaicanExodus.inventory = inventory;
    }

    public static Map[][] getMap() {
        return map;
    }

    public static void setMap(Map[][] map) {
        JamaicanExodus.map = map;
    }
            
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        JamaicanExodus.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        JamaicanExodus.player = player;
    }
    
    
    
    public static void main(String[] args) { 
        
        try {
        
            JamaicanExodus.inFile = new BufferedReader(new InputStreamReader(System.in));
            JamaicanExodus.outFile = new PrintWriter(System.out, true);
            
            //Log file
            String filePath = "log.txt";
            JamaicanExodus.logFile = new PrintWriter(filePath);
        
        
            StartProgram startProgram = new StartProgram();
            startProgram.displayStartProgram();
        
        } 
        catch (Throwable e) {
            System.out.println("Exception:" + e.toString() + "\nCause:" + e.getCause() + "\nMessage:" + e.getMessage());
            e.printStackTrace();   
        }
        finally {
            try {
                if (JamaicanExodus.inFile != null)
                        JamaicanExodus.inFile.close();
                if (JamaicanExodus.outFile != null)
                        JamaicanExodus.outFile.close();
                if (JamaicanExodus.logFile != null)
                        JamaicanExodus.logFile.close();
                
            } catch (IOException ex) {
                System.out.println("Error closing files.");
                return;
            }
            
        }
  }

    public static void setMap(byui.cit260.JamaicanExodus.model.Map map) {
        System.out.println("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void setMap(Map map) {
        System.out.println("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void setOccupations(Occupations occupations) {
        System.out.println("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
   

   
   

    

    

    
      

    
    
    
}
