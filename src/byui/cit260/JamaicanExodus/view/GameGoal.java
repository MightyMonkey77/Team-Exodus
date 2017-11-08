/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.view;

/**
 *
 * @author mikeg
 */
public class GameGoal extends View{
    

    
    public GameGoal() {
       super("\n*****************************************************"
             +"\n****************************************************"
             +"\n              WHY ARE YOU HERE                      "  
             +"\n****************************************************" 
             +"\n****************************************************"  
             +"\n   Your goal is to travel from ____ to _____ in one "
             +"     piece! You will incounter, obsticale and hunger  "
             +"     make the right choices.....                      "
             +"\n"  
             +"\n"  
             +"\n"  
             +"\n"  
             +"\n"  
             +"\n E - exit");




}


@override
    public boolean doAction(String choice){
        choice = choice.toUpperCase();
        switch(choice){
            case "E":
                this.exitGame();
                return false;
            default :
                System.out.println("\nInvalid Choice");
                return false;
        }
        //return true;
    }    