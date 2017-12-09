package byui.cit260.JamaicanExodus.enums;

/**
 *
 * Kimbuilt
 */

public enum Locations{
//("display name", "distance to next city", "x-coor", "y-coor") 
// CITIES   
   froome      ("Froome",       500,1,0),
   kingston    ("Kingston",     500,2,1),
   stPetersburg("St Petersburg",500,3,1),
   montgomery  ("Montgomery",   645,4,1),
   dallas      ("Dallas",       644,5,1),
   albuquerque ("Albuquerque",  574,6,1),
   lasVegas    ("Las Vegas",    448,7,1),
   reno        ("Reno",         344,8,1),
   medford     ("Medford",        0,9,0),
   
// OBSTACLES
   obstacle1("Obstacle 1",0,1,9),
   obstacle2("Obstacle 2",0,2,9),
   obstacle3("Obstacle 3",0,3,9),
   obstacle4("Obstacle 4",0,4,9),
   obstacle5("Obstacle 5",0,5,9),
   obstacle6("Obstacle 6",0,6,9),
   obstacle7("Obstacle 7",0,7,9),
   obstacle8("Obstacle 8",0,8,9),
   
   
   store;
   
   private final String disName;
   private final int disNext;
   private final int xCor;
   private final int yCor;
   
   Locations(String disName,int disNext,int xCor,int yCor){
     this.disName = disName;
     this.disNext = disNext;
     this.xCor = xCor;
     this.yCor = yCor;
   }  
}
