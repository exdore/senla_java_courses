import java.util.*;

public class Case{
		
		private Date visitDate;
		private String problem;
		private String cure;
		private boolean status;
		
		public Date getVisitDate(){
			return this.visitDate;
		}
		
		public void setVisitDate(Date value){
			this.visitDate = value;
		}
		
		public String getProblem(){
			return this.problem;
		}
		
		public void setProblem(String value){
			this.problem = value;
		}
		
		public String getCure(){
			return this.cure;
		}
		
		public void setCure(String value){
			this.cure = value;
		}
		
		public boolean getStatus(){
			return this.status;
		}
		
		public void setStatus(boolean value){
			this.status = value;
		}
		
		Case(){
			System.out.println(this.getClass().getName());
		}
}