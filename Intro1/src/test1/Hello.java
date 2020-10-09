package test1;

import java.util.ArrayList;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello class, welcome to java world ... :-)");
		//tag to object
		Person luis;
		luis = new Person("Luis", "Gasol", 35);
		
		//Person tony = new Person();
		
		System.out.println(luis);
		
		System.out.println(luis.hashCode());
		
		luis.setAge(456);
		System.out.println(luis);
		
		int earthAge = luis.getAge() -400;
		System.out.println(luis +" but at earth, this guy will have ---  "  + earthAge);
		
		
		Person natalia = new Person("Natalia", "Gasol", -9);
		
		System.out.println("ID-"+natalia.hashCode());
		
		System.out.println(natalia.getFirstName().substring(2)+"ID-"+natalia.hashCode()+"@gmail.com");
		
		ArrayList<Person> people = new ArrayList<Person>();
		
		people.add(luis);
		people.add(natalia);
		
		System.out.println(people);
		
		people.get(0);
		
		System.out.println("---------------------------------------------");
		
		luis = null;
		
		System.out.println(luis);
		
		//luis.studyJava();
		
		luis = natalia;
		
		System.out.println(luis.studyJava());
		
		
		luis = new Person ("Jhon", "Smith", 15);
		System.out.println(luis);
		
		
		Dog boby = new Dog ("Boby", 1);
		
		luis.setDog(boby);
		
		System.out.println(luis);
		
		
		
		
		
		
	}

}
