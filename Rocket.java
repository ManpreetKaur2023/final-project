package javaSimulationProject;

public class Rocket implements SpaceShip {

	private double rocketCost;
	private double rocketWeight; 
	private double maximunWeightOfrocket; 

	private double chanceOfLaunchExplosion;
	private double chanceOfLandingCrash;
	private double currentWeight;

	public Rocket() {

	}

	public Rocket(double rocketCost, double rocketWeight, double maximunWeightOfrocket, double chanceOfLaunchExplosion,
			double chanceOfLandingCrash) {
		super();
		this.rocketCost = rocketCost;
		this.rocketWeight = rocketWeight;
		this.maximunWeightOfrocket = maximunWeightOfrocket;
		this.chanceOfLaunchExplosion = chanceOfLaunchExplosion;
		this.chanceOfLandingCrash = chanceOfLandingCrash;
		this.currentWeight = rocketWeight;
	}

	@Override
	public boolean launch() {

		return true;
	}

	@Override
	public boolean land() {

		return true;
	}

	@Override
	public boolean canCarry(Item item) {
		return (currentWeight + item.getWeight()) <= maximunWeightOfrocket;
	}

	@Override
	public double carry(Item item) {
		currentWeight = currentWeight + item.getWeight();
		return currentWeight;
	}
	
	

	public double getRocketCost() {
		return rocketCost;
	}

	public double getRocketWeight() {
		return rocketWeight;
	}

	public double getMaximunWeightOfrocket() {
		return maximunWeightOfrocket;
	}

	public double getCurrentWeight() {
		return currentWeight;
	}

	public double getChanceOfLaunchExplosion() {
		return chanceOfLaunchExplosion;
	}

	public double getChanceOfLandingCrash() {
		return chanceOfLandingCrash;
	}
}
