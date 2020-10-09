package exemple3;

public class Person {

	private String name;
	private int age;
	private int height;
	private int weight;
	//composition relationship
	private MyDate birthMyDate;

	public Person(String name) {
		this(name, 0); // run here the other constructor's code and set the age parameter to 0
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		this.weight = 0;
		this.height = 0;
	}
	
	public Person(String name, int height, int weigth) {
		this.name = name;
		this.age = 0;
		this.weight = weigth;
		this.height = height;
	}

	public Person(String name, int day, int month, int year) {
		this.name = name;
		this.weight = 0;
		this.height = 0;
		this.birthMyDate = new MyDate(day, month, year);
	}
	
	public Person(String name, int age, int day, int month, int year) {
		this.name = name;
		this.age = age;
		this.weight = 0;
		this.height = 0;
		this.birthMyDate = new MyDate(day, month, year);
	}

	public void printPerson() {
		System.out.println(this.name + " I am " + this.age + " years old");
	}

	public void becomeOlder() {
		this.age++;
	}

	public void becomeOlder(int years) {
		this.age = this.age + years;
	}

	public boolean isAdult() {
		if (this.age < 18) {
			return false;
		}

		return true;
	}

	public double weightIndex() {
		double heightInMeters = this.height / 100.0;

		return this.weight / (heightInMeters * heightInMeters);
	}
	
	public boolean olderThan(Person compared) {
		if (this.age > compared.age) {
			return true;
		}

		return false;
	}

	public String toString() {
		return this.name + " I am " + this.age + " years old, my weight index is " + this.weightIndex() + ", born "
				+ this.birthMyDate;
	}

	//setters and getters
	public void setHeight(int height) {
		this.height = height;
	}

	public int getHeight() {
		return this.height;
	}

	public int getWeight() {
		return this.weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getName() {
		return this.name;
	}
}