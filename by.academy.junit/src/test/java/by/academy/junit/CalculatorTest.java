package by.academy.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest extends Assert {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before CalculatorTest.class");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("After CalculatorTest.class");
	}

	@Before
	public void initTest() {
		System.out.println("Before test call.");
		new Calculator();
	}

	@After
	public void afterTest() {
		System.out.println("After test call.");
	}

	@Test
	public void testGetSum() throws Exception {
		assertEquals(15, Calculator.getSum(7, 8));
	}

	@Test
	public void testGetDivide() throws Exception {
		assertEquals(20, Calculator.getDivide(100, 5));
	}

	@Test
	public void testFail() {
		fail();
	}

	@Test
	public void testGetMultiple() throws Exception {

	}

	@Test(expected = ArithmeticException.class)
	public void divisionWithException() {
		Calculator.getDivide(15, 0);
	}

	@Ignore("Message for ignored test")
	@Test
	public void ignoredTest() {
		System.out.println("will not print it");
	}
	
	@Ignore
	@Test(timeout = 500)
	public void timeStampTest() {
		while (true)
			;
	}
}