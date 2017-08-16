
public class Student extends Man{
	
	private String lastname;
	private String name;
	private int id;
	
	public Student (int id, String lastname, String name, boolean sex, int age) {
		super(sex, age);
		this.id = id;
		this.lastname = lastname;
		this.name = name;
	}
	public Student() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return id;
	}

	public void setNumber(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return " [lastname=" + lastname + ", name=" + name + ", student's id=" + id + super.toString();
	}
	
}
