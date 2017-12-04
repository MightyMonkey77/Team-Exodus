/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.view;

/**
 *
 * @author Office Payne
 */
public class ShopMenu extends View {
    
    
        
      public ShopMenu() {
        
        super("\n       *****************************************************"
                +"\n       |            Shop Menu                   |"
                +"\n       ****************************************************"
                +"\n        S - Show Item"
                +"\n        B - Buy Item"
                +"\n        E - Exit"       
                +"\n       *****************************************************");
        
    }
    
 
    
      @Override
    public boolean doAction(String choice){
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
        ShopItemView shopItemView = new ShopItemView();
        shopItemView.display();
    }

    private void exit() {
        System.out.println("Exiting menu");
    }
    
}
