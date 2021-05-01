package Homework3;

public class InstructorManager extends UserManager{
	public InstructorManager() {
		super();
	}
	
	@Override
	
	public void signUp(User user) {
		System.out.println("Eðitmen Üyeliði");
	}
	public void name (Instructor ýnstructor) {
		System.out.println("Ad: "+ ýnstructor.name);
	}
	public void suranme(Instructor ýnstructor) {
		System.out.println("Soyad: "+ ýnstructor.surname);
	}
	
	public void username(Instructor ýnstructor) {
		System.out.println("Kullanýcý Adý: "+ ýnstructor.username);
	}
	public void password(Instructor ýnstructor) {
		System.out.println("Þifre: "+ ýnstructor.password);
	}

	public void email (Instructor ýnstructor) {
		System.out.println("Email: "+ ýnstructor.email);
	}
	
	public void faculty(Instructor ýnstructor) {
		System.out.println("Fakülte: "+ ýnstructor.faculty);
		
	}
	public void department(Instructor ýnstructor) {
		System.out.println("Bölüm: "+ ýnstructor.department);
	}
	
}
