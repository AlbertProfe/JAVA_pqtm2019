package intro2;

import java.util.ArrayList;

public class Student extends Person {

	public String name;
	public int age;
	public Car car;
	//1 elegant
	public ArrayList<Book> books;
	//2 completa
	//public ArrayList<Book> books = new ArrayList<Book>();
	
	

	public Student(String name, int age) {
		super(name, name);
		this.name = name;
		this.age = age;
		//1 elegant
		this.books = new ArrayList<Book>();
	}
	
	public Student(String name, int age, ArrayList<Book> bookstoAdd ) {
		super(name, name);
		this.name = name;
		this.age = age;
		//3
		//this.books = new ArrayList<Book>();
		this.books = bookstoAdd;
	}
	
	
	
	
	
	
	
	
	
	public void addBook (Book booktoaddtoarray) {
		this.books.add(booktoaddtoarray);		
	}
	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
