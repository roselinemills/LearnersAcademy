package entity;
public class LearnerClass {
	private int class_id;
	private String class_name;
	private String class_description;
	private int subject_id;
	private String subject_name;
	
	public LearnerClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LearnerClass(int class_id, String class_name,String class_description,String subject_name) {
		super();
		this.class_id = class_id;
		this.class_name = class_name;
		this.class_description = class_description;
		this.subject_name = subject_name;
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
	
	public void setClass_description(String class_description) {
		this.class_description = class_description;		
	}
	
	public String getClass_description() {
		return class_description;
	}
	public int getSubject_id() {
		return subject_id;
	}
	public void setSubject_id(int subject_id) {
		this.subject_id = subject_id;
	}
	public void setSubject_name(String subject_name) {
		this.subject_name = subject_name;		
	}
	public String getSubject_name() {
		return subject_name;		
	}
	
}
