package entity;

public class LearnerSubject {
	private int subject_id;
	private String subject_name;
	private String class_name;
	
	public LearnerSubject(int subject_id, String subject_name, String class_name) {
		super();
		this.subject_id = subject_id;
		this.subject_name = subject_name;
		this.class_name = class_name;
	}

	public LearnerSubject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSubject_id() {
		return subject_id;
	}

	public void setSubject_id(int subject_id) {
		this.subject_id = subject_id;
	}

	public String getSubject_name() {
		return subject_name;
	}

	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}

	public String getClass_name() {
		return class_name;
	}

	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
}
