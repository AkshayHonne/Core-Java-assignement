import java.util.ArrayList;

public class Employee {

	
	int id;
	private String Name;
	private String address;
	private int sal;
	public Employee(int id, String name, String address, int sal) {
		this.id = id;
		this.Name = name;
		this.address = address;
		this.sal = sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	
	
	
}
