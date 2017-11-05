/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.control;

/**
 *
 * @author Office Payne
 */
public class Speed {

    
    
        public int getRate(int time, int distance) {
        int speed;
        if (time < 0 || distance < 0){
            return -1;
        }
        if (time > 60 || distance > 100){
            return -1;
        }
        speed = distance / time;
        return speed;
    }
  

}
