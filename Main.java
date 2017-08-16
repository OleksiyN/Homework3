import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Group nGroup = new Group(2);
		Student st1 = new Student(1801, "Usama", "Ben", true, 18);
		Student st2 = new Student(1803, "Vasichkin", "Petya", true, 17);
		Student st3 = new Student(1802, "Sidorov", "Vanya", true, 19);
		Student st4 = new Student(1810, "Ivanov", "Petya", true, 17);
		Student st5 = new Student(1819, "Spiridonova", "Masha", false, 18);
		Student st6 = new Student(1800, "Pyatochkin", "Petro", true, 17);
		Student st7 = new Student(1800, "Kuchma", "Lyona", true, 17);
		Student st8 = new Student(1800, "Kravchuk", "Lyona", true, 18);
		Student st9 = new Student(1800, "Petrov", "Vasya", true, 18);
		Student st10 = new Student(1800, "Ivanov", "Yura", true, 17);
		nGroup.add(1, st1);
		nGroup.add(2, st2);
		nGroup.add(3, st3);
		nGroup.add(4, st4);
		nGroup.add(5, st5);
		nGroup.add(5, st6); //добавление нового стуента в строку с существующим
		nGroup.add(6, st6);
		System.out.println(nGroup);
		System.out.println();
		//nGroup.delByPosition(2); //удаление по номеру
		//System.out.println(nGroup);
		//System.out.println();
		Student st11 = new Student(1804, "Alibabay", "Alibaba", true, 17); 
		nGroup.add(11, st11);//добавление студента на позицию за пределами массива
		System.out.println();
		Student st12 = new Student(1808, "Pyatochkina", null, false, 19);
		nGroup.add(6, st12);//добавление студента без имени
		System.out.println();
		Student st13 = new Student(1807, null, "Petro", true, 18);
		nGroup.add(7, st13);//добавление студента без фамилии
		System.out.println();
		//nGroup.delByPosition(11);//удаление по номеру
		//System.out.println();
		nGroup.add(7, st7);
		nGroup.add(8, st8);
		nGroup.add(9, st9);
		nGroup.add(10, st10);
		nGroup.add(2, st2);
		System.out.println(nGroup);
		System.out.println();
		nGroup.delByLastnameAndName("Ivanov", "Petya"); //удаление по фамилии и имени
		System.out.println(nGroup);
		System.out.println();
		System.out.println(nGroup.searchByLastname("Ivanov"));//поиск по фамилии*/
	}

}
