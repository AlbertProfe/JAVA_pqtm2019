package intro2;

public class Person {
	private String firstName;
	private String lastName;
	private int age;

	//private boolean vampireState= true;

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = 189;

	}

	public Person(String firstName, String lastName, int newAge) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = newAge;

	}

	public void becomeOlder() {
		age = age + 5;

	}
	
	public void killVampire () {
		
		age = -150;
	}
	
	//public boolean checkState () {
	//	if (this.age >0)
	//	
	//		
	//		
	//	return 
	//}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Person withFirstName(String firstName) {
		return new Person(firstName, lastName);
	}

	public Person withLastName(String lastName) {
		return new Person(firstName, lastName);
	}

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Person person = (Person) o;
		if (firstName != null ? !firstName.equals(person.firstName) : person.firstName != null) {
			return false;
		}
		if (lastName != null ? !lastName.equals(person.lastName) : person.lastName != null) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result = firstName != null ? firstName.hashCode() : 0;
		result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
		return result;
	}

	
}
