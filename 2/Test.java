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
			System.out.println("PatientInfo created");
		}
	}
	
	public class Doctor extends Info{
		
		String speciality;
		int room;
		
		Doctor(){
			System.out.println("Doctor created");
		}
	}
	
	public class Case{
		
		Date visitDate;
		String problem;
		String cure;
		boolean status;
		
		Case(){
			System.out.println("Case created");
		}
	}
	
	
	public class Analysis{
		
		String type;
		String additionalInfo;
		Date date;
		String result;
		
		Analysis() {
			System.out.println("Analysis created");
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
			System.out.println("Empty PatientCard created");
		}
	}
	
	Test(){
		
		Doctor doc = new Doctor();
		PatientCard card = new PatientCard();
		card.analysisHistory.add(new Analysis());
		card.visitHistory.add(new Case());
		System.out.println("Tested");
	}
	
	public static void main(String[] args)
	{
		Test test = new Test();
	}
}