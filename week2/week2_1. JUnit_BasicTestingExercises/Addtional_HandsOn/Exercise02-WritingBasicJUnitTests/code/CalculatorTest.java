package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		Calculator obj = new Calculator();
		int output = obj.addition(5,8);
		
		assertEquals(13,output);
		int output2 = obj.subtract(5, 3);
		assertEquals(2,output2);
	}

}
