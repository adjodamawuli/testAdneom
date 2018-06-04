package com.esprit.test;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;

import com.esprit.ITestJava;
import com.esprit.TestJava;



public class Test {
	ITestJava testJava;
	
	@Before
	public void setUp() {
		testJava=new TestJava();
	}
	@org.junit.Test
	public void test() {
		Integer[] tab = new Integer[] { 1,2,3,4,5 };
		Assert.assertTrue(testJava.partition(Arrays.asList(tab), 2).size() ==3);
		
		Integer[] monTableau = new Integer[] { 1,2 };
		Assert.assertTrue(testJava.partition(Arrays.asList(tab), 2).get(0).equals(Arrays.asList(monTableau)));
	}
}
