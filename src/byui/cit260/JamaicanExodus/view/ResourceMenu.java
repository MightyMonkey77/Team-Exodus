//
// @Kimbuilt
//

package byui.cit260.JamaicanExodus.view;

import java.util.Scanner;

public class ResourceMenu extends View{
   
      public ResourceMenu() {
        
        super( "\n"   
               +"\n              Resource Explanations                 "
               +"\n  --------------------------------------------------"
               +"\n    A - Ammunition" 
               +"\n    C - Clothing"
               +"\n    F - Food"
               +"\n    M - Medicine"
               +"\n    O - Oxen"
               +"\n    S - Skittles" 
               +"\n    X - Exit" 
               +"\n  --------------------------------------------------"
               +"\n");
   }   
      @Override 
    public boolean doAction(String choice){
        choice = choice.toUpperCase();
        switch(choice){
            case "A":
                this.Ammunition();
                return false; //false to keep looping
                
            case "C":
                this.Clothing();
                return false;
                
            case "F":
                this.Food();
                return false;
            
            case "M":
                this.Medicine();
                return false;
                
            case "O":
                this.Oxen();
                return false;
                
            case "S":
                this.Skittles();
                return false;
                
            case "X":
                System.out.println("\n Godspeed and Good Luck!");  
                return true; // true to end the loop and return   
                
            default :
                System.out.println("\nInvalid Selection"); 
                return false;    
        }
    }

    private void Ammunition() {
        System.out.println("\n Ammunition:"
                + "\n The stuff we like to talk about to drive Daryl nuts. "
                + "\n");
    }

    private void Clothing() {
        System.out.println("\n Clothing: "
                + "\n You will want a sufficient amount to cover yourself"
                + "\n for the elements and weather."
                + "\n Depending on the month, you may want more..."
                + "\n                            - just sayin'"
                + "\n");
    }

    private void Food() {
        System.out.println("\n Food: "
                + "\n You will want as much of this to sustain you as possible."
                + "\n If you decide to travel faster, you will need more."
                + "\n If you decide to travel further, you will need more."
                + "\n If you are sick, you will need to eat well to regain health."
                + "\n");
    }

    private void Medicine() {
        System.out.println("\n Medicine: "
                + "\n If you have some, you will be able to regain health"
                + "\n without having to eat as much food."
                + "\n There are also conditions which can't be remedied by"
                + "\n simply eating. "
                + "\n");
    }
     
    private void Oxen() {
        System.out.println("\n Oxen: "
                + "\n These are the big four-legged ugly things that carry"
                + "\n your stuff.  Rumor has it, they taste like chicken."
                + "\n");
    }
    
    private void Skittles() {
        System.out.println("\n Skittles"
                + "\n These are magical little treats that cure any illness"
                + "\n and fill anyone's belly.  Good luck finding any, and be"
                + "\n advised, you may have to confront Marshawn Lynch to "
                + "\n get some.  #worthit"
                + "\n");
    }
}


