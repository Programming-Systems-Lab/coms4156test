package coms4156.spring2017;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CounterTest {
	
	public Counter c = null;
	
	@Before
	public void setUp() {
		c = new Counter();
	}
	
	@Test
	public void testAddCount() {
		assertEquals(0, c.getCount());
		
		for (int i = 0; i < 10; i++) {
			c.addCount();
			assertEquals(i + 1, c.getCount());
		}
	}
	
	@After
	public void freeCounter() {
		c = null;
	}

}
