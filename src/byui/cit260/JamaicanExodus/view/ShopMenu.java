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
public class ShopMenu {
    
     private String shopMenu;
        
      public ShopMenu() {
        
        this.shopMenu = "\n       *****************************************************"
                +"\n       |            Shop Menu                   |"
                +"\n       ****************************************************"
                +"\n        S - Show Item"
                +"\n        B - Buy Item"
                +"\n        E - Exit"       
                +"\n       *****************************************************";
        
    }
    
    public void displayShop() {
      
        boolean done = false;
        
        do {
            String shopMenuOption = this.getShopMenuOption();
        
           //if (shopMenuOption.toUpperCase().equals("Q"))
               //return;
        
            done = this.doAction (shopMenuOption);
        
        }
        while(!done);
    }
    private String getShopMenuOption() {
        System.out.println(shopMenu);
        Scanner keyboard = new Scanner(System.in); 
        String value = "";
        boolean validated = false;
        
        while (!validated) {
            boolean shopMenu = false;
            System.out.println(shopMenu);
            System.out.println("\nSelect shop from the list.");
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() <0){
                System.out.println("\nInvalid Input");
                continue;    
            }
            break;
        }
        return value;
    }
    
    private boolean doAction(String choice){
        choice = choice.toUpperCase();
        switch(choice){
            case "S":
                this.showItem();
                return true;
            case "B":
                this.buy();
                return true;
            case "E":
                this.exit();
                return true;
        }
        return false;
        
    }

    private void showItem() {
        System.out.println("Item chosen");
    }

    private void buy() {
        System.out.println("Item Purchased");
    }

    private void exit() {
        System.out.println("Exiting menu");
    }
    
}
