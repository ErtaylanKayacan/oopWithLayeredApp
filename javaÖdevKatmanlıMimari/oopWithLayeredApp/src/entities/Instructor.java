package entities;

public class Instructor {

	public Instructor() {
	
		
	}
	public Instructor(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.fistName =firstName;
		this.lastName = lastName;

	}
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFistName() {
		return fistName;
	}
	public void setFistName(String fistName) {
		this.fistName = fistName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	private String fistName;
	private String lastName;
	
	
}
