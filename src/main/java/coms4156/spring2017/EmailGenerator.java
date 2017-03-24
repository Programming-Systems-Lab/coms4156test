package coms4156.spring2017;

import java.util.Random;

public class EmailGenerator {
	
	public EmailFormatter ef = new EmailFormatter();
	
	public String latestAddress = null;
	
	public static int rndInt(int min, int max) {
		Random rand = new Random();
		int ret = (rand.nextInt(max - min) + 1) + min;
		return ret;
	}
	
	public void setEmailFormatter(EmailFormatter ef) {
		this.ef = ef;
	}
	
	public String genEmail() {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 2; i++) {
			int num = rndInt(97, 122);
			char c = (char)num;
			sb.append(c);
		}
		
		for (int i = 0; i < 4; i++) {
			sb.append(rndInt(0, 9));
		}
		
		String address = sb.toString() + "@columbia.edu";
		this.latestAddress = address;
		if (this.ef.formatAndSend(address)) {
			return "Successful send to: " + this.latestAddress;
		} else {
			return "Failed to send to: " + this.latestAddress;
		}
	}
	
	public static void main(String[] args) {
		EmailGenerator eg = new EmailGenerator();
		System.out.println(eg.genEmail());
	}
}
