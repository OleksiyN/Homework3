import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Group nGroup = new Group (2);
		Student st1 = new Student (1801,"Petrov", "Vasya", true, 18);
		Student st2 = new Student (1803,"Vasichkin", "Petya", true, 17);
		Student st3 = new Student (1802,"Sidorov", "Vanya", true, 19);
		Student st4 = new Student (1810,"Ivanov", "Kolya", true, 17);
		Student st5 = new Student (1819,"Spiridonova", "Masha", false, 18);
		nGroup.add(1, st1);
		nGroup.add(2, st2);
		nGroup.add(3, st3);
		nGroup.add(4, st4);
		nGroup.add(10, st5);
		System.out.println(nGroup);
		nGroup.delete(2);
		System.out.println(nGroup);
		Student st6 = new Student (1800,"Pyatochkin", "Petro", true, 17);
		nGroup.add(11, st6);
		System.out.println(nGroup);
		Student st7 = new Student (1808,"Pyatochkina", null, false, 19);
		nGroup.add(6, st7);
		System.out.println(nGroup);
	}

}
