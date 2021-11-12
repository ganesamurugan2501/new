package org.junit;

public class AnnotationsFlow {
	@AfterClass
	public static void afterClass() {
		System.out.println("Quit Browser");
	}

	@BeforeClass
	public static void beforeClass() {
		System.out.println(" Launch Browser");
	}

	@After
	public void after() {
		System.out.println("End Time ");
	}

	@Before
	public void before() {
		System.out.println("Start Time");
	}

	@Ignore
	@Test
	public void testJava() {
		System.out.println("Test 1");
	}

	@Test
	public void testMaven() {
		System.out.println("Test 2");
	}

	@Test
	public void testJunit() {
		System.out.println("Test 3");
	}

}
