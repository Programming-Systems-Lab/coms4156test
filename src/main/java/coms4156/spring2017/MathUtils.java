package coms4156.spring2017;

public class MathUtils {
	
	public static boolean isOverflow(long result) {
		if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Add function
	 * @param i
	 * @param j
	 * @return
	 */
	public static int add(int i, int j, Counter c) {
		long result = ((long)i) + j;
		if (isOverflow(result)) {
			throw new RuntimeException("Result overflow");
		}
		c.addCount();
		return (int)result;
	}
	
	/**
	 * Sub function
	 * @param i
	 * @param j
	 * @return
	 */
	public static int sub(int i, int j, Counter c) {
		long result = ((long)i) - j;
		if (isOverflow(result)) {
			throw new RuntimeException("Result overflow");
		}
		c.addCount();
		return (int)result;
	}
	
	public static void main(String[] args) {
		Counter c = new Counter();
		add(5, 6, c);
	}
}
