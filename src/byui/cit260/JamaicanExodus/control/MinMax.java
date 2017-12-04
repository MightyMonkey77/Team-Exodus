/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.JamaicanExodus.control;

/**
 *
 * @author mikeg
 */
public class MinMax {
 
    
 public static void main(String args[]){
    int array[] = new int[]{1, 4, 9, 12, 20};
 
    // Calling max value
    int max = getMax(array);
    System.out.println("Maximum Value is: "+max);
 
    // Calling  min value
    int min = getMin(array);
    System.out.println("Minimum Value is: "+min);
  }
 
  // Maximum value
  public static int getMax(int[] inputArray){ 
    int maxValue = inputArray[0]; 
    for(int i=1;i < inputArray.length;i++){ 
      if(inputArray[i] > maxValue){ 
         maxValue = inputArray[i]; 
      } 
    } 
    return maxValue; 
  }
 
  // Minimum value
  public static int getMin(int[] inputArray){ 
    int minValue = inputArray[0]; 
    for(int i=1;i<inputArray.length;i++){ 
      if(inputArray[i] < minValue){ 
        minValue = inputArray[i]; 
      } 
    } 
    return minValue; 
  } 
}   