package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {
	StringHelper helper;
	
	@Before
	public void before() {
		helper = new StringHelper();
		System.out.println("Before test");
	}
	

	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Positions() {
//		fail("Not yet implemented");
//		StringHelper helper = new StringHelper();
		//Expected and Equal
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
//		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
		assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
		assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
	}
	@Test
	public void testTruncateAInFirst2Positions_AinFirstPositions() {
//		StringHelper helper = new StringHelper();
		//Expected and Equal
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
		
	}
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame() {
//		StringHelper helper = new StringHelper();
//		assertEquals(false, helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	
	@After
	public void teardown() {
		System.out.println("tearing down all");
		
	}

}
