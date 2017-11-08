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
public class Months extends View{
    
    public Months(){
    
    
     super(" \n************************************************* "
         + " \n             Select your Month                    "
         + " \n**************************************************"
         + " \n January "
         + " \n Febuary "
         + " \n March "
         + " \n April "
         + " \n May "
         + " \n June"
         + "\n***************************************************"         
    );
    }

    @Override
    public boolean doAction(String choice) {
             choice = choice.toUpperCase();
        switch(choice){
            case "January": 
                this.January();
                return false;
            case "Febuary":
                this.Febuary();
                return false;
            case "March":
                this.March();
                return false;
            case "April":
                this.April();
                return false;
            case "May":
                this.May();    
                return true;
            case "June":
                this.June();    
                return true;    
            default :
                System.out.println("\n *Invalid Choice*");
                return false;
                
        }
        //return true;
    
    }

    private int January() {
        System.out.println("The cold month of January. Snow is heavy with little chance of lightening");
        int value = 3;
        return value;
    }

    private void Febuary() {
        System.out.println("");
    }

    private void March() {
        System.out.println("");
    }

    private void April() {
        System.out.println("");
    }

    private void May() {
        System.out.println("");
    }

    private void June() {
       System.out.println("");
    }
    
    
}
