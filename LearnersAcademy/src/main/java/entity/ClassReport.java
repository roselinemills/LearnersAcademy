package entity;

public class ClassReport {
	private int class_id;
	private String class_name;
	private String class_description;
	private String subject_name;
	private String teacher_fname;
	private String teacher_lname;
	private String student_fname;
	private String student_lname;
	
	public ClassReport() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ClassReport(int class_id, String class_name, String class_description, String subject_name,
			String teacher_fname, String teacher_lname, String student_fname, String student_lname) {
		super();
		this.class_id = class_id;
		this.class_name = class_name;
		this.class_description = class_description;
		this.setSubject_name(subject_name);
		this.teacher_fname = teacher_fname;
		this.teacher_lname = teacher_lname;
		this.student_fname = student_fname;
		this.student_lname = student_lname;
	}
	public int getClass_id() {
		return class_id;
	}
	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	public String getClass_description() {
		return class_description;
	}
	public void setClass_description(String class_description) {
		this.class_description = class_description;
	}
	public String getTeacher_fname() {
		return teacher_fname;
	}
	public void setTeacher_fname(String teacher_fname) {
		this.teacher_fname = teacher_fname;
	}
	public String getTeacher_lname() {
		return teacher_lname;
	}
	public void setTeacher_lname(String teacher_lname) {
		this.teacher_lname = teacher_lname;
	}
	public String getStudent_fname() {
		return student_fname;
	}
	public void setStudent_fname(String student_fname) {
		this.student_fname = student_fname;
	}
	public String getStudent_lname() {
		return student_lname;
	}
	public void setStudent_lname(String student_lname) {
		this.student_lname = student_lname;
	}
	public String getSubject_name() {
		return subject_name;
	}
	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;
	}	
}
