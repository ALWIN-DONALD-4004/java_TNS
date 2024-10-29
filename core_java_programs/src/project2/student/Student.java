package project2.student;

public class Student {
	
	private String sid;
	private String sname;
	private String course;
	private String stream;
	private String gradyear;
	private String mobno;
	
	
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public String getGradyear() {
		return gradyear;
	}
	public void setGradyear(String gradyear) {
		this.gradyear = gradyear;
	}
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	
	@Override
	public String toString() {
		return "ID" + sid + "\nsname=" + sname + "\ncourse=" + course + "\nstream=" + stream + "\ngradyear="
				+ gradyear + "\nmobno=" + mobno + "\n";
	}
	

}
