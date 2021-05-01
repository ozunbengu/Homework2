package Homework3;

public class Main {

	public static void main(String[] args) {
		
		Student student=new Student(1,"Bengü","Ercan","benguercannn@gmail.com", "ozunbengu", "abcd", "Kırıkkale Üniversitesi", "Bilgisayar Mühendisliği" );
		
		Student student2= new Student(2,"Berkay", "Canyurt", "deneme@gmail.com", "berkayy", "adefrgf", "Ankara Üniversitesi", "Bilgisayar Mühendisliği");
		
		Instructor ınstructor=new Instructor(1, "Engin", "Demiroğ", "engindemirog@gmail.com", "enginhoca", "wehgk", "Mühendislik Fakültesi","Bilgisayar Mühendisliği");
		
		UserManager userManager=new UserManager();
		userManager.userLogin(student);
		userManager.signUp(null);
		
		
		StudentManager studentManager=new StudentManager();
		
		studentManager.signUp(student);
		studentManager.name(student);
		studentManager.suranme(student);
		studentManager.email(student);
		studentManager.username(student);
		studentManager.password(student);
		studentManager.university(student);
		studentManager.department(student);
		
		studentManager.signUp(student2);
		studentManager.name(student2);
		studentManager.suranme(student2);
		studentManager.email(student2);
		studentManager.username(student2);
		studentManager.password(student2);
		studentManager.university(student2);
		studentManager.department(student2);
		
		InstructorManager ınstructorManager =new InstructorManager();
		ınstructorManager.signUp(ınstructor);
		ınstructorManager.name(ınstructor);
		ınstructorManager.suranme(ınstructor);
		ınstructorManager.email(ınstructor);
		ınstructorManager.username(ınstructor);
		ınstructorManager.password(ınstructor);
		ınstructorManager.faculty(ınstructor);
		ınstructorManager.department(ınstructor);
		
		
		

	}

}
