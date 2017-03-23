package coms4156.spring2017;

public class Counter {
	
	private int count = 0;
	
	public synchronized void addCount() {
		count++;
	}
	
	public synchronized int getCount() {
		return count;
	}

}
