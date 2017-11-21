/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.view;

import java.util.IllegalFormatException;

/**
 *
 * @author Office Payne
 */
public class Map extends View{
    
     public Map () {
    
         super(
                "\n The Jamaican Exodus "
               +"\n---------------------"
               +"\n                     "
               +"\n  ?                  "
               +"\n  ?                  "
               +"\n      ?              "
               +"\n          ?          "
               +"\n              ?      "
               +"\n                     "
               +"\n                 ?   "
               +"\n                     "
               +"\n                     "
               +"\n          ?          "
               +"\n                ?    "
               +"\n---------------------");   
     
     }
     private boolean message;
     
     @Override
    public boolean doAction(String choice) {
    
        // this is the help menu do action function
       
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
 
   
}
