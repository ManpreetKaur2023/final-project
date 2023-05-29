package javaSimulationProject;

import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		 
		 
		Simulation simulation = new Simulation();

		ArrayList<Item> items = simulation.loadItems();

		ArrayList<Rocket> r1Rockets = simulation.loadU1(items);
		int totalR1Budget = simulation.runSimulation(r1Rockets);
		System.out.println("Total cost for R1 fleet: $" + totalR1Budget + " million");

		ArrayList<Rocket> r2Rockets = simulation.loadU2(items);
		int totalR2Budget = simulation.runSimulation(r2Rockets);
		System.out.println("Total cost for R2 fleet: $" + totalR2Budget + " million");
	}
}
