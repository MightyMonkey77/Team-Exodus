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
public class MapControl {
 
    public double timeTraveled( double rate, double distance){
        
        if ( rate <0){
            return -1;
        }
        
        if ( rate >120){
            return -1; }            

        if ( distance <0){
            return -1;
        }
        
        if ( distance > 750){
            return -1;}        
           
        
        double timeTraveled = distance / rate;
            return timeTraveled;
                
                
                }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
