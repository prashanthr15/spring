package com.prog.dao;

public class CourseInfo {

	private Integer cid;
	private String cname;
	
	
	public CourseInfo() {
		System.out.println("course info zero param constructor");
	}
	
	public CourseInfo(Integer cid,String cname) {

		this.cid=cid;
		this.cname=cname;
	}

	public Integer getCid() {
		return cid;
	}

	public String getCname() {
		return cname;
	}

	@Override
	public String toString() {
		return "CourseInfo [cid=" + cid + ", cname=" + cname + "]";
	}
	
	
	
	
	
}
