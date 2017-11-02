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
 
    
        public enum Ration {
	BARE(0, "Crumbs"), MEAGER(1, "Still Hungry"), NORMAL(2, "Normal"), WELLFED(3, "Stuffed");
	
	
	private final int portion;

	
	private final String name;

	
	public static final int PROPER_PORTION = 2;
	
	
	private Ration(int p, String name){
		portion = p;
		this.name = name;
	}

            /**
             *
             * @return
             */
            @Override
	public String toString(){
		return name;
	}

	
	public int getPortion(){
		return portion;
	}
        }
}
