package Homework3;

public class Instructor extends User {
	String faculty;
	String department;
	
	public Instructor (int id, String name, String surname,String email, String username, String password, String faculty, String department ) {
		super(id,name,surname,email,username, password);
		this.faculty=faculty;
		this.department=department;
		
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String episode) {
		this.department=department;
	}

}
