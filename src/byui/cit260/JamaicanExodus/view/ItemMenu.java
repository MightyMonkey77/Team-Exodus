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
public class ItemMenu extends View{
    // This is to be cahnged to inventory. Daryl
   
        
      public ItemMenu() {
        
        super( "\n     *****************************************************"
                +"\n       |            Item Menu                   |"
                +"\n       ****************************************************"
                +"\n        I - Items"
                +"\n        Q - Quantity"
                +"\n        E - Exit"       
                +"\n       *****************************************************");
        
    }
    
 
    
      @Override
    public boolean doAction(String choice){
        choice = choice.toUpperCase();
        switch(choice){
            case "I":
                this.items();
                return true; // true statements added to all selections to avoid loop in testing - Daryl
                
            case "Q":
                this.quantity();
                return true;
                
            case "E":
                this.exit();
                return true;
                
            default :
                System.out.println("\nInvalid Selection"); //Added Daryl
                return false;    
        }
      
        
    }

    private void items() {
        System.out.println("Item");
    }

    private void quantity() {
        System.out.println("Quantity");
    }

    private void exit() {
        System.out.println("Exiting menu");
    }

       
}


