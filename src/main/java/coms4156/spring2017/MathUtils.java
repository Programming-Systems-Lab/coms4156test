package coms4156.spring2017;

public class MathUtils {
	
	public static boolean isOverflow(long result) {
		if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
			return true;
		} else {
			return false;
		}
	}
	
	public static int add(int i, int j) {
		long result = ((long)i) + j;
		if (isOverflow(result)) {
			throw new RuntimeException("Result overflow");
		}
		return (int)result;
	}
	
	public static int sub(int i, int j) {
		long result = ((long)i) - j;
		if (isOverflow(result)) {
			throw new RuntimeException("Result overflow");
		}
		return (int)result;
	}
	
	public static void main(String[] args) {
		add(5, 6);
	}
}
