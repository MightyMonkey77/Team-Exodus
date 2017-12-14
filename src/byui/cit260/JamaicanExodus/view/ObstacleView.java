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
public class ObstacleView extends View {
    public ObstacleView() {
        super("\n"
                + "\n*********************************"
                + "\n|         Obstacle Menu         |"
                + "\n*********************************"
                + "\n E- Equation"
                + "\n P- Puzzle"
                + "\n R- Riddle"
                + "\n Q- Quit"
                + "\n*********************************");
    }

    /**
     *
     * @param choice
     * @return
     */
    @Override
    public boolean doAction(String choice)
    {
        choice = choice.toUpperCase();
        
        if (null == choice) {
            Error.display(this.getClass().getName(), "Invalid option. Choose one of the listed options.");
        }
        else switch (choice) {
            case "E":
                equation();
                break;
            case "P":
                puzzle();
                break;
            case "R":
                riddle();
                break;
            case "Q":
                MainMenu mainMenu = new MainMenu();
                break;
            default:
                Error.display(this.getClass().getName(), "Invalid option. Choose one of the listed options.");
                break;
        }
        return false;
     }
    
    protected void equation() {
        this.console.println("equation successfully picked.");
    }
    
    protected void puzzle() {
        this.console.println("puzzle successfully picked.");
    }
    
    protected void riddle() {
        this.console.println("riddle successfully picked.");
    } 
}
