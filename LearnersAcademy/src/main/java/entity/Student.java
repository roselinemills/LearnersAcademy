package entity;

public class Student {
	private int student_id;
	private String first_name;
	private String last_name;
	private String phone_number;
	private String email;
	private String learner_class;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int student_id, String first_name, String last_name, String phone_number, String email,String learner_class) {
		super();
		this.student_id = student_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.phone_number = phone_number;
		this.email = email;
		this.learner_class = learner_class;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getLearner_class() {
		return learner_class;
	}

	public void setLearner_class(String learner_class) {
		this.learner_class = learner_class;
	}
	
}
