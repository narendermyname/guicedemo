package com.naren.guice.module;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.naren.guice.FrogFuiel;
import com.naren.guice.FrogMobile;
import com.naren.guice.Fuiel;
import com.naren.guice.Vehicle;

public class DIModule implements Module{

	public DIModule() {
		// TODO Auto-generated constructor stub
	}

	public void configure(Binder binder) {
		 binder.bind(Object.class).to(Vehicle.class);
		 binder.bind(Fuiel.class).to(FrogFuiel.class);
	}

}
