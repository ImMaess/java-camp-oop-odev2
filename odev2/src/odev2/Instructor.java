package odev2;

public class Instructor extends User{
	private String details;
	
	public Instructor() {
		
	}

	public Instructor(int id, String name, String email, String password, String details) {
		super(id, name, email, password);
		this.details = details;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}


}
