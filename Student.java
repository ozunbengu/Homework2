package Homework3;

public class Student extends User {
	String university;
	String department;
	
	
	public Student(int id, String name, String surname,String email, String username, String password, String universty, String department) {
		super(id,name,surname,email,username,password);
		this.university=universty;
		this.department= department;
		
	}
	
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	
	

}
