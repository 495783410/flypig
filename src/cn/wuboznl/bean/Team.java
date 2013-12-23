package cn.wuboznl.bean;

import java.util.HashMap;
import java.util.Map;

public class Team {
	private String id;
	private String name;
	private Map  students=new HashMap();
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map getStudents() {
		return students;
	}
	public void setStudents(Map students) {
		this.students = students;
	}
	
	
	

}
