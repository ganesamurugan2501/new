package org.cts;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class UnknownFailed implements IAnnotationTransformer {

	public void transform(ITestAnnotation annotaion, Class testClass, Constructor arg2, Method arg3) {
		IRetryAnalyzer r = annotaion.getRetryAnalyzer();
		if (r==null) {
			annotaion.setRetryAnalyzer(Failed.class);
		}
		
	}

}
