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
public class ItemMenu {
    // This is to be cahnged to inventory. Daryl
     private final String ItemMenu;
        
      public ItemMenu() {
        
        this.ItemMenu = "\n     *****************************************************"
                +"\n       |            Item Menu                   |"
                +"\n       ****************************************************"
                +"\n        I - Items"
                +"\n        Q - Quantity"
                +"\n        E - Exit"       
                +"\n       *****************************************************";
        
    }
    
    public void displayItemMenu() {
      
        boolean done = false;
        
        do {
            String ItemMenuOption = this.getItemMenuOption();
        
            //if (menuOption.toUpperCase().equals("Q"))
            //    return;
        
            done = this.doAction (ItemMenuOption);
        
        }
        while(!done);
    }
    private String getItemMenuOption() {
        Scanner keyboard = new Scanner(System.in); 
        String value = "";
        boolean validated = false;
        
        while (!validated) {
            System.out.println(ItemMenu);
            System.out.println("\nSelect shop from the list.");
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() <0){
                System.out.println("\nInvalid Input");
            }
            else if (value.length() >1){
                System.out.println("\nInvalid Input");
            }
            break; // Added a break to stop loop - Daryl
        }
        return value;
            
        
  
    }
    
    private boolean doAction(String choice){
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


