package exemple3;

import java.util.ArrayList;

public class Clinic {

	private double lowestWeightIndex;
	private String name;
	private ArrayList<Person> members;

	public Clinic(String name, double lowestWeightIndex) {
		this.lowestWeightIndex = lowestWeightIndex;
		this.name = name;
		this.members = new ArrayList<Person>();
	}

	public boolean isAccepted(Person person) {
		if (person.weightIndex() < this.lowestWeightIndex) {
			return false;
		}

		return true;
	}

	public void addAsMember(Person person) {
		if (!isAccepted(person)) { // same as isAccepted(person) == false
			System.out.println(person.getName() + " has been rejected! :-(  ");
			return;
		}
		
		// this > the particular clinic that invokes this method -isAccepted-
		// members > field of Clinic, besides it is an ARRAYLIST
		// AS mmebers is an ARRAYLIST it CAN invoke METHOD ADD
		// parameter send PERSON
		// SO person WILL ADD to particular -THIS- CLINIC
		this.members.add(person);
	}

	public Person personWithHighestWeightIndex() {
		// if members list is empty, we'll return null-reference
		if (this.members.isEmpty()) {
			return null;
		}

		Person heaviestSoFar = this.members.get(0);

		for (Person person : this.members) {
			if (person.weightIndex() > heaviestSoFar.weightIndex()) {
				heaviestSoFar = person;
			}
		}

		return heaviestSoFar;
	}

	public String toString() {
		String membersAsString = "";

		for (Person member : this.members) {
			membersAsString += "  " + member + "\n";
		}

		return "Clinic:\n " + this.name + " (" + this.lowestWeightIndex +  ") " + "  \n members: \n" + membersAsString;
	}

	//getters and setters
	public double getLowestWeightIndex() {
		return lowestWeightIndex;
	}

	public void setLowestWeightIndex(double lowestWeightIndex) {
		this.lowestWeightIndex = lowestWeightIndex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Person> getMembers() {
		return members;
	}

	public void setMembers(ArrayList<Person> members) {
		this.members = members;
	}

}
