/**
 * 
 */
package com.naren.guice.test;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.naren.guice.FrogMan;
import com.naren.guice.SnakeMan;
import com.naren.guice.module.DIModule;

/**
 * @author narender
 *
 */
public class TestGuice {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new DIModule());
		FrogMan hero = injector.getInstance(FrogMan.class);
		hero.fightCrime();
		SnakeMan hero2 = injector.getInstance(SnakeMan.class);
		hero2.killFrog();

	}

}
