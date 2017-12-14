/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.control;

import byui.cit260.JamaicanExodus.JamaicanExodus;
import static byui.cit260.JamaicanExodus.control.GameControl.pressEnterToContinue;
import byui.cit260.JamaicanExodus.model.Actor;
import byui.cit260.JamaicanExodus.model.Game;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Office Payne
 */
public class Actors {

   private final List<Actor> actors = new ArrayList<>();

   public Actors() {
   }

   public void displayActorsNames() {

      boolean done = false;

      do {
         List<Actor> actor = this.getActor();
         done = this.doAction(actor);
      } while (!done);
   }

   private List<Actor> getActor() {

      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter your spouce's name: ");
      String actorName1 = keyboard.nextLine();
      Game currentGame = JamaicanExodus.getCurrentGame();
      Actor[] actor = currentGame.getActor();
      Actor actorOne = actor[0];
      actorOne.setName(actorName1);
      actor[0] = actorOne;

      System.out.print("Enter your first child's name: ");
      String actorName2 = keyboard.nextLine();
      Actor actorTwo = actor[1];
      actorTwo.setName(actorName2);
      actor[1] = actorTwo;

      System.out.print("Enter your second child's name: ");
      String actorName3 = keyboard.nextLine();
      Actor actorThree = actor[2];
      actorThree.setName(actorName3);
      actor[2] = actorThree;

      System.out.print("Enter the name of your best friend: ");
      String actorName4 = keyboard.nextLine();
      Actor actorFour = actor[3];
      actorFour.setName(actorName4);
      actor[3] = actorFour;

      System.out.print("Enter the name of your spouce's best friend: ");
      String actorName5 = keyboard.nextLine();
      Actor actorFive = actor[4];
      actorFive.setName(actorName5);
      actor[4] = actorFive;

      System.out.println("\n"
              + "Party Summary"
              + "-------------\n\n"
              + "Actor: YOU \n\tYou should know your name by now. \n\tDo YOU know where you are? How ya feeling?");

      return actors;
   }

   private boolean doAction(List<Actor> actor) {

      for (int i = 0; i < JamaicanExodus.getCurrentGame().getActor().length; i++) {
         System.out.println(JamaicanExodus.getCurrentGame().getActor()[i]);
      }
      System.out.println("\n\n");
      pressEnterToContinue();
      
      //clearScreen(); //tried-failed
      
      return true;
   }
}

