package project2.customer;

public class Customer {

	 private int cid;
	 private String cname;
	 private String address;
	 private String city;
	 
	public int getCid() {
		return cid;
	}
	
	public void setCid(int cid) {
		this.cid = cid;
	}
	
	public String getCname() {
		return cname;
	}
	
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "cid =" + cid + "\ncname=" + cname + "\naddress=" + address + "\ncity=" + city + "\n";
	}
	  
}
