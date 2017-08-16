import java.util.Arrays;

public class Group extends Student {

	private Student[] arrStudents = new Student[10];
	private int number;

	public Group(int number) {
		super();
		this.number = number;
	}

	public Group() {
		super();
	}

	public Student[] getGroup() {
		return arrStudents;
	}

	public void setGroup(Student[] arrStudents) {
		this.arrStudents = arrStudents;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void add(int position,Student a) {
		try {
			if (a.getLastname() != null && a.getName() != null) {
				if (arrStudents[position-1] == null)
					arrStudents[position-1] = a;
				else
					throw new StringFullException();
			} else
				throw new IllegalArgumentException();
		} catch (IllegalArgumentException e) {
			if (a.getLastname() == null)
				System.out.println("Field 'Lastname' can't be empty in the line " + position);
			else
				System.out.println("Field 'Name' can't be empty in the line " + position);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Illegal position number");
		} catch (StringFullException e) {
			System.out.println(e.getMessage());
		}
	}

	public void delByPosition(int position) {
		try {
			if (position - 1 >= 0 && position - 1 < arrStudents.length && arrStudents[position - 1] != null) {
				arrStudents[position - 1] = null;
				sort();
			} else
				throw new IndexOutStudentsException();
		} catch (IndexOutStudentsException e) {
			System.out.println(e.getMessage());
		}
	}

	public void delByLastnameAndName(String a, String b) {
		try {
			for (int i = 0; i < arrStudents.length; i++) {
				if (a.compareTo(arrStudents[i].getLastname()) == 0 && b.compareTo(arrStudents[i].getName()) == 0
						&& a != null && b != null) {
					arrStudents[i] = null;
					sort();
					return;
				} else {
					if ((i + 1) == arrStudents.length)
						throw new NotFoundStudentException();
				}
			}
		} catch (NotFoundStudentException e) {
			System.out.println(e.getMessage());
		}
	}

	public Student searchByLastname(String lastname) {
		for (Student student : arrStudents) {
			if (student != null && (student.getLastname()).equals(lastname)) {
				return student;
			}
		}
		return null;
	}

	private int compareStudent(Student a, Student b) {
		if (a != null && b == null) {
			return 1;
		}
		if (a == null && b != null) {
			return -1;
		}
		if (a == null && b == null) {
			return 0;
		}
		return a.getLastname().compareTo(b.getLastname());

	}

	private void sort() {
		for (int i = 0; i < arrStudents.length - 1; i++) {
			for (int j = i + 1; j < arrStudents.length; j++) {
				if (compareStudent(arrStudents[i], arrStudents[j]) > 0) {
					Student temp = arrStudents[i];
					arrStudents[i] = arrStudents[j];
					arrStudents[j] = temp;
				}
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		int i = 0;
		for (Student student : arrStudents) {
			if (student != null) {
				sb.append((++i) + ") ").append(student);
				sb.append(System.lineSeparator());
			}
		}
		return sb.toString();
		// return "Group number " + number + Arrays.toString(group);
	}

}
