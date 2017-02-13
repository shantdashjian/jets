package project;

import java.util.Random;
import java.util.Scanner;

/**
 * <h1>JetsAdminCenter</h1>
 * <p>
 * This is the driver class with main() for the Jets application. It offers a
 * menu with 7 options to display and update information about the jets and the
 * pilots.
 * </p>
 * This is how the interface looks like: <br>
 * ******************************************<br>
 * * Welcome to the Super Jets Admin Center *<br>
 * ******************************************<br>
 * 1. List the fleet<br>
 * 2. View the fastest jet<br>
 * 3. View the jet with longest range<br>
 * 4. Add a new jet to the fleet<br>
 * 5. Hire a pilot<br>
 * 6. List all pilots<br>
 * 7. Quit<br>
 * *****************************************<br>
 * Enter an option (1-7):<br>
 * <br>
 *
 * @author Shaun Dashjian
 * @version 1.0
 */

public class JetsAdminCenter {
	public static Hanger hanger = new HangerImpl();
	public static Barracks barracks = new BarracksImpl();
	public static Random generator = new Random();
	public static Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		populateBarracks();
		populateHanger();
		runMenuOptions();
	}

	/**
	 * populates the barracks with 5 pilots
	 */
	public static void populateBarracks() {
		String name = "Jim Reagan";
		int age = 45;
		int experience = 10;
		Pilot pilot = new PilotImpl(name, age, experience);
		barracks.hirePilot(pilot);

		name = "Tim McLain";
		age = 35;
		experience = 10;
		pilot = new PilotImpl(name, age, experience);
		barracks.hirePilot(pilot);

		name = "Jeff Lebowski";
		age = 25;
		experience = 2;
		pilot = new PilotImpl(name, age, experience);
		barracks.hirePilot(pilot);

		name = "Shaun Rau";
		age = 29;
		experience = 3;
		pilot = new PilotImpl(name, age, experience);
		barracks.hirePilot(pilot);

		name = "Steve Ballard";
		age = 38;
		experience = 20;
		pilot = new PilotImpl(name, age, experience);
		barracks.hirePilot(pilot);

	}

	/**
	 * populates the hanger with 5 jets
	 */
	public static void populateHanger() {
		String model = "A300";
		double speed = 593.736;
		int range = 4050;
		int capacity = 16000;
		double price = 60.5;
		int numSeats = 300;
		String airline = "American";
		Pilot pilot = barracks.getPilots().get(generator.nextInt(barracks.getPilots().size()));
		Jet airliner = new Airliner(model, speed, range, capacity, price, pilot, numSeats, airline);
		hanger.addJet(airliner);

		model = "A310";
		speed = 693.736;
		range = 3500;
		capacity = 16132;
		price = 80.5;
		numSeats = 200;
		airline = "American";
		pilot = barracks.getPilots().get(generator.nextInt(barracks.getPilots().size()));
		airliner = new Airliner(model, speed, range, capacity, price, pilot, numSeats, airline);
		hanger.addJet(airliner);

		model = "A320";
		speed = 593.736;
		range = 3100;
		capacity = 6400;
		price = 75.5;
		String owner = "Trump";
		pilot = barracks.getPilots().get(generator.nextInt(barracks.getPilots().size()));
		BusinessJet businessJet = new BusinessJet(model, speed, range, capacity, price, pilot, owner);
		hanger.addJet(businessJet);

		model = "A320";
		speed = 593.736;
		range = 3100;
		capacity = 6400;
		price = 75.5;
		owner = "Coch";
		pilot = barracks.getPilots().get(generator.nextInt(barracks.getPilots().size()));
		businessJet = new BusinessJet(model, speed, range, capacity, price, pilot, owner);
		hanger.addJet(businessJet);

		model = "A319";
		speed = 593.736;
		range = 3100;
		capacity = 6400;
		price = 90.5;
		owner = "Coch";
		pilot = barracks.getPilots().get(generator.nextInt(barracks.getPilots().size()));
		businessJet = new BusinessJet(model, speed, range, capacity, price, pilot, owner);
		hanger.addJet(businessJet);
	}

	/**
	 * displays 7 menu options and runs each based on user input
	 */
	public static void runMenuOptions() {
		int option = 7;
		do {
			System.out.println();
			System.out.println("******************************************");
			System.out.println("* Welcome to the Super Jets Admin Center *");
			System.out.println("******************************************");
			System.out.println("1. List the fleet");
			System.out.println("2. View the fastest jet");
			System.out.println("3. View the jet with longest range");
			System.out.println("4. Add a new jet to the fleet");
			System.out.println("5. Hire a pilot");
			System.out.println("6. List all pilots");
			System.out.println("7. Quit");
			System.out.println("******************************************");
			option = InputHelper.getInt("Enter an option (1-7): ");
			System.out.println();

			Pilot pilot;
			switch (option) {
			case 1:
				System.out.println("Here is the entire fleet of jets:");
				hanger.displayFleet();
				break;
			case 2:
				System.out.println("Here is the fastest jet in the fleet:");
				System.out.println(hanger.getFastestJet());
				break;
			case 3:
				System.out.println("Here is the longest range jet:");
				System.out.println(hanger.getLongestRangeJet());
				break;
			case 4:
				JetImpl jet;
				String model = InputHelper.getString("Enter model: ");
				double speed = InputHelper.getDouble("Enter speed in MPH: ");
				int range = InputHelper.getInt("Enter range in nm: ");
				int capacity = InputHelper.getInt("Enter fuel capacity in US gallons: ");
				double price = InputHelper.getDouble("Enter price is $ millions: ");
				pilot = barracks.getPilots().get(generator.nextInt(barracks.getPilots().size()));
				int jetClass;
				do {
					jetClass = InputHelper.getInt("Enter 1 for Airliner and 2 for Business Jet: ");
				} while (jetClass < 1 || jetClass > 2);
				if (jetClass == 1) {
					int numSeats = InputHelper.getInt("Enter number of seats: ");
					String airline = InputHelper.getString("Enter airline: ");
					jet = new Airliner(model, speed, range, capacity, price, pilot, numSeats, airline);

				} else {
					String owner = InputHelper.getString("Enter owner name: ");
					jet = new BusinessJet(model, speed, range, capacity, price, pilot, owner);
				}
				hanger.addJet(jet);
				System.out.println();
				System.out.println("New jet added to the fleet: ");
				System.out.println(jet);
				break;
			case 5:
				String name = InputHelper.getString("Enter pilot name: ");
				int age = InputHelper.getInt("Enter pilot age: ");
				int experience = InputHelper.getInt("Enter years of experience: ");
				pilot = new PilotImpl(name, age, experience);
				barracks.hirePilot(pilot);
				System.out.println();
				System.out.println("New pilot added to the barracks: ");
				System.out.println(pilot);
				break;
			case 6:
				System.out.println("Here is the entire barracks:");
				barracks.displayPilots();
				break;
			default:
				break;
			}
		} while (option != 7);
		System.out.println("Have a safe flight!");
	}

}
