/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.view;


import byui.cit260.JamaicanExodus.model.Actor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Office Payne
 */
public class Actors {
        
    private final List<Actor> actors = new ArrayList<>();
    
  
    public Actors() {}
       
      public void displayActorsNames() {
          
           boolean done = false;
        
        do{
        String actor = this.getActor();
        done = this.doAction (actor);   
    }
        while(!done);
    }
          private String getActor() {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter first companions name: ");
      String actorName1 = keyboard.nextLine();
      Actor companionOne = new Actor();
      companionOne.setName(actorName1);
      
      actors.add(companionOne);
      
      System.out.println("Enter second companions name: ");
      String actorName2 = keyboard.nextLine();
      Actor companionTwo = new Actor();
      companionTwo.setName(actorName2);
      
      actors.add(companionTwo);
        
      System.out.println("Enter third companions name: ");
      String actorName3 = keyboard.nextLine();
      Actor companionThree = new Actor();
      companionThree.setName(actorName3);
      
      actors.add(companionThree);
      
      System.out.println("Enter fourth companions name: ");
      String actorName4 = keyboard.nextLine();
      Actor companionFour = new Actor();
      companionFour.setName(actorName4);
      
      actors.add(companionFour);
      
      System.out.println("Enter fifth companions name: ");
      String actorName5 = keyboard.nextLine();
      Actor companionFive = new Actor();
      companionFive.setName(actorName5);
      
      actors.add(companionFive);
        return null;
          }  

    private boolean doAction(String menuOption) {
        for (Actor actor : actors) {
            System.out.println(actor);
        }
        return true;
    }
}
  
        
   

   
 
   

