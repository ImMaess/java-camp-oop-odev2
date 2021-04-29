package odev2;

public class Student extends User {
	int completingPercentage;
	
	public Student() {
		
	}

	public Student(int id, String name, String email, String password, int completingPercentage) {
		super(id, name, email, password);
		this.completingPercentage = completingPercentage;
	}

	public int getCompletingPercentage() {
		return completingPercentage;
	}

	public void setCompletingPercentage(int completingPercentage) {
		this.completingPercentage = completingPercentage;
	}

}
