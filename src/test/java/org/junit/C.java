package org.junit;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class C {
public static void main(String[] args) {
	Result res= JUnitCore.runClasses(A.class,B.class);
	int failureCount = res.getFailureCount();
	System.out.println("Failure Count is " +failureCount);
	int runCount = res.getRunCount();
	System.out.println("Run Count is " +res.getRunCount());
	System.out.println("Ignore Count is " +res.getIgnoreCount());
	System.out.println("Run Time is " +res.getRunTime());
int pass=res.getRunCount()-res.getFailureCount();
System.out.println("Pass Count is " +pass);
 List<Failure> fail = res.getFailures();
 for (Failure x : fail) {
	 System.out.println(x);
	
}
}

}
