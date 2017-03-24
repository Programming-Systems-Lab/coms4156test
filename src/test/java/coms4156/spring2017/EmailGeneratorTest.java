package coms4156.spring2017;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unittest EmailGenerator. Use a MockEmailFormatter to isolate the behavior of EmailFormatter
 * @author mikefhsu
 *
 */
public class EmailGeneratorTest {
	
	public class MockEmailFormatter extends EmailFormatter {
		
		public boolean ret;
		
		public MockEmailFormatter(boolean ret) {
			this.ret = ret;
		}
		
		@Override
		public boolean formatAndSend(String address) {
			return ret;
		}
	}
	
	@Test
	public void testSuccessSend() {
		EmailGenerator eg = new EmailGenerator();
		EmailFormatter formatter = new MockEmailFormatter(true);
		eg.setEmailFormatter(formatter);
		
		String realMsg = eg.genEmail();
		String latestEmail = eg.latestAddress;
		String expectedMsg = "Successful send to: " + latestEmail;
		assertEquals(expectedMsg, realMsg);
	}
	
	@Test
	public void testFailedSend() {
		EmailGenerator eg = new EmailGenerator();
		EmailFormatter formatter = new MockEmailFormatter(false);
		eg.setEmailFormatter(formatter);
		
		String realMsg = eg.genEmail();
		String latestEmail = eg.latestAddress;
		String expectedMsg = "Failed to send to: " + latestEmail;
		assertEquals(expectedMsg, realMsg);
	}

}
