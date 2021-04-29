package odev2;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getName() + " başarıyla eklendi!");
	}
	public void remove(User user) {
		System.out.println(user.getName() + " başarıyla kaldırıldı!");
	}
	public void addMultiple(User[] users) {
		for (User user: users) {
			add(user);
		}
	}
}
