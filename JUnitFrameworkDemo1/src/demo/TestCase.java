package demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCase {

	@BeforeClass
	public static void beforeclassmethod()
	{
		System.out.println("before class");
		
	}
	@Before
	public void beforetestcase()
	{
		
		System.out.println("before testcase");

	}
	
	
	
	
	@Test
	public void test() {
	
				//assertEquals(3,FirstResult.FindMaxNum(new int[] {1,3,2,4}));
				assertTrue(FirstResult.EvenORNot(2));
				assertTrue(FirstResult.EvenORNot(23));
				assertTrue(FirstResult.EvenORNot(4));
				assertFalse(FirstResult.EvenORNot(5));

				/////this to check that if it will be in unstaging or not
	
	
	}
	
	@After
	public void aftertestcase()
	{
		
		System.out.println("after testcase");

	}
	
	@AfterClass
	public static void afterclassmethod()
	{
		System.out.println("after class");
		
	}

}
