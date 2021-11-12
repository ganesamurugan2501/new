package org.junit;

public class B {

	@Test
	public void test11() {
		Assert.assertTrue(false);
}
	@Test
	public void test12() {
		Assert.assertTrue(false);
}
	@Ignore
	@Test
	public void test13() {
		System.out.println("Test 13");
}
	
}
