import java.util.Arrays;

public class Group extends Student {
	
	private Student[] group = new Student[10];
	private int number;
	
	public Group(int number) {
		super();
		this.number = number;
	}
	public Group() {
		super();
	}

	public Student[] getGroup() {
		return group;
	}

	public void setGroup(Student[] group) {
		this.group = group;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void add(int position, Student a) {
		try {
			if (a.getLastname() == null || a.getName() == null) throw new IllegalArgumentException();
			else group[position-1] = a;
		}
		catch (IllegalArgumentException e){
			if (a.getLastname() == null) System.out.println("Field 'Lastname' can't be empty in the line " + position);
			else System.out.println("Field 'Name' can't be empty in the line " + position);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Illegal position number");
		}
	}
	public void delete(int position) {
		try {
			if (position - 1 >= 0 && position - 1 < group.length && group[position - 1] != null) group[position-1] = null;
			else throw new ArrayIndexOutOfBoundsException();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Illegal position number");
		}
	}
	
	@Override
	public String toString() {
		//return compareTo();
		return "Group number " + number + Arrays.toString(group);
	}

}
