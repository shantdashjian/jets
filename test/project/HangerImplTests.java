package project;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HangerImplTests {
	private Hanger hanger;

	@Before
	public void setUp() throws Exception {
		hanger = new HangerImpl();
	}

	@After
	public void tearDown() throws Exception {
		hanger = null;
	}

	@Test
	public void test_addJet_adding_1_returns_fleet_size_1() {
		int id = 1;
		String model = "A300";
		double speed = 593.736;
		int range = 4050;
		int capacity = 16000;
		double price = 60.5;
		String pilotName = "Jim Reagan";
		int pilotAge = 45;
		int pilotExperience = 10;
		Pilot pilot = new PilotImpl(pilotName, pilotAge, pilotExperience);
		int numSeats = 300;
		String airline = "American";
		Jet airliner = new Airliner(id, model, speed, range, capacity, price, pilot, numSeats, airline);
		hanger.addJet(airliner);
		int expectedOutcome = 1;
		assertEquals(expectedOutcome, hanger.getFleet().size());
	}

	@Test
	public void test_addJet_adding_2_returns_fleet_size_2() {
		for (int i = 0; i < 2; i++) {
			int id = i + 1;
			String model = "A300";
			double speed = 593.736;
			int range = 4050;
			int capacity = 16000;
			double price = 60.5;
			String pilotName = "Jim Reagan";
			int pilotAge = 45;
			int pilotExperience = 10;
			Pilot pilot = new PilotImpl(pilotName, pilotAge, pilotExperience);
			int numSeats = 300;
			String airline = "American";
			Jet airliner = new Airliner(id, model, speed, range, capacity, price, pilot, numSeats, airline);
			hanger.addJet(airliner);
		}
		int expectedOutcome = 2;
		assertEquals(expectedOutcome, hanger.getFleet().size());
	}

	@Test
	public void test_getFleet_adding_5_returns_fleet_size_5() {
		for (int i = 0; i < 5; i++) {
			int id = i + 1;
			String model = "A300";
			double speed = 593.736;
			int range = 4050;
			int capacity = 16000;
			double price = 60.5;
			String pilotName = "Jim Reagan";
			int pilotAge = 45;
			int pilotExperience = 10;
			Pilot pilot = new PilotImpl(pilotName, pilotAge, pilotExperience);
			int numSeats = 300;
			String airline = "American";
			Jet airliner = new Airliner(id, model, speed, range, capacity, price, pilot, numSeats, airline);
			hanger.addJet(airliner);
		}
		int expectedOutcome = 5;
		assertEquals(expectedOutcome, hanger.getFleet().size());
	}

	@Test
	public void test_getFastestJet_adds_2_jets_should_return_the_fastest() {

		int id = 1;
		String model = "A300";
		double speed = 593.736;
		int range = 4050;
		int capacity = 16000;
		double price = 60.5;
		String pilotName = "Jim Reagan";
		int pilotAge = 45;
		int pilotExperience = 10;
		Pilot pilot = new PilotImpl(pilotName, pilotAge, pilotExperience);
		int numSeats = 300;
		String airline = "American";
		Jet airliner = new Airliner(id, model, speed, range, capacity, price, pilot, numSeats, airline);
		hanger.addJet(airliner);

		id = 2;
		model = "A300";
		speed = 693.736;
		range = 4050;
		capacity = 16000;
		price = 60.5;
		pilotName = "Jim Reagan";
		pilotAge = 45;
		pilotExperience = 10;
		pilot = new PilotImpl(pilotName, pilotAge, pilotExperience);
		numSeats = 300;
		airline = "American";
		airliner = new Airliner(id, model, speed, range, capacity, price, pilot, numSeats, airline);
		hanger.addJet(airliner);

		int expectedOutcome = 2;
		assertEquals(expectedOutcome, hanger.getFastestJet().getId());
	}

	@Test
	public void test_getFastestJet_empty_hanger_fleet_should_return_null() {
		// fleet is empty
		Object expectedOutcome = null;
		assertEquals(expectedOutcome, hanger.getFastestJet());
	}

	@Test
	public void test_getLongestRangeJet_adds_2_jets_should_return_the_longest_range() {

		int id = 1;
		String model = "A300";
		double speed = 593.736;
		int range = 4050;
		int capacity = 16000;
		double price = 60.5;
		String pilotName = "Jim Reagan";
		int pilotAge = 45;
		int pilotExperience = 10;
		Pilot pilot = new PilotImpl(pilotName, pilotAge, pilotExperience);
		int numSeats = 300;
		String airline = "American";
		Jet airliner = new Airliner(id, model, speed, range, capacity, price, pilot, numSeats, airline);
		hanger.addJet(airliner);

		id = 2;
		model = "A300";
		speed = 693.736;
		range = 3050;
		capacity = 16000;
		price = 60.5;
		pilotName = "Jim Reagan";
		pilotAge = 45;
		pilotExperience = 10;
		pilot = new PilotImpl(pilotName, pilotAge, pilotExperience);
		numSeats = 300;
		airline = "American";
		airliner = new Airliner(id, model, speed, range, capacity, price, pilot, numSeats, airline);
		hanger.addJet(airliner);

		int expectedOutcome = 1;
		assertEquals(expectedOutcome, hanger.getLongestRangeJet().getId());
	}

	@Test
	public void test_getLongestRangeJet_empty_hanger_fleet_should_return_null() {
		// fleet is empty
		Object expectedOutcome = null;
		assertEquals(expectedOutcome, hanger.getLongestRangeJet());
	}

}
