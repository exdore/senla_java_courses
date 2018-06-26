import java.util.*;

public class PatientCard{
		
		private List<Analysis> analysisHistory;
		private List<Case> visitHistory;
		private PatientInfo patientInfo;
		
		public List<Analysis> getAnalysisHistory(){
			return this.analysisHistory;
		}
		
		public void addAnalysis(Analysis item){
			this.analysisHistory.add(item);
		}
		
		public List<Case> getVisitHistory(){
			return this.visitHistory;
		}
		
		public void addVisit(Case item){
			this.visitHistory.add(item);
		}
		
		PatientCard(){
			analysisHistory = new ArrayList<Analysis>();
			visitHistory = new ArrayList<Case>();
			patientInfo = new PatientInfo();
			System.out.println(this.getClass().getName());
		}
	}