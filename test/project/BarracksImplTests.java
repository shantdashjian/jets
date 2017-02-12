package project;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BarracksImplTests {
	private BarracksImpl barrack;

	@Before
	public void setUp() throws Exception {
		barrack = new BarracksImpl();
	}

	@After
	public void tearDown() throws Exception {
		barrack = null;
	}

	@Test
	public void test_hirePilot_hires_1_should_return_pilots_size_1() {
		String pilotName = "Jim Reagan";
		int pilotAge = 45;
		int pilotExperience = 10;
		Pilot pilot = new PilotImpl(pilotName, pilotAge, pilotExperience);
		barrack.hirePilot(pilot);
		int expectedOutcome = 1;
		assertEquals(expectedOutcome, barrack.getPilots().size());
	}

}
