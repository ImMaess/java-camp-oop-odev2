package odev2;

public class Main {

	public static void main(String[] args) {
		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setName("Engin Demiroğ");
		instructor1.setEmail("engindemirog@gmail.com");
		instructor1.setPassword("12345");
		instructor1.setDetails("Üniversite hayatıma ÖSS 2003 Türkiye derecesiyle başladım...");
		
		Student student1 = new Student();
		student1.setId(2);
		student1.setName("Mustafa Yiğit Coşkun");
		student1.setEmail("maessmustafa@gmail.com");
		student1.setPassword("mustafa123");
		student1.setCompletingPercentage(49);
		
		User[] users = {
				student1,
				instructor1
		};
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		
		
		UserManager userManager = new UserManager();
		userManager.addMultiple(users);
	}

}
