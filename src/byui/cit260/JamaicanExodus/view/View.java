/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.view;

import java.util.Scanner;

/**
 *
 * @author Office Payne
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    public View() {
    }
    
    public View(String message){
        this.displayMessage = message;
    }
    
    @Override
    public void display() {
        
        boolean done = false;
        do {
            String choice = this.getInput();
            if (choice.toUpperCase().equals("Q"))
                return;
            done = this.doAction(choice);
        
        }while (!done);
    
    }
    
    @Override
    public String getInput() {
        
        Scanner keyboard = new Scanner(System.in); 
        boolean valid = false;
        String value = null;
        
        while (!valid) {
            
            System.out.println("\n" + this.displayMessage);
            
            value = keyboard.nextLine();
            value = value.trim();
                       
            if (value.length() <1){
                System.out.println("\nInvalid Input");
                continue;    
            }
            break;
        }
        return value;
    }
  
}
    

