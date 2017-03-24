package coms4156.spring2017;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EamilFormatterTest {
	
	@Test
	public void testSuccessfulSend() {
		String address = "ab1234@columbia.edu";
		EmailFormatter ef = new EmailFormatter();
		assertTrue(ef.formatAndSend(address));
	}
	
	@Test
	public void testFailedSend() {
		String address = "ab1234";
		EmailFormatter ef = new EmailFormatter();
		assertFalse(ef.formatAndSend(address));
	}

}
