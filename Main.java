package Homework3;

public class Main {

	public static void main(String[] args) {
		
		Student student=new Student(1,"Beng�","Ercan","benguercannn@gmail.com", "ozunbengu", "abcd", "K�r�kkale �niversitesi", "Bilgisayar M�hendisli�i" );
		
		Student student2= new Student(2,"Berkay", "Canyurt", "deneme@gmail.com", "berkayy", "adefrgf", "Ankara �niversitesi", "Bilgisayar M�hendisli�i");
		
		Instructor �nstructor=new Instructor(1, "Engin", "Demiro�", "engindemirog@gmail.com", "enginhoca", "wehgk", "M�hendislik Fak�ltesi","Bilgisayar M�hendisli�i");
		
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
		
		InstructorManager �nstructorManager =new InstructorManager();
		�nstructorManager.signUp(�nstructor);
		�nstructorManager.name(�nstructor);
		�nstructorManager.suranme(�nstructor);
		�nstructorManager.email(�nstructor);
		�nstructorManager.username(�nstructor);
		�nstructorManager.password(�nstructor);
		�nstructorManager.faculty(�nstructor);
		�nstructorManager.department(�nstructor);
		
		
		

	}

}
