package byui.cit260.JamaicanExodus.view;

/**
 *
 * @author mikeg
 */
public class GameGoal extends View{
    

    
    public GameGoal() {
       super("\n*****************************************************"
             +"\n****************************************************"
             +"\n              WHY ARE YOU HERE?                     "  
             +"\n****************************************************" 
             +"\n****************************************************"  
             +"\n   Your goal is to travel from ____ to _____ in one "
             +"     piece! You will incounter, obsticale, equations  "
             +"     and hunger make the right choices.....           "
             +"\n****************************************************"  
             +"\n****************************************************"  
             +"\n****************************************************"  
             +"\n****************************************************"  
             +"\n****************************************************"  
             +"\n E - exit");




}


@Override
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

    private void exitGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
