/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.view;

/**
 *
 * @author mikeg
 */
public class RationView {
 
    
        public String RationView;
        public RationView() {
            
        this.RationView = "\n ration Menu"
                +"\n"
                +"\n 0 - eating air"
                +"\n 1 - crumbs"
                +"\n 2 - still hungry"
                +"\n 3 - stuffed"
                +"\n H - Help Menu"
                +"\n M - Main Menu"
                +"\n";
    }    
        public void displayRationView() 
    {
        boolean done = false;    
            do
            {
                String RationViewOption = this.getRationView();
                done = this.doAction (RationViewOption);   
            }
            while(!done);
    }
        private String getRationViewOption()
    {
        Scanner keyboard = new Scanner(System.in); 
        String value = "";
        boolean validated = false;
        
        while (!validated) 
        {
            System.out.println(RationView);
            System.out.println("\n Input Choice");
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() <0)
            {
                System.out.println("\n *Invalid Input*");
                continue;    
            }
            break;
        }
        return value;
}
}