package com.sei.DeDup;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

public class DeDupTest {
	
	static DeDup deDup = null;
	
	@BeforeClass
	public static void setup(){
		deDup = new DeDup();
	}
	
	@Test
	public void uniqueNumbersTest(){
		
		int[] randomIntegers = { 1, 2, 34, 34, 25, 1, 45, 3, 26, 85, 4, 34, 86, 25, 43, 2, 1, 10000, 11, 16, 19, 1,
				18, 4, 9, 3, 20, 17, 8, 15, 6, 2, 5, 10, 14, 12, 13, 7, 8, 9, 1, 2, 15, 12, 18, 10, 14, 20, 17, 16, 3, 6,
				19, 13, 5, 11, 4, 7, 19, 16, 5, 9, 12, 3, 20, 7, 15, 17, 10, 6, 1, 8, 18, 4, 14, 13, 2, 11 };
		
		assertEquals(28, deDup.uniqueNumbers(randomIntegers).length);
	}
	
	@Test
	public void uniqueNumbersAfterSortingEmptyTest(){
		
		int[] randomIntegers = {};
		
		int[] output = deDup.uniqueNumbersAfterSorting(randomIntegers);
		
		assertEquals(null, output);
	}
	
	@Test
	public void uniqueNumbersAfterSortingTest(){
		
		int[] randomIntegers = { 1, 2, 34, 34, 25, 1, 45, 3, 26, 85, 4, 34, 86, 25, 43, 2, 1, 10000, 11, 16, 19, 1,
				18, 4, 9, 3, 20, 17, 8, 15, 6, 2, 5, 10, 14, 12, 13, 7, 8, 9, 1, 2, 15, 12, 18, 10, 14, 20, 17, 16, 3, 6,
				19, 13, 5, 11, 4, 7, 19, 16, 5, 9, 12, 3, 20, 7, 15, 17, 10, 6, 1, 8, 18, 4, 14, 13, 2, 11 };
		int[] expectedOutput = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 25, 26, 34, 43, 45, 85, 86, 10000};
		
		int[] output = deDup.uniqueNumbersAfterSorting(randomIntegers);
		
		assertEquals(28, output.length);
		assertEquals(Arrays.toString(expectedOutput), Arrays.toString(output));
	}
	
	@Test
	public void withoutDupsTest(){
		
		int[] randomIntegers = { 1, 2, 34, 34, 25, 1, 45, 3, 26, 85, 4, 34, 86, 25, 43, 2, 1, 10000, 11, 16, 19, 1,
				18, 4, 9, 3, 20, 17, 8, 15, 6, 2, 5, 10, 14, 12, 13, 7, 8, 9, 1, 2, 15, 12, 18, 10, 14, 20, 17, 16, 3, 6,
				19, 13, 5, 11, 4, 7, 19, 16, 5, 9, 12, 3, 20, 7, 15, 17, 10, 6, 1, 8, 18, 4, 14, 13, 2, 11 };
		
		int[] output = deDup.uniqueNumbersWithoutCollection(randomIntegers);
		
		assertEquals(28, output.length);
	}
	
	@Test
	public void withoutDupsTestEmptyArray(){
		
		int[] randomIntegers = {};
		
		int[] output = deDup.uniqueNumbersWithoutCollection(randomIntegers);
		
		assertEquals(null, output);
	}
	
	@Test
	public void uniqueNumbersWithInsertionOrderTest(){
		
		int[] randomIntegers = { 1, 2, 34, 34, 25, 1, 45, 3, 26, 85, 4, 34, 86, 25, 43, 2, 1, 10000, 11, 16, 19, 1,
				18, 4, 9, 3, 20, 17, 8, 15, 6, 2, 5, 10, 14, 12, 13, 7, 8, 9, 1, 2, 15, 12, 18, 10, 14, 20, 17, 16, 3, 6,
				19, 13, 5, 11, 4, 7, 19, 16, 5, 9, 12, 3, 20, 7, 15, 17, 10, 6, 1, 8, 18, 4, 14, 13, 2, 11 };
		int[] expectedOutput = {1, 2, 34, 25, 45, 3, 26, 85, 4, 86, 43, 10000, 11, 16, 19, 18, 9, 20, 17, 8, 15, 6, 5, 10, 14, 12, 13, 7};
		
		int[] output = deDup.uniqueNumbersWithInsertionOrder(randomIntegers);
		
		assertEquals(28, output.length);
		assertEquals(Arrays.toString(expectedOutput), Arrays.toString(output));
	}
	
	@Test
	public void uniqueNumbersWithSortOrderTest(){
		
		int[] randomIntegers = { 1, 2, 34, 34, 25, 1, 45, 3, 26, 85, 4, 34, 86, 25, 43, 2, 1, 10000, 11, 16, 19, 1,
				18, 4, 9, 3, 20, 17, 8, 15, 6, 2, 5, 10, 14, 12, 13, 7, 8, 9, 1, 2, 15, 12, 18, 10, 14, 20, 17, 16, 3, 6,
				19, 13, 5, 11, 4, 7, 19, 16, 5, 9, 12, 3, 20, 7, 15, 17, 10, 6, 1, 8, 18, 4, 14, 13, 2, 11 };
		int[] expectedOutput = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 25, 26, 34, 43, 45, 85, 86, 10000};
		
		int[] output = deDup.uniqueNumbersWithSortOrder(randomIntegers);
		
		assertEquals(28, output.length);
		assertEquals(Arrays.toString(expectedOutput), Arrays.toString(output));
	}
	
}