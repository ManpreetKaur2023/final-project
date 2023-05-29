package javaSimulationProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

	ArrayList<Item> itemList = new ArrayList<Item>();

	public ArrayList<Item> loadItems() {

		try {
			File file = new File("C:\\Users\\Gurwinder\\OneDrive\\Desktop\\QA assignments\\phase.txt.txt");
			Scanner sc = new Scanner(file);

			String[] elememts = new String[3];
			while (sc.hasNextLine()) {
				elememts = sc.nextLine().split("=");
				String name = elememts[0];
				String weight1 = elememts[1];

				int weight = Integer.parseInt(weight1);
				// System.out.println(name);
				// System.out.println(weight);

				Item item = new Item(name, weight);
				itemList.add(item);
			

			}

		} catch (FileNotFoundException e) {
			System.out.println("Unable to read the file");
			e.printStackTrace();
		}
		

		return itemList;
	}

	public ArrayList<Rocket> loadU1(ArrayList<Item> items) {
		ArrayList<Rocket> rockets = new ArrayList<>();
		R1 rocket = new R1();
		for (Item item : items) {
			if (rocket.canCarry(item)) {
				rocket.carry(item);
			} else {
				rockets.add(rocket);
				rocket = new R1();
				rocket.carry(item);
			}
		}
		rockets.add(rocket);
		return rockets;
	}

	public ArrayList<Rocket> loadU2(ArrayList<Item> items) {
		ArrayList<Rocket> rockets = new ArrayList<>();
		R2 rocket = new R2();
		for (Item item : items) {
			if (rocket.canCarry(item)) {
				rocket.carry(item);
			} else {
				rockets.add(rocket);
				rocket = new R2();
				rocket.carry(item);
			}
		}
		rockets.add(rocket);
		return rockets;
	}

	public int runSimulation(ArrayList<Rocket> rockets) {
		int totalBudget = 0;
		for (Rocket rocket : rockets) {
			totalBudget += rocket.getRocketCost();
			while (!rocket.launch() || !rocket.land()) {
				totalBudget += rocket.getRocketCost();
			}
		}
		return totalBudget;
	}
}
