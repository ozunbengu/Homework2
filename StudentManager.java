package Homework3;

public class StudentManager extends UserManager{
	public StudentManager() {
		super();
	}
	
	@Override
	
	public void signUp(User user) {
		System.out.println("Öğrenci Üyeliği");
	}
	
	public void name (Student student) {
		System.out.println("Ad: "+ student.name);
	}
	public void suranme(Student student) {
		System.out.println("Soyad: "+ student.surname);
	}
	
	public void username(Student student) {
		System.out.println("Kullanıcı Adı: "+ student.username);
	}
	public void password(Student student) {
		System.out.println("Şifre: "+ student.password);
	}

	public void email (Student student) {
		System.out.println("Email: "+ student.email);
	}
	
	
	public void university (Student student) {
		System.out.println("Üniversite: "+ student.university);
	}
	
	public void department(Student student) {
		System.out.println("Bölüm: "+ student.department);
	}


}
