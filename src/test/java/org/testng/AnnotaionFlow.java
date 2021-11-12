package org.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotaionFlow {
	@Test(invocationCount=3)
	private void test11() {
		System.out.println("Test 11");
	}
	@Test

	private void test12() {
		System.out.println("Test 12");
	}
	@Test
	private void test13() {
		System.out.println("Test 13");
	}
	@Test(enabled=true)
	private void test14() {
		System.out.println("Test 14");
	}
	@Test
	private void test15() {
		System.out.println("Test 15");
	}
	
	@Test
	private void test16() {
		System.out.println("Test 16");
	}

	
	
}
