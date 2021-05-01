package Homework3;

public class User {
	
	int id;
	String name;
	String surname;
	String email;
	String username;
	String password;
	
	public User(int id,String name, String surname, String email,String username, String password ) {
		super();
		this.id=id;
		this.name=name;
		this.surname=surname;
		this.email=email;
		this.username=username;
		this.password=password;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
