/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.view;


import byui.cit260.JamaicanExodus.model.Player;
import java.util.Scanner;

/**
 *
 * @author Office Payne
 */
public class StartProgram {
    
    private final String promptMessage;
    private boolean valid;
    
    public StartProgram() {
    
        this.promptMessage = "\n    Please enter your name: ";
        //displays ask for name message
        this.displayBanner();
        
    
    }

    private void displayBanner() {
         System.out.println("\n*************************************************************"
                          +"\n                                                             "
                          +"\nThe Jamaican Exodus is a text based game. It begins ...      "
                          +"\ntown of Frome. Where those in power subjugated the people    "
                          +"\nwith heavy burdens. They hear of an opportunity to work and  "
                          +"\nlive in Oregon where they have established a refugee camp.   "
                          +"\n                                                             "
                          +"\nGerain and his family pack up and purchase provisions for    "
                          +"\ntheir trip to the port town of Kingston. Once they arrive    "
                          +"\nin Kingston, Gerain is conscripted to work on a ship heading "
                          +"\nto Florida where his fee is to work the lower decks with     "
                          +"\nhis family. They must pass many obstacles in their journey.  "
                          +"\nOnce they arrive in Tampa, Florida they must pay to begin    "
                          +"\nthe journey westward via train. From Tampa they go to        "
                          +"\nBirmingham, Alabama where the family must take time to       "
                          +"\ncollect funding and food stores. Then they go to Houston     "
                          +"\nTexas where they have another trial of faith. Then on to     "
                          +"\nDenver, Colorado to Salt Lake City, Utah. To the final       "
                          +"\ndestination of Bend Oregon where the base camp is at.        "
                          +"\n                                                             " 
                          +"\nThe family will have to work by overcoming obstacles and     "
                          +"\nsolving equations to gain funds in order to maintain currency"
                          +"\nflow. Some obstacles can be skipped and will not add to the  "
                          +"\nmoney flow. These will lead the family to the destination.   "
                          +"\n                                                             " 
                          +"\nThe game begins in the home town of Frome. During the game,  "
                          +"\nyou will need to plan for the trip, locate the needed        "
                          +"\nresources, and set out on your journey to the first stop of  "
                          +"\nKingston.                                                    "
                          +"\n                                                             "
                          +"\n*************************************************************");
    
   }

    public void displayStartProgram() {
        boolean done = false;
        do {
            //get player name by prompt
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q")) // shows the user quitting option
                return;
            
            //do the request and display the next action
            done = this.doAction(playersName);
           }
        while (!done);
    }

    private String getPlayersName() {
        Scanner keyboard = new Scanner(System.in); //get infile from keyboard
        String value = "";
      
        boolean validated = false;
        
       while (!validated) {
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 1) {
                
                System.out.println("\nInvalid value: Cannot be blank.");
                continue;
            }
            break; // ends the loop
            }
        return value;
    }

    private boolean doAction(String playersName) {
        if (playersName.length() < 2){
          System.out.println("\nInvalid player name"
          + " The player name must be greater than one character in length.");
          return false;
         }
      
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) { //if unsuccesfull.
            System.out.println("\nError creating the player.");
            return false;  
        }
      
        
        this.displayNextView(player);
        return true; //success
    }

    private void displayNextView(Player player) {
        // Adds player name to next output. Welcoming them
          System.out.println("\n ================================================="
                         + "\n Welcome to the Jamaican Exodus " + player.getName()
                         + "\n Move your family and friends to the United States. "
                         + "\n Where new opportunities await."        
                         + "\n =================================================");
        
        MainMenu mainMenu = new MainMenu();
        // Main menuy object        
        mainMenu.display();
    }
    
    

  
    }
