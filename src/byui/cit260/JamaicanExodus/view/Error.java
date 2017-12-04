/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.view;

import byui.cit260.JamaicanExodus.JamaicanExodus;
import java.io.PrintWriter;

/**
 *
 * @author Office Payne
 */
public class Error {
    
    private static final PrintWriter errorFile = JamaicanExodus.getOutFile();
    private static final PrintWriter logFile = JamaicanExodus.getLogFile();
    
    public static void display(String className, String errorMessage){
        
        errorFile.println("***************************************"
                + "\n - ERROR - " + errorMessage
                + "**************************************");

        logFile.println(className + " - " + errorMessage);

            }
   
}
