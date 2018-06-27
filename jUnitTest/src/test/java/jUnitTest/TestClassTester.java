package jUnitTest;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestClassTester {
	@Test
	public void test() {
		assertEquals("Should return true", true, (new TestClass()).test());
	}
	
	@Test
	public void test2() {
		assertEquals("Should return false", false, (new TestClass()).test());
	}
}
