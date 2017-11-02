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
            System.out.println(JamaicanExodus.getPlayer().getName() + "Enter your actors name as well as 4 additional"
                            + " party member names. ");
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
            
            System.out.println(actorsNames);
            String actor2 = "";
           
            while (!validated) {
            System.out.println("\n Enter First Name.");
            actor2 = keyboard.nextLine();
            actor2 = actor2.trim();
            
            if (actor2.length() <0){
                System.out.println("\n *Invalid Input*");
              continue;                                        
            }
            
             System.out.println(actorsNames);
            String actor3 = "";
           
            while (!validated) {
            System.out.println("\n Enter First Name.");
            actor3 = keyboard.nextLine();
            actor3 = actor3.trim();
            
            if (actor3.length() <0){
                System.out.println("\n *Invalid Input*");
              continue;                                        
            }
            
             System.out.println(actorsNames);
            String actor4 = "";
           
            while (!validated) {
            System.out.println("\n Enter First Name.");
            actor4 = keyboard.nextLine();
            actor4 = actor4.trim();
            
            if (actor4.length() <0){
                System.out.println("\n *Invalid Input*");
              continue;                                        
            }
                            
             System.out.println(actorsNames);
            String actor5 = "";
           
            while (!validated) {
            System.out.println("\n Enter First Name.");
            actor5 = keyboard.nextLine();
            actor5 = actor5.trim();
            
            if (actor5.length() <0){
                System.out.println("\n *Invalid Input*");
              continue;                                        
            }
                break;
        }
        return actor1;
    }
           
         

   
  
    
            
        
    }
    
      
   

