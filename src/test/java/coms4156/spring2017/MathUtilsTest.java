package coms4156.spring2017;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import coms4156.spring2017.mock.MockCounter;

public class MathUtilsTest {
	
	private Counter c;
	
	@Before
	public void setUp() {
		c= new MockCounter();
	}
	
	@Test
	public void testIsOverFlow() {
		long testVal = ((long)Integer.MIN_VALUE) - 1;
		assertTrue(MathUtils.isOverflow(testVal));
		
		testVal = (long)Integer.MIN_VALUE;
		assertFalse(MathUtils.isOverflow(testVal));
		
		testVal = 0L;
		assertFalse(MathUtils.isOverflow(testVal));
		
		testVal = Integer.MAX_VALUE;
		assertFalse(MathUtils.isOverflow(testVal));
		
		testVal = ((long)Integer.MAX_VALUE) + 1;
		assertTrue(MathUtils.isOverflow(testVal));
	}
	
	@Test
	public void testAdd() {
		int i = 5;
		int j = 6;
		assertEquals(11, MathUtils.add(i, j, this.c));
		
		i = Integer.MAX_VALUE - 1;
		j = 1;
		assertEquals(Integer.MAX_VALUE, MathUtils.add(i, j, this.c));
	}

	@Test(expected=RuntimeException.class)
	public void testAddOverflow() {
		int i = Integer.MAX_VALUE;
		int j = Integer.MAX_VALUE;
		MathUtils.add(i, j, this.c);
	}
	
	@Test
	public void testSub() {
		int i = 5;
		int j = 6;
		assertEquals(-1, MathUtils.sub(i, j, this.c));
		
		i = Integer.MIN_VALUE + 1;
		j = 1;
		assertEquals(Integer.MIN_VALUE, MathUtils.sub(i, j, this.c));
	}
	
	@Test(expected=RuntimeException.class) 
	public void testSubOverflow(){
		int i = Integer.MAX_VALUE;
		int j = Integer.MIN_VALUE;
		MathUtils.sub(i, j, c);
	}
	
	@After
	public void freeCounter() {
		this.c = null;
	}

}
