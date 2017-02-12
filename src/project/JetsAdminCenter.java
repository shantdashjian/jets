package project;

import java.util.Random;
import java.util.Scanner;

public class JetsAdminCenter {
	public static HangerImpl hanger = new HangerImpl();
	public static BarracksImpl barracks = new BarracksImpl();
	public static Random generator = new Random();
	public static Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		populateBarracks();
		populateHanger();
		runMenuOptions();

	}

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

	public static void populateHanger() {
		String model = "A300";
		double speed = 593.736;
		int range = 4050;
		int capacity = 16000;
		double price = 60.5;
		int numSeats = 300;
		String airline = "American";
		Pilot pilot = barracks.getPilots().get(generator.nextInt(barracks.getPilots().size()));
		JetImpl airliner = new Airliner(model, speed, range, capacity, price, pilot, numSeats, airline);
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

	public static void runMenuOptions() {
		int option = 7;
		do {
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
			option = getInt("Enter an option (1-7): ");

			switch (option) {
			case 1:
				hanger.displayFleet();
				break;
			}
		} while (option != 7);
	}

	public static int getInt(String prompt) {
		System.out.print(prompt);
		while (!kb.hasNextInt()) {
			System.out.print(prompt);
			kb.next();
		}
		return kb.nextInt();

	}

}
