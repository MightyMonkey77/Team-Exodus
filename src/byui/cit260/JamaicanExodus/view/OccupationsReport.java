/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.view;

//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;

/**
 *
 * @author mikeg
 */
public class OccupationsReport {
    
   public static void main(String[] args){
      
        //OccupationsList o1 = new Occupations();
        //ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Occupations.txt"));
        //out.writeObject(o1);
        
        //ObjectInputStream in = new ObjectInputStream(new FileInputStream("Occupations.txt"));
        //OccupationsList o2 =(Occupations) in.readObject();
        
        //System.out.println(o2.getOccupations());
        
       File file = new File("OccupationsList.txt");
       try {
           PrintWriter output = new PrintWriter(file);
           output.println("Banker");
           output.println("Carpenter");
           output.println("Shipwright");
           output.println("Software Engineer");
           output.println("Farmer");
           output.close();
       } catch (IOException ex) {
           System.out.printf("ERROR: %s\n ", ex);
        
        }

   }
}