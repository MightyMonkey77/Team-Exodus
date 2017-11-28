/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.view;

import byui.cit260.JamaicanExodus.JamaicanExodus;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.IllegalFormatException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Office Payne
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    protected final BufferedReader keyboard = JamaicanExodus.getInfile();
    protected final PrintWriter console = JamaicanExodus.getOutFile();
    
    public View() {
    }
    
    public View(String message){
        this.displayMessage = message;
    }
    
    @Override
    public void display()throws IllegalFormatException {
    try{
          
        boolean done = false;
        
        do {
            this.console.println(this.displayMessage);
            String choice = this.getInput();
            if (choice.toUpperCase().equals("Q"))
                return;
            done = this.doAction(choice);
        
        }
        while (!done);
        }
         catch 
           (IllegalFormatException me){
            ErrorView.display(this.getClass().getName(),me.getMessage());
        }
    }
    
    @Override
    public String getInput() throws IllegalFormatException {
        
        boolean valid = false;
        String value = null;
        
    try {
            
        while (!valid) {
            
           // System.out.println("\n" + this.displayMessage);
            value = this.keyboard.readLine();
            value = value.trim();
            
         if (value.length() <1){
            ErrorView.display(this.getClass().getName(), "Enter a valid entry:");
            continue;    
            }
            break;   
        }   
        } catch (IllegalFormatException e) {
        ErrorView.display(this.getClass().getName(),"Invalid, try again: " + e.getMessage());
        } catch (IOException ex) {                     
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }
        return value;
    }
  
}
    

