package ontroToSeleniumDay2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class junitTestExample {
	
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	
	@Before
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}
	
	
	@Test
	public void test1() {
		System.out.println("This is Test1");
	}
	
	@Test
	public void test2() {
		System.out.println("This is Test2");
	}
	
	@Test
	public void test3() {
		System.out.println("This is Test3");
	}
	
	@After
	public void afterMethod() {
		System.out.println("afterMethod");

	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("AfterClass");
	}
	
	
	

}
