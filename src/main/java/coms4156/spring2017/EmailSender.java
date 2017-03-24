package coms4156.spring2017;

import java.util.LinkedList;

public class EmailSender {
	
	public LinkedList<Email> toSend = new LinkedList<Email>();
	
	/**
	 * Simulate the send behavior. Now just append to the list.
	 * @param mail
	 * @return
	 */
	public boolean sendMail(Email mail) {
		return this.toSend.add(mail);
	}
	
	/**
	 * Retrieve the latest send out email
	 * @return
	 */
	public Email getLatestSendMail() {
		if (toSend.size() == 0) {
			return null;
		}
		
		return toSend.getLast();
	}
	
	/**
	 * Check how many mails have been sent
	 * @return
	 */
	public int totalSends() {
		return toSend.size();
	}

}
