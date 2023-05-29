package javaSimulationProject;

import java.util.Random;

public class R1 extends Rocket {
	 public R1() {
	        super(100, 10000.00, 18000.00, 0.05, 0.01);
	    }
	
	@Override
	public boolean launch() {
		double random = new Random().nextDouble();
        double probability = getChanceOfLaunchExplosion() * ((double)getCurrentWeight() / getMaximunWeightOfrocket());
        System.out.println(probability);
        return random > probability;
	}

	@Override
	public boolean land() {
		double random = new Random().nextDouble();
        double probability = getChanceOfLandingCrash() * ((double)getCurrentWeight() / getMaximunWeightOfrocket());
        return random > probability;
	}

}
