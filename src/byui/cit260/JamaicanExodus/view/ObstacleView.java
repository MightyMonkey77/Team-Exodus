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
                MainMenu menu = new MainMenu();
                break;
            default:
                Error.display(this.getClass().getName(), "Invalid option. Choose one of the listed options.");
                break;
        }
        return false;
     }
    
    protected void caulkWagon() {
        this.console.println("caulkWagon function successfully called.");
    }
    
    protected void hireGuide() {
        this.console.println("hireGuide function successfully called.");
    }
    
    protected void useFerry() {
        this.console.println("useFerry function successfully called.");
    } 

    private void riddle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void puzzle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void equation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
