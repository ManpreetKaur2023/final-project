package javaSimulationProject;

import java.util.Random;

public class R2 extends Rocket {
	 public R2() {
	        super(120, 18000.00, 29000, 0.04, 0.08);
	    }


	@Override
	public boolean launch() {
		 double random = new Random().nextDouble();
	        double probability = getChanceOfLaunchExplosion() * ((double)getCurrentWeight() / getMaximunWeightOfrocket());
	        return random > probability;
	}

	@Override
	public boolean land() {
		 double random = new Random().nextDouble();
	        double probability = getChanceOfLandingCrash() * ((double)getCurrentWeight() / getMaximunWeightOfrocket());
	        return random > probability;	}

}
