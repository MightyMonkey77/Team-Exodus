/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.model;

/**
 *
 * @author Office Payne
 */
public class JamaicanExodus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    // Daryl's work   
        Player playerOne = new Player();
        playerOne.setName("Fred Flinstone");
        String playerOneName = playerOne.getName();
       
       System.out.println("Name = " + playerOneName + " is a stud.");
     //Daryl's
        Actor.Father.getName();
        Actor.Father.getDescription();
        
       System.out.println("Name =" + Actor.Father);
        //Daryl's       
       Farmer farmerJob = new Farmer();
       farmerJob.setStartMoney(100.00);
       double farmerJobStartMoney = farmerJob.getStartMoney();
       System.out.println("Starting Money = "+ farmerJobStartMoney + " This is all the monies you get.");
        //Daryl's       
       Farmer farmerDescription = new Farmer();
       farmerDescription.setDescription("You were a local farmer whom left the occupation of the lands" 
              + " of your home city. Now you are escaping for freedom.");
       String farmerDescriptionGet = farmerDescription.getDescription();
       System.out.println("Farmer job description = "+farmerDescriptionGet);
       //Daryl's
       Game descriptionOf = new Game();
       descriptionOf.setDescription("The Jamaican Exodus is a text based game. It begins in the town of Frome."
               +"\nWhere those in power subjugated the people with heavy burdens. They hear of an opportunity to work and live in Oregon where"
               +"\nthey have established a refugee camp. \n" 
               + "Gerain and his family pack up and purchase provisions for their trip to the port town of Kingston. Once they arrive in Kingston,"
               +"\nGerain is conscripted to work on a ship heading to Florida where his fee is to work the lower decks with his family. They must"
               +"\npass many obstacles in their journey. Once they arrive in Tampa, Florida they must pay to begin the journey westward via train."
               +"\nFrom Tampa they go to Birmingham, Alabama where the family must take time to collect funding and food stores. Then they go to "
               +"\nHouston Texas where they have another trial of faith. Then on to Denver, Colorado to Salt Lake City, Utah. To the final "
               +"\ndestination of Bend Oregon where the base camp is at." 
               +"\nThe family will have to work by overcoming obstacles and solving equations to gain funds in order to maintain currency flow."
               +"\nSome obstacles can be skipped and will not add to the money flow. These will lead the family to the destination.\n" 
               +"\nThe game begins in the home town of Frome. During the game, you will need to plan for the trip, locate the needed resources,"
               +"\nand set out on your journey to the first stop of Kingston.");
       String descriptionOfGet = descriptionOf.getDescription();
       System.out.println("Game description =" + descriptionOfGet);
       //Daryl's
       Map mapLocation = new Map();
       mapLocation.setLocation(11);
       int mapLocationSet = mapLocation.getLocation();
       System.out.println("Map location is "+ mapLocationSet);
       //Daryl's
       Inventory inventoryItemDescription = new Inventory();
       inventoryItemDescription.setInventoryItemDescription("Tools of the trade.");
       String inventoryItemDescriptionSet = inventoryItemDescription.getInventoryItemDescription();
       System.out.println("Item is = "+ inventoryItemDescriptionSet);
       //Daryl's
       Speed rateOne = new Speed();
       rateOne.setRate(3);
       int rateOneSet = rateOne.getRate();
       System.out.println("Rate of comsumption or loss = " + rateOneSet);
       
         // Kims Work
        
        Obstacles obstacleDescription = new Obstacles();
        obstacleDescription.setObstacleDescription("Blah Blah Blah");
        String obstacleDescriptionCurrent = obstacleDescription.getObstacleDescription();
        System.out.println(obstacleDescriptionCurrent);
        
        //Boolean howto?
        //EquationScene isAnswered = new EquationScene();
        //isAnswered.isIsAnswered(1);
        //String isAnsweredNow = isAnswered.getIsAnswered();
        //System.out.println();
        
        Equation equation = new Equation();
        equation.setEquation("Who is buried in Grant's tomb?");
        String equationCurrent = equation.getEquation();
        System.out.println(equationCurrent);
        
        //Boolean howto?
        //ObstacleScene isAnswered = new ObstacleScene();
        //isAnswered.isIsAnswered(1);
        //String isAnsweredNow = isAnswered.getIsAnswered();
        //System.out.println();
        
        ResourceType description = new ResourceType();
        description.setDescription ("Jewel-encrusted egg");
        String descriptionCurrent = description.getDescription();
        System.out.println(descriptionCurrent);       
    }
    
}
