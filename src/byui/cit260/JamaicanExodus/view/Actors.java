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
public class Actors {
        
      private final String actorsNames;
      
      
      
      public Actors() {
            System.out.println(JamaicanExodus.getPlayer().getName() + "Enter your fellow travellers. "
                            + " (Enter Five Names) ");
          String actor1 = "";
          String actor2 = "";
          String actor3 = "";
          String actor4 = "";
          String actor5 = "";
                    
                    this.actorsNames = "\n***********************************************"
                            + "\n          Memebers of Your group:              "
                            + "\n                                               "
                            + "\n 1." + actor1 + "                              "
                            + "\n 2." + actor2 + "                              "
                            + "\n 3." + actor3 + "                              "
                            + "\n 4." + actor4 + "                              "
                            + "\n 5." + actor5 + "                              "
                            + "\n***********************************************";
            
      }   
      
      
        public void displayActorsNames() {
     
        boolean done = false;
        
        do{
        String actorsNamesGet= this.getActorsNames();
        
        if (actorsNamesGet.toUpperCase().equals("Q"))
            return;
        
        done = this.doAction (actorsNamesGet);
        
    }
        while(!done);
    }
        private String getActorsNames() {
            System.out.println(actorsNames);
            Scanner keyboard = new Scanner(System.in); 
            //String actors[] = new actors[5];
            //String actors = "";
            String actor1 = "";
            //  String actor2 = "";
            //  String actor3 = "";
            //  String actor4 = "";
            //  String actor5 = "";
            boolean validated = false;
        
            while (!validated) {
            System.out.println("\n Enter First Name.");
            actor1 = keyboard.nextLine();
            actor1 = actor1.trim();
            
            if (actor1.length() <0){
                System.out.println("\n *Invalid Input*");
              continue;                                        
            }
            
            
                break;
        }
        return actor1;
     
    }
        

    private boolean doAction(String actorsNameGet) {
        System.out.println("Future Home");
          return false;
    }
            
        
    }
    
      
   

