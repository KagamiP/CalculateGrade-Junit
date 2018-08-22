package JUnit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cal.Calculate;

public class CalculateTest {
	
	Calculate cal;
	
	@Before
	public void beforeCalculate() {
		cal = new Calculate();
	}

	@Test
	public void maximumInput() {
		int input = 100;
		boolean expectedResult = true;
		
		boolean actualResult;
		actualResult = cal.Input(input);
		
		assertEquals(expectedResult, actualResult);
	}
	
}
