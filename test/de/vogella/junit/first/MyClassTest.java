package de.vogella.junit.first;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyClassTest {

	@Test
	public void testMultiply() {
		MyClass tester = new MyClass();
		assertEquals("Result", 50, tester.multiply(10, 5));
	}
	@Test
	public void testDivide() {
		MyClass tester = new MyClass();
		assertEquals("Result", 0, tester.divide(10, 0));
	}
	@Test
	public void testDivide2() {
		MyClass tester = new MyClass();
		assertEquals("Result", 2, tester.divide(10, 5));
	}
}