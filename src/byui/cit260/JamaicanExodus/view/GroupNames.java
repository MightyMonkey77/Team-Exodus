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
public class GroupNames {
        
      private final String groupNames;
      
      
      public GroupNames() {
            System.out.println("Enter your actors name as well as 4 additional"
                            + " party member names. ");
            this.groupNames = "\n***********************************************"
                            + "\n          Memebers of Your group:              "
                            + "\n                                               "
                            + "\n 1.                                            "
                            + "\n 2.                                            "
                            + "\n 3.                                            "
                            + "\n 4.                                            "
                            + "\n 5.                                            "
                            + "\n***********************************************";
            
      }
      
          public void displayGroupNames() {
        System.out.println(groupNames);
        boolean done = false;
        
        do{
        String groupNamesGet= this.getGroupNames();
        
        if (groupNamesGet.toUpperCase().equals("Q"))
            return;
        
        done = this.doAction (groupNamesGet);
        
    }
        while(!done);
    }
        private String getGroupNames() {
            Scanner keyboard = new Scanner(System.in); 
            String actor1 = "";
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
        
 

        

    private boolean doAction(String groupNamesGet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
            
        
    }
    
      
   

