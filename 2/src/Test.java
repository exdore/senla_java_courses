public class Test{
		
	Test(){
		
		Doctor doc = new Doctor();
		PatientCard card = new PatientCard();
		card.addAnalysis(new Analysis());
		card.addVisit(new Case());
		System.out.println(this.getClass().getName());
	}
	
	public static void main(String[] args)
	{
		Test test = new Test();
	}
}