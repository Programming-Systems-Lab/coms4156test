package coms4156.spring2017;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmailIT {
		
	@Test
	public void testSend() {
		EmailGenerator eg = new EmailGenerator();
		String msg = eg.genEmail();
		String latestAddress = eg.latestAddress;
		String expectedMsg = "Successful send to: " +  latestAddress;
		assertEquals(expectedMsg, msg);
		
		String name = latestAddress.split("@")[0];
		String expectedTitle = "Welcome " + name;
		String expectedContents = "Hello " + name + "!/n";
		
		Email sent = eg.ef.es.getLatestSendMail();
		assertEquals(latestAddress, sent.address);
		assertEquals(expectedTitle, sent.title);
		assertEquals(expectedContents, sent.contents);
	}

}
