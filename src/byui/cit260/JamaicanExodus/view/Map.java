/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.view;

/**
 *
 * @author Office Payne
 */
public class Map {
    
   private final String[][] drawMap = {
        {"*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*","*"},
	{"*","c","0","0","*","0","t","0","0","0","0","*","0","0","*","c","0","0","0","*","0","0","0","*"},
	{"*","0","0","0","*","0","0","0","0","0","*","0","0","*","t","0","0","0","0","*","0","0","0","*"},
	{"*","0","0","0","D","0","0","0","0","0","D","0","0","D","0","0","0","0","0","D","0","0","0","*"},
	{"*","0","0","t","*","0","0","0","0","0","*","0","0","*","0","0","0","0","0","*","0","0","t","*"},
	{"*","*","*","D","*","*","D","*","*","*","*","0","0","*","*","*","*","D","*","*","*","D","*","*"},
	{"*","*","0","0","0","*","t","0","0","0","*","0","0","*","0","0","0","0","*","0","0","0","*","*"},
	{"*","*","0","0","0","*","0","0","0","0","*","0","0","*","0","0","t","0","*","0","0","0","*","*"},
	{"*","*","0","0","0","*","0","0","0","0","*","0","0","*","0","0","0","0","*","0","0","0","*","*"},
	{"*","*","*","*","*","*","*","*","*","*","*","0","0","*","*","*","*","*","*","*","*","*","*","*"},
	{"*","*","0","0","t","*","0","0","0","0","*","0","0","*","0","0","0","t","*","0","0","0","*","*"},
	{"*","*","0","0","0","*","0","0","0","0","*","0","0","*","0","0","0","0","*","0","0","0","*","*"},
	{"*","*","0","0","0","*","0","0","0","0","*","0","0","*","0","0","0","0","*","0","0","0","*","*"},
	{"*","*","*","D","*","*","D","*","*","*","*","0","0","*","*","*","*","D","*","*","D","*","*","*"},
	{"*","t","0","0","*","0","t","0","0","0","*","0","0","*","c","0","0","0","0","*","0","0","0","*"},
	{"*","0","0","0","*","0","0","0","0","0","*","0","0","*","0","0","0","0","0","*","0","0","0","*"},
	{"*","0","0","0","D","0","0","0","0","0","D","0","0","D","0","0","0","t","0","D","0","0","0","*"},
	{"*","0","0","0","*","0","0","0","0","0","*","0","0","*","t","0","0","0","0","*","t","0","0","*"},
	{"*","*","*","*","*","*","*","*","*","*","*","D","D","*","*","*","*","*","*","*","*","*","*","*"}
};
   public Map(){
      	for (int x = 0; x < 19; x++) {
		// index rows up to 18 to continue to next
		for (int y = 0; y < 24; y++) {
			
                // if statements for starting num and door expression
		if (drawMap[x][y] == "0") {
			System.out.print(" ");
		}
		else if (drawMap[x][y] == "D") 
			System.out.print("/");
		else System.out.print (drawMap[x][y]);
		}
		System.out.println();
	}
    
}
   
}