package coms4156.spring2017;

import java.util.LinkedList;

public class EmailSender {
	
	public LinkedList<Email> toSend = new LinkedList<Email>();
	
	public boolean sendMail(Email mail) {
		return this.toSend.add(mail);
	}
	
	public Email getLatestSendMail() {
		if (toSend.size() == 0) {
			return null;
		}
		
		return toSend.getLast();
	}
	
	public int totalSends() {
		return toSend.size();
	}

}
