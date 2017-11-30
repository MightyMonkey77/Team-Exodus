/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.view;

import byui.cit260.JamaicanExodus.model.Inventory;

/**
 *
 * @author Office Payne
 */
public class ShopItemView extends View {
    
    public static Inventory[] inventoryList;

    public ShopItemView() {
        super ("\n **************************************************"
                + "\n             Choose your item                       "
                + "\n****************************************************"
                + "\n 1 - Clothing"
                + "\n 2 - Rations"
                + "\n 3 - Fuel"
                + "\n 4 - Tools"
                + "\n 5 - Computer"
                + "\n 6 - Calculator"
                + "\n 7 - Farm Tools"
                + "\n 8 - Medicine"
                + "\n*****************************************************");
    
    }

    @Override
    public boolean doAction(String choice) {
    
        choice = choice.toUpperCase();
        switch(choice) {
            case "1":
                this.clothing();
                break;
            case "2":
                this.rations();
                break;
            case "3":
                this.fuel();
                break;
            case "4":
                this.tools();
                break;
            case "5":
                this.computer();
                break;
            case "6":
                this.calculater();
                break;
            case "7":
                this.farmTools();
                break;
            case "8":
                this.medicine();
                break;
            default:
                System.out.println("\n Invalid Choice");
                return false;     
        }
            return true;
    }

    private void clothing() {
        System.out.println("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void rations() {
        System.out.println("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void fuel() {
        System.out.println("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void tools() {
        System.out.println("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void computer() {
        System.out.println("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void calculater() {
        System.out.println("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void farmTools() {
        System.out.println("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void medicine() {
        System.out.println("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
