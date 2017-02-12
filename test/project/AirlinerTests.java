/**
 *
 */
package project;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author shaundashjian
 *
 */
public class AirlinerTests {
	private Airliner airliner;

	@Before
	public void setUp() {
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
		 airliner = new Airliner(model, speed, range, capacity, price, pilot, numSeats, airline);
	}

	@After
	public void tearDown() {
		airliner = null;
	}

	@Test
	public void test_getSpeedInMach_593_736_should_return_0_78() {
		airliner.setSpeed(593.736);
		double expectedOutcome = 0.78;
		double delta = 0.001;
		assertEquals(expectedOutcome, airliner.getSpeedInMach(), delta);
	}

	@Test
	public void test_getSpeedInMach_608_96_should_return_0_8() {
		airliner.setSpeed(608.96);
		double expectedOutcome = 0.8;
		double delta = 0.001;
		assertEquals(expectedOutcome, airliner.getSpeedInMach(), delta);
	}

}
