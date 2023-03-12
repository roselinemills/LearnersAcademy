package entity;

public class Teacher_class {
	public String teacher_id;
	public String class_id;
	
	public Teacher_class(String teacher_id, String class_id) {
		super();
		this.teacher_id = teacher_id;
		this.class_id = class_id;
	}

	public Teacher_class() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTeacher_id() {
		return teacher_id;
	}

	public void setTeacher_id(String teacher_id) {
		this.teacher_id = teacher_id;
	}

	public String getClass_id() {
		return class_id;
	}

	public void setClass_id(String class_id) {
		this.class_id = class_id;
	}
	
	
}
