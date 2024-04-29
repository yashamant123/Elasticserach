package org.exercise.ElasticKibana;

import org.testng.Assert;
import org.testng.ITestNGListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TestCase1 extends Listners{
	
	
	@Test
	public static void passTestcase() {
		Assert.assertTrue(true);
	}
	@Test
	public static void failTestcase() {
		Assert.assertTrue(false);
		String str="vasanth";
		System.out.println(str.indexOf('w'));
	}

}
