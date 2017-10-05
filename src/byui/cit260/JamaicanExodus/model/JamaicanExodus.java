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
        
        Player playerOne = new Player();
        
        playerOne.setName("Fred Flinstone");
       
       String playerOneName = playerOne.getName();
       
       System.out.println("Name = " + playerOneName + " is a stud.");
        
    }
    
}
