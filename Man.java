
public class Man {
	private boolean sex;
	private int age;
	private double weight;
	private double height;

	public Man(boolean sex, int age, double weight, double height) {
		super();
		this.sex = sex;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	public Man(boolean sex, int age) {
		super();
		this.sex = sex;
		this.age = age;
	}
	public Man() {
		super();

	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return ", sex=" + sex + ", age=" + age + "]";
	}

}
