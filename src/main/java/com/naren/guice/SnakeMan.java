/**
 * 
 */
package com.naren.guice;

import javax.inject.Inject;

/**
 * @author narender
 *
 */
public class SnakeMan {

	@Inject
	FrogMobile mobile;
	@Inject
	Fuiel fuiel;
	public SnakeMan() {
		
	}
	
	public void killFrog(){
		System.out.println("Killing Frog......");
		mobile.getMyVehicle();
		fuiel.getMyFuiel();
	}

}
