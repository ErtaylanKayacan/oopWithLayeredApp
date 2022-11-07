package entities;

public class Course {
	
 public Course() {
	// TODO Auto-generated constructor stub
		
	}
	public Course(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	private int price;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String name;
	private int id;

}
