package org.testng;

import org.testng.annotations.Test;

public class Data2 {

	@Test(dataProvider= "result",dataProviderClass=Data1.class)
	private void test4(String s1,String s2) {

		System.out.println(s1);
		System.out.println(s2);
		
	}
}
