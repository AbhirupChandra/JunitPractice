package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArraysCompareTest {

	@Test
	public void testArraysSort() {
		int[] numbers = {1,5,2,3};
		int[] expected = {1,3,2,5};
		Arrays.sort(numbers);
		Arrays.sort(expected);
//		assertEquals(expected, numbers);
		assertArrayEquals(expected, numbers);
	}
	
	@Test(expected=NullPointerException.class)
	public void testArraysSortException() {
		int[] numbers = null;
		int[] expected = {};
		Arrays.sort(numbers);
		Arrays.sort(expected);
//		assertEquals(expected, numbers);
//		assertArrayEquals(expected, numbers);
	}
	
	@Test(timeout = 100)
	public void testArraysSortPerformance() {
		int array[] = {12,23,4};
		for(int i=1; i<1000000000; i++) {
			array[0] = i;
			Arrays.sort(array);
		}
		
//		int[] numbers = null;
//		int[] expected = {};
//		Arrays.sort(numbers);
//		Arrays.sort(expected);
//		assertEquals(expected, numbers);
//		assertArrayEquals(expected, numbers);
	}

}
