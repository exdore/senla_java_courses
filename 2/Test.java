import java.util.*;
public class Test{
	
	public abstract class Info{
		
		String name;
		String id;
		Date dateOfBirth;
		String adress;
	}
	
	public class PatientInfo extends Info{
		
		Date registrationDate;
		
		PatientInfo(){
			System.out.println(getClass().getName());
		}
	}
	
	public class Doctor extends Info{
		
		String speciality;
		int room;
		
		Doctor(){
			System.out.println(getClass().getName());
		}
	}
	
	public class Case{
		
		Date visitDate;
		String problem;
		String cure;
		boolean status;
		
		Case(){
			System.out.println(getClass().getName());
		}
	}
	
	
	public class Analysis{
		
		String type;
		String additionalInfo;
		Date date;
		String result;
		
		Analysis() {
			System.out.println(getClass().getName());
		}
	}
	
	
	public class PatientCard{
		
		List<Analysis> analysisHistory;
		List<Case> visitHistory;
		PatientInfo patientInfo;
		
		PatientCard(){
			analysisHistory = new ArrayList<Analysis>();
			visitHistory = new ArrayList<Case>();
			patientInfo = new PatientInfo();
			System.out.println(getClass().getName());
		}
	}
	
	Test(){
		
		Doctor doc = new Doctor();
		PatientCard card = new PatientCard();
		card.analysisHistory.add(new Analysis());
		card.visitHistory.add(new Case());
		System.out.println(getClass().getName());
	}
	
	public static void main(String[] args)
	{
		Test test = new Test();
	}
}