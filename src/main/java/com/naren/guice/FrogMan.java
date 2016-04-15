package com.naren.guice;

import javax.inject.Inject;

public class FrogMan {

	FrogMobile mobile;
	Fuiel fuiel;
	@Inject
	public FrogMan(FrogMobile mobile,Fuiel fuiel) {
		this.mobile=mobile;
		this.fuiel=fuiel;
	}
	public void fightCrime() {
		mobile.getMyVehicle();
		fuiel.getMyFuiel();		
	}
}