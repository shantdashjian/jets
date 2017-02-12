package project;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JetTests {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_convertToMach_593_736_should_return_0_78() {
		double mph = 593.73;
		double expectedOutcome = 0.78;
		double delta = 0.001;
		assertEquals(expectedOutcome, Jet.convertToMach(mph), delta);
	}

	@Test
	public void test_convertToMach_608_96_should_return_0_8() {
		double mph = 608.96;
		double expectedOutcome = 0.8;
		double delta = 0.001;
		assertEquals(expectedOutcome, Jet.convertToMach(mph), delta);
	}

}
