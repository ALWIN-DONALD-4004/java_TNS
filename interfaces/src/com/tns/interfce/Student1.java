package com.tns.interfce;

public class Student1 {
	
	private int cid;
	private String sname;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Student1 [cid=" + cid + ", sname=" + sname + "]";
	}
	
	@Override 
	

}
