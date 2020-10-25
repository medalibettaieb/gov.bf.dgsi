package gov.bf.dgsi.nafolo.tests.utils;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void test2(Method method) {
		ExtentTestManager.startTest(method.getName(), "test2");
		assertEquals("one", "tow");

	}
}
