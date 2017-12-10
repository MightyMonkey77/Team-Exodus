package byui.cit260.JamaicanExodus.enums;

// Kimbuilt
 
public enum Locations{
//("display name", "distance to next city", "x-coor", "y-coor") 
// CITIES   
   froome      ("Froome","FR",       500,1,0),
   kingston    ("Kingston","KS",     500,2,1),
   stPetersburg("St Petersburg","SP",498,3,1),
   montgomery  ("Montgomery","MG",   645,4,1),
   dallas      ("Dallas","DL",       644,5,1),
   albuquerque ("Albuquerque","AQ",  574,6,1),
   lasVegas    ("Las Vegas","LV",    448,7,1),
   reno        ("Reno","RN",         344,8,1),
   medford     ("Medford","MF",        0,9,0),
   
// OBSTACLES
   obstacle1("Obstacle 1","O1",0,1,9),
   obstacle2("Obstacle 2","O2",0,2,9),
   obstacle3("Obstacle 3","O3",0,3,9),
   obstacle4("Obstacle 4","O4",0,4,9),
   obstacle5("Obstacle 5","O5",0,5,9),
   obstacle6("Obstacle 6","O6",0,6,9),
   obstacle7("Obstacle 7","O7",0,7,9),
   obstacle8("Obstacle 8","O8",0,8,9),
   
// OTHER   
   highwayRest("Highway Rest Stop","RS",  0,0,0),//No store
   walmartPark("Walmart Parking Lot","WP",0,0,0),//Store onsite
   koaCamp    ("KOA camp ground","KC",    0,0,0),//No store
   truckStop  ("Truck Stop","TS",         0,0,0),//Store onsite
   store      ("General Store","GS",      0,0,0);
   
   private final String disName;
   private final String cymbal;
   private final int disNext;
   private final int xCor;
   private final int yCor;
   
   Locations(String disName,String cymbal, int disNext,int xCor,int yCor){
     this.disName = disName;
     this.cymbal = cymbal;
     this.disNext = disNext;
     this.xCor = xCor;
     this.yCor = yCor;
   }  
}
