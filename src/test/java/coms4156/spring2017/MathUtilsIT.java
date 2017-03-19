package coms4156.spring2017;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import coms4156.spring2017.MathUtils;

public class MathUtilsIT {
	
	@Test
	public void testAddSub() {
		int i = 5;
		int j = 6;
		int m = 7;
		int n = 8;
		assertEquals(10, MathUtils.add(MathUtils.add(i, j), MathUtils.sub(m, n)));
	}
}
