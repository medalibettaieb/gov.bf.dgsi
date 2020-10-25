package gov.bf.dgsi.nafolo.tests.utils;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void test1(Method method) {
		ExtentTestManager.startTest(method.getName(), "Invalid Login Scenario with invalid username and password.");
		assertEquals("one", "one");
	}
}
