package Homework3;

public class InstructorManager extends UserManager{
	public InstructorManager() {
		super();
	}
	
	@Override
	
	public void signUp(User user) {
		System.out.println("E�itmen �yeli�i");
	}
	public void name (Instructor �nstructor) {
		System.out.println("Ad: "+ �nstructor.name);
	}
	public void suranme(Instructor �nstructor) {
		System.out.println("Soyad: "+ �nstructor.surname);
	}
	
	public void username(Instructor �nstructor) {
		System.out.println("Kullan�c� Ad�: "+ �nstructor.username);
	}
	public void password(Instructor �nstructor) {
		System.out.println("�ifre: "+ �nstructor.password);
	}

	public void email (Instructor �nstructor) {
		System.out.println("Email: "+ �nstructor.email);
	}
	
	public void faculty(Instructor �nstructor) {
		System.out.println("Fak�lte: "+ �nstructor.faculty);
		
	}
	public void department(Instructor �nstructor) {
		System.out.println("B�l�m: "+ �nstructor.department);
	}
	
}
