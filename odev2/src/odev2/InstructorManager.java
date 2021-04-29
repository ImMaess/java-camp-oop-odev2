package odev2;

public class InstructorManager extends UserManager{
	public void add(User user) {
		System.out.println(user.getName() + " başarıyla eklendi!");
	}
	public void remove(User user) {
		System.out.println(user.getName() + " başarıyla kaldırıldı!");
	}
}
