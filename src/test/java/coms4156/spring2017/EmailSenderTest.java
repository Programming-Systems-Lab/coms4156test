package coms4156.spring2017;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class EmailSenderTest {
	
	Email e;
	
	@Before
	public void setUp() {
		Email e = new Email();
		e.address = "eh4567@columbia.edu";
		e.title = "Hello eh4567";
		e.contents = "Foo bar";
		this.e = e;
	}
	
	@Test
	public void testSendEmail() {
		EmailSender es = new EmailSender();
		assertTrue(es.sendMail(e));
	}
	
	@Test
	public void testGetLatestSendMail() {
		EmailSender es = new EmailSender();
		es.sendMail(e);
		Email last = es.getLatestSendMail();
		assertEquals(e, last);
		assertEquals(1, es.totalSends());
	}

}
