package edu.jsp.source;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	Calculator calculator = new Calculator();
	
	@Test
	void test() {


		int actualResult = calculator.add(2, 2);

		int expectedResult = 4;

		Assertions.assertEquals(expectedResult, actualResult);

	}

	@Test
	void test1() {
		int actualResult1 = calculator.add(2, 6);

		int expectedResult1 = 4;

		Assertions.assertEquals(expectedResult1, actualResult1);

	}
	
	@Test
	void testsub() {
		Assertions.assertEquals(5, calculator.sub(15, 10));
	}
	
	@Test
	void testmul() {
		Assertions.assertEquals(6, calculator.mul(2, 3));
	}
	
	@Test
	void testdiv() {
		Assertions.assertEquals(5, calculator.div(50, 10));
	}
	
}
