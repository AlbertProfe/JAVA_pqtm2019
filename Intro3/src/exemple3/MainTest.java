package exemple3;

import java.util.ArrayList;

public class MainTest {

	public static void main(String[] args) {
		
		ArrayList<Clinic> clinicList = new ArrayList<Clinic>();
		ArrayList<Person> peopleHighestWeightIndex = new ArrayList<Person>();
		
		
		Clinic quiron = new Clinic("Clinica Quiron, Gent Sana SA", 20);
		Clinic tecknon = new Clinic("Clinica Tecknon, Gent Encara Mes Sana SAA", 18);
		
		//System.out.println(quiron);
		//System.out.println(tecknon);
		
		clinicList.add(quiron);
		clinicList.add(tecknon);
		
		
		Person natalia = new Person("Natalia", 180, 20);
		Person luis = new Person("Luis", 150, 150);
		Person sebastia = new Person("Sebastia", 190, 100);
		Person laia = new Person("Laia", 170, 60);
		

		//System.out.println(natalia);
		//System.out.println(luis);
		//System.out.println(sebastia);
		//System.out.println(laia);
		
		quiron.addAsMember(natalia);
		quiron.addAsMember(luis);
		quiron.addAsMember(sebastia);
		quiron.addAsMember(laia);
		tecknon.addAsMember(sebastia);
		
		quiron.addAsMember(new Person("Joao", 180, 90));
		
		
		
		System.out.println("");
		for (Clinic clinicToPrint : clinicList) {
			
			clinicToPrint.setLowestWeightIndex(clinicToPrint.getLowestWeightIndex()+1);
			System.out.println(clinicToPrint);
			
		}
		
		//System.out.println("Person with HWI: " + quiron.personWithHighestWeightIndex().getName()
		//		+" (" + quiron.getName()+ ")");
		
		
		for ( Clinic clinicToAskHWI  : clinicList ) {
			
			peopleHighestWeightIndex.add(clinicToAskHWI.personWithHighestWeightIndex());
			System.out.println("Person with HWI: " + clinicToAskHWI.personWithHighestWeightIndex().getName()
					+" (" + clinicToAskHWI.getName()+ ")");
			
		}
		
		

	}

}
