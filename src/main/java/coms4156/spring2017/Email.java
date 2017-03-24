package coms4156.spring2017;

public class Email {
	
	public String address;
	
	public String title;
	
	public String contents;
	
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Email)) {
			return false;
		}
		
		Email tmp = (Email)o;
		if (!this.address.equals(tmp.address)) {
			return false;
		}
		
		if (!this.title.equals(tmp.title)) {
			return false;
		}
		
		if (!this.contents.equals(tmp.contents)) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public int hashCode() {
		int ret = 17;
		ret = 31 * 17 + this.address.hashCode();
		ret = 31 * 17 + this.title.hashCode();
		ret = 31 * 17 + this.contents.hashCode();
		return ret;
	}

}
