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
         + " \n J - January "
         + " \n F - Febuary "
         + " \n M - March "
         + " \n A - April "
         + " \n C - May "
         + " \n D - June"
         + "\n***************************************************"         
    );
    }

    @Override
    public boolean doAction(String choice) {
             choice = choice.toUpperCase();
        switch(choice){
            case "J": 
                this.January();
                return true;
            case "F":
                this.Febuary();
                return true;
            case "M":
                this.March();
                return true;
            case "A":
                this.April();
                return true;
            case "C":
                this.May();    
                return true;
            case "D":
                this.June();    
                return true;    
            default :
                System.out.println("\n *Invalid Choice*");
                return false;
                
        }
        //return true;
    
    }

    private int January() {
        System.out.println("Month of January. Average temp of 86F dry season.");
        int value = (int) 0.25;
        return value;
    }

    private int Febuary() {
        System.out.println("Month of Feburary. Average temp of 86F dry season. ");
         int value = (int) 0.35;
        return value;
    }

    private int March() {
        System.out.println("Month of March. Average temp of 88F dry season.");
         int value = (int) 0.45;
        return value;
    }

    private int April() {
        System.out.println("Month of April. Average temp of 88F begining of the first wet season.");
         int value = (int) 0.25;
        return value;
    }

    private int May() {
        System.out.println("Month of May. Average temp of 88F first wet season.");
         int value = (int) 0.35;
        return value;
    }

    private int June() {
       System.out.println("Month of June. Average temp of 90F lightening of the first wet season.");
        int value = (int) 0.45;
        return value;
    }
    
    
}
